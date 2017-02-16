package com.example.adrin.location;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Random;

public class BerlinActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    public static int resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intento);


        EuropeActivity.score = 500;
        int min = 1;
        int max = 3;

        Random r = new Random();
        int number = r.nextInt(max - min + 1) + min;
        final String result = String.valueOf(number);

        final ImageView foto = (ImageView) findViewById(R.id.fotosMadrid);

        final Bitmap berlin1 = BitmapFactory.decodeResource(getResources(), R.mipmap.ber1);
        final Bitmap berlin2 = BitmapFactory.decodeResource(getResources(), R.mipmap.ber2);
        final Bitmap berlin3 = BitmapFactory.decodeResource(getResources(), R.mipmap.ber3);
        final Bitmap berlin4 = BitmapFactory.decodeResource(getResources(), R.mipmap.ber4);
        final Bitmap berlin5 = BitmapFactory.decodeResource(getResources(), R.mipmap.ber5);
        final Bitmap berlin6 = BitmapFactory.decodeResource(getResources(), R.mipmap.ber6);
        final Bitmap berlin7 = BitmapFactory.decodeResource(getResources(), R.mipmap.ber7);
        final Bitmap berlin8 = BitmapFactory.decodeResource(getResources(), R.mipmap.ber8);

        Button otra = (Button) findViewById(R.id.otraBoton);
        Button resuelvo = (Button) findViewById(R.id.resulevoBoton);
        final EditText respuesta = (EditText) findViewById(R.id.respuesta);

        foto.setImageBitmap(berlin4);

        otra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EuropeActivity.score -= 25;
                int min = 1;
                int max = 8;

                Random r = new Random();
                int number = r.nextInt(max - min + 1) + min;
                final String result = String.valueOf(number);

                if (result.equals("1")) {

                    foto.setImageBitmap(berlin1);

                } else if (result.equals("2")) {

                    foto.setImageBitmap(berlin2);

                } else if (result.equals("3")) {

                    foto.setImageBitmap(berlin3);

                } else if (result.equals("4")) {

                    foto.setImageBitmap(berlin4);

                } else if (result.equals("5")) {

                    foto.setImageBitmap(berlin5);

                } else if (result.equals("6")) {

                    foto.setImageBitmap(berlin6);

                } else if (result.equals("7")) {

                    foto.setImageBitmap(berlin7);

                } else if (result.equals("8")) {

                    foto.setImageBitmap(berlin8);

                } else {
                    System.out.println("ERROR");
                }
            }
        });

        resuelvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resp = respuesta.getText().toString();

                if ("Berlin".equals(resp)) {


                    Intent reg = new Intent(BerlinActivity.this, CorrectoActivity.class);
                    startActivity(reg);
                } else {
                    Toast.makeText(getApplicationContext(), "Respuesta Incorrecta, ¡vuelve a intentarlo!", Toast.LENGTH_SHORT).show();
                }


            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Berlin Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
