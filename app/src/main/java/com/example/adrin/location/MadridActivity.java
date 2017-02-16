package com.example.adrin.location;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.maps.model.LatLng;

import java.util.Random;

public class MadridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intento);



        final double[] coord = new double[]{40.2459,  -3.4209};


        EuropeActivity.score = 500;
        int min =1;
        int max =3;

        Random r = new Random();
        int number = r.nextInt(max - min+1)+min;
        final String result = String.valueOf(number);

        final ImageView foto = (ImageView) findViewById(R.id.fotosMadrid);

        final Bitmap madrid1 = BitmapFactory.decodeResource(getResources(), R.mipmap.madrid1);
        final Bitmap madrid2 = BitmapFactory.decodeResource(getResources(), R.mipmap.madrid2);
        final Bitmap madrid3 = BitmapFactory.decodeResource(getResources(), R.mipmap.madrid3);
        final Bitmap madrid4 = BitmapFactory.decodeResource(getResources(), R.mipmap.madrid4);
        final Bitmap madrid5 = BitmapFactory.decodeResource(getResources(), R.mipmap.madrid5);
        final Bitmap madrid6 = BitmapFactory.decodeResource(getResources(), R.mipmap.madrid6);
        final Bitmap madrid7 = BitmapFactory.decodeResource(getResources(), R.mipmap.madrid7);
        final Bitmap madrid8 = BitmapFactory.decodeResource(getResources(), R.mipmap.madrid8);


        Button otra = (Button) findViewById(R.id.otraBoton);
        Button resuelvo = (Button) findViewById(R.id.resulevoBoton);
        final EditText respuesta = (EditText) findViewById(R.id.respuesta);

        foto.setImageBitmap(madrid7);

        otra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EuropeActivity.score -= 25;
                int min =1;
                int max =8;

                Random r = new Random();
                int number = r.nextInt(max - min+1)+min;
                final String result = String.valueOf(number);

                if (result.equals("1")) {

                    foto.setImageBitmap(madrid1);

                }else if (result.equals("2")) {

                    foto.setImageBitmap(madrid2);

                }else if (result.equals("3")) {

                    foto.setImageBitmap(madrid3);

                }else if (result.equals("4")) {

                    foto.setImageBitmap(madrid4);

                }else if (result.equals("5")) {

                    foto.setImageBitmap(madrid5);

                }else if (result.equals("6")) {

                    foto.setImageBitmap(madrid6);

                }else if (result.equals("7")) {

                    foto.setImageBitmap(madrid7);

                }else if (result.equals("8")) {

                    foto.setImageBitmap(madrid8);

                }else{
                    System.out.println("ERROR");
                }
            }
        });

        final double[] coord2 = new double[]{40.2459,  -3.4209};

        resuelvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              /**  String resp = respuesta.getText().toString();

                if ("Madrid".equals(resp)){
                    Intent reg = new Intent(MadridActivity.this, CorrectoActivity.class);
                    startActivity(reg);
                }else {
                    Toast.makeText(getApplicationContext(), "Respuesta Incorrecta, ¡vuelve a intentarlo!", Toast.LENGTH_SHORT).show();
                }**/

               // intent.putExtra("myarray", array);
                //startActivity(intent);

                Intent reg = new Intent(MadridActivity.this, MapsActivity.class);
                Bundle b = new Bundle();

                b.putSerializable("coordenadas", coord);
                startActivity(reg);


            }
        });

    }
}
