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

public class RomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intento);

        EuropeActivity.score = 500;
        int min =1;
        int max =8;

        Random r = new Random();
        int number = r.nextInt(max - min+1)+min;
        final String result = String.valueOf(number);

        final ImageView foto = (ImageView) findViewById(R.id.fotosMadrid);

        final Bitmap rome1 = BitmapFactory.decodeResource(getResources(), R.mipmap.rome1);
        final Bitmap rome2 = BitmapFactory.decodeResource(getResources(), R.mipmap.rome2);
        final Bitmap rome3 = BitmapFactory.decodeResource(getResources(), R.mipmap.rome3);
        final Bitmap rome4 = BitmapFactory.decodeResource(getResources(), R.mipmap.rome4);
        final Bitmap rome5 = BitmapFactory.decodeResource(getResources(), R.mipmap.rome5);
        final Bitmap rome6 = BitmapFactory.decodeResource(getResources(), R.mipmap.rome6);
        final Bitmap rome8 = BitmapFactory.decodeResource(getResources(), R.mipmap.rome8);
        final Bitmap rome9 = BitmapFactory.decodeResource(getResources(), R.mipmap.rome9);


        Button otra = (Button) findViewById(R.id.otraBoton);
        Button resuelvo = (Button) findViewById(R.id.resulevoBoton);
        final EditText respuesta = (EditText) findViewById(R.id.respuesta);


        foto.setImageBitmap(rome1);

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

                    foto.setImageBitmap(rome1);

                }else if (result.equals("2")) {

                    foto.setImageBitmap(rome2);

                }else if (result.equals("3")) {

                    foto.setImageBitmap(rome3);

                }else if (result.equals("4")) {

                    foto.setImageBitmap(rome4);

                }else if (result.equals("5")) {

                    foto.setImageBitmap(rome5);

                }else if (result.equals("6")) {

                    foto.setImageBitmap(rome6);

                }else if (result.equals("7")) {

                    foto.setImageBitmap(rome8);

                }else if (result.equals("8")) {

                    foto.setImageBitmap(rome9);

                }else{
                    System.out.println("ERROR");
                }
            }
        });

        resuelvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resp = respuesta.getText().toString();

                if ("Roma".equals(resp)){
                    Intent reg = new Intent(RomeActivity.this, CorrectoActivity.class);
                    startActivity(reg);
                }else {
                    Toast.makeText(getApplicationContext(), "Respuesta Incorrecta, ¡vuelve a intentarlo!", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}
