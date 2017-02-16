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

public class BarcelonaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intento);

        int min =1;
        int max =3;

        Random r = new Random();
        int number = r.nextInt(max - min+1)+min;
        final String result = String.valueOf(number);

        final ImageView foto = (ImageView) findViewById(R.id.fotosMadrid);

        final Bitmap barcelona1 = BitmapFactory.decodeResource(getResources(), R.mipmap.bar1);
        final Bitmap barcelona2 = BitmapFactory.decodeResource(getResources(), R.mipmap.bar2);
        final Bitmap barcelona3 = BitmapFactory.decodeResource(getResources(), R.mipmap.bar3);
        final Bitmap barcelona4 = BitmapFactory.decodeResource(getResources(), R.mipmap.bar4);
        final Bitmap barcelona5 = BitmapFactory.decodeResource(getResources(), R.mipmap.bar5);
        final Bitmap barcelona6 = BitmapFactory.decodeResource(getResources(), R.mipmap.bar6);
        final Bitmap barcelona7 = BitmapFactory.decodeResource(getResources(), R.mipmap.bar7);
        final Bitmap barcelona8 = BitmapFactory.decodeResource(getResources(), R.mipmap.bar8);


        Button otra = (Button) findViewById(R.id.otraBoton);
        Button resuelvo = (Button) findViewById(R.id.resulevoBoton);
        final EditText respuesta = (EditText) findViewById(R.id.respuesta);


        otra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int min =1;
                int max =8;

                Random r = new Random();
                int number = r.nextInt(max - min+1)+min;
                final String result = String.valueOf(number);

                if (result.equals("1")) {

                    foto.setImageBitmap(barcelona1);

                }else if (result.equals("2")) {

                    foto.setImageBitmap(barcelona2);

                }else if (result.equals("3")) {

                    foto.setImageBitmap(barcelona3);

                }else if (result.equals("4")) {

                    foto.setImageBitmap(barcelona4);

                }else if (result.equals("5")) {

                    foto.setImageBitmap(barcelona5);

                }else if (result.equals("6")) {

                    foto.setImageBitmap(barcelona6);

                }else if (result.equals("7")) {

                    foto.setImageBitmap(barcelona7);

                }else if (result.equals("8")) {

                    foto.setImageBitmap(barcelona8);

                }else{
                    System.out.println("ERROR");
                }
            }
        });

        resuelvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resp = respuesta.getText().toString();

                if ("Barcelona".equals(resp)){
                    Intent reg = new Intent(BarcelonaActivity.this, CorrectoActivity.class);
                    startActivity(reg);
                }else {
                    Toast.makeText(getApplicationContext(), "Respuesta Incorrecta, ¡vuelve a intentarlo!", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}
