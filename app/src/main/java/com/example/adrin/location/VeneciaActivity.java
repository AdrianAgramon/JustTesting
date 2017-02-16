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

import java.util.Random;

public class VeneciaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intento);

        EuropeActivity.score = 500;
        int min =1;
        int max =3;

        Random r = new Random();
        int number = r.nextInt(max - min+1)+min;
        final String result = String.valueOf(number);

        final ImageView foto = (ImageView) findViewById(R.id.fotosMadrid);

        final Bitmap venecia1 = BitmapFactory.decodeResource(getResources(), R.mipmap.venecia1);
        final Bitmap venecia2 = BitmapFactory.decodeResource(getResources(), R.mipmap.venecia2);
        final Bitmap venecia3 = BitmapFactory.decodeResource(getResources(), R.mipmap.venecia3);
        final Bitmap venecia4 = BitmapFactory.decodeResource(getResources(), R.mipmap.venecia4);
        final Bitmap venecia5 = BitmapFactory.decodeResource(getResources(), R.mipmap.venecia5);
        final Bitmap venecia6 = BitmapFactory.decodeResource(getResources(), R.mipmap.venecia6);
        final Bitmap venecia7 = BitmapFactory.decodeResource(getResources(), R.mipmap.venecia7);
        final Bitmap venecia8 = BitmapFactory.decodeResource(getResources(), R.mipmap.venecia8);


        Button otra = (Button) findViewById(R.id.otraBoton);
        Button resuelvo = (Button) findViewById(R.id.resulevoBoton);
        final EditText respuesta = (EditText) findViewById(R.id.respuesta);

        foto.setImageBitmap(venecia1);

        otra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int min =1;
                int max =8;

                Random r = new Random();
                int number = r.nextInt(max - min+1)+min;
                final String result = String.valueOf(number);

                if (result.equals("1")) {

                    foto.setImageBitmap(venecia1);

                }else if (result.equals("2")) {

                    foto.setImageBitmap(venecia2);

                }else if (result.equals("3")) {

                    foto.setImageBitmap(venecia3);

                }else if (result.equals("4")) {

                    foto.setImageBitmap(venecia4);

                }else if (result.equals("5")) {

                    foto.setImageBitmap(venecia5);

                }else if (result.equals("6")) {

                    foto.setImageBitmap(venecia6);

                }else if (result.equals("7")) {

                    foto.setImageBitmap(venecia7);

                }else if (result.equals("8")) {

                    foto.setImageBitmap(venecia8);

                }else{
                    System.out.println("ERROR");
                }
            }
        });

        resuelvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resp = respuesta.getText().toString();

                if ("Venecia".equals(resp)){
                    Intent reg = new Intent(VeneciaActivity.this, CorrectoActivity.class);
                    startActivity(reg);
                }else {
                    Toast.makeText(getApplicationContext(), "Respuesta Incorrecta, ¡vuelve a intentarlo!", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}

