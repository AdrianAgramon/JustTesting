package com.example.adrin.location;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.icu.text.DecimalFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.RequiresApi;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.vision.text.Text;


public class MapsActivity extends FragmentActivity implements
        OnMapReadyCallback, GoogleMap.OnMapClickListener {

    final LatLng start = new LatLng(45.7484600, 4.8467100);
    LatLng objetivo = new LatLng(0, 0);
    LatLng Marker2 = new LatLng(0, 0);
    int i = 1;
    private GoogleMap mapa;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment)
                getSupportFragmentManager().findFragmentById(R.id.mapa);
        mapFragment.getMapAsync(this);


        final int partidas = getIntent().getExtras().getInt("Partidas");
        final double[] coord = getIntent().getExtras().getDoubleArray("coord");
        final int[] score = {getIntent().getExtras().getInt("Score")};

        objetivo = new LatLng(coord[0],coord[1]);


        final Button botonDist = (Button) findViewById(R.id.resolver);
        final TextView dist= (TextView) findViewById(R.id.distanciaText);

        botonDist.setOnClickListener(new View.OnClickListener() {



            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {



                int  distancia = (int) CalculationByDistance(objetivo, Marker2);

                PolylineOptions line = new PolylineOptions().add(objetivo, Marker2)

                        .width(5).color(Color.YELLOW);

                mapa.addPolyline(line);


                mapa.addMarker(new MarkerOptions().position(objetivo)
                        .icon(BitmapDescriptorFactory
                                .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

               // dist.setText(" "+distancia);

                ValueAnimator animator = new ValueAnimator();
                animator.setObjectValues(0, distancia);
                animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator animation) {
                        dist.setText(String.valueOf(animation.getAnimatedValue()));
                    }
                });
                animator.setEvaluator(new TypeEvaluator<Integer>() {
                    public Integer evaluate(float fraction, Integer startValue, Integer endValue) {
                        return Math.round(startValue + (endValue - startValue) * fraction);
                    }
                });
                animator.setDuration(1000);
                animator.start();

                score[0] = distancia;

                new CountDownTimer(1500, 1000) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {


                        Intent reg = new Intent(MapsActivity.this, CorrectoActivity.class);
                        reg.putExtra("score", score[0]);
                        reg.putExtra("Partidas", partidas);

                        startActivity(reg);

                    }

                }.start();
            }
        });
    }

    @Override public void onMapReady(GoogleMap googleMap) {
        mapa = googleMap;
        mapa.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        mapa.moveCamera(CameraUpdateFactory.newLatLngZoom(start, 3));
        mapa.setOnMapClickListener(this);
        mapa.getUiSettings().setMapToolbarEnabled(false);
        if (ContextCompat.checkSelfPermission(this,
                android.Manifest.permission.ACCESS_FINE_LOCATION) ==
                PackageManager.PERMISSION_GRANTED) {
            mapa.setMyLocationEnabled(true);
            mapa.getUiSettings().setZoomControlsEnabled(true);
            mapa.getUiSettings().setCompassEnabled(false);

        }

    }

//    public void moveCamera(View view) {
//        mapa.moveCamera(CameraUpdateFactory.newLatLng(objetivo));
//    }
//
//    public void animateCamera(View view) {
//        if (mapa.getMyLocation() != null)
//            mapa.animateCamera(CameraUpdateFactory.newLatLngZoom(
//                    new LatLng(mapa.getMyLocation().getLatitude(),
//                            mapa.getMyLocation().getLongitude()), 15));
//    }
//
//    public void addMarker(View view) {
//        mapa.addMarker(new MarkerOptions().position(
//                mapa.getCameraPosition().target));
//    }

    @Override public void onMapClick(LatLng puntoPulsado) {


        mapa.clear();

        Marker mark = mapa.addMarker(new MarkerOptions().position(puntoPulsado)
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));



        final LatLng Marcador1 = new LatLng( puntoPulsado.latitude , puntoPulsado.longitude);
        Marker2=Marcador1;





    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public double CalculationByDistance(LatLng StartP, LatLng EndP) {
        int Radius = 6371;// radius of earth in Km
        double lat1 = StartP.latitude;
        double lat2 = EndP.latitude;
        double lon1 = StartP.longitude;
        double lon2 = EndP.longitude;
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(Math.toRadians(lat1))
                * Math.cos(Math.toRadians(lat2)) * Math.sin(dLon / 2)
                * Math.sin(dLon / 2);
        double c = 2 * Math.asin(Math.sqrt(a));
        double valueResult = Radius * c;
        double km = valueResult / 1;
        DecimalFormat newFormat = new DecimalFormat("####");
        int kmInDec = Integer.valueOf(newFormat.format(km));
        double meter = valueResult % 1000;
        int meterInDec = Integer.valueOf(newFormat.format(meter));
        Log.i("Radius Value", "" + valueResult + "   KM  " + kmInDec
                + " Meter   " + meterInDec);

        return Radius * c;
    }
}