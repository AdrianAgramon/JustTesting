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

public class LondresActivity extends AppCompatActivity {

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


        final Bitmap london1 = BitmapFactory.decodeResource(getResources(), R.mipmap.lon1);
        final Bitmap london2 = BitmapFactory.decodeResource(getResources(), R.mipmap.lon2);
        final Bitmap london3 = BitmapFactory.decodeResource(getResources(), R.mipmap.lon3);
        final Bitmap london4 = BitmapFactory.decodeResource(getResources(), R.mipmap.lon4);
        final Bitmap london5 = BitmapFactory.decodeResource(getResources(), R.mipmap.lon5);
        final Bitmap london6 = BitmapFactory.decodeResource(getResources(), R.mipmap.lon6);
        final Bitmap london7 = BitmapFactory.decodeResource(getResources(), R.mipmap.lon7);
        final Bitmap london8 = BitmapFactory.decodeResource(getResources(), R.mipmap.lon8);


        Button otra = (Button) findViewById(R.id.otraBoton);
        Button resuelvo = (Button) findViewById(R.id.resulevoBoton);
        final EditText respuesta = (EditText) findViewById(R.id.respuesta);

        foto.setImageBitmap(london1);

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

                    foto.setImageBitmap(london1);

                }else if (result.equals("2")) {

                    foto.setImageBitmap(london2);

                }else if (result.equals("3")) {

                    foto.setImageBitmap(london3);

                }else if (result.equals("4")) {

                    foto.setImageBitmap(london4);

                }else if (result.equals("5")) {

                    foto.setImageBitmap(london5);

                }else if (result.equals("6")) {

                    foto.setImageBitmap(london6);

                }else if (result.equals("7")) {

                    foto.setImageBitmap(london7);

                }else if (result.equals("8")) {

                    foto.setImageBitmap(london8);

                }else{
                    System.out.println("ERROR");
                }
            }
        });

        resuelvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resp = respuesta.getText().toString();

                if ("Londres".equals(resp)){
                    Intent reg = new Intent(LondresActivity.this, CorrectoActivity.class);
                    startActivity(reg);
                }else {
                    Toast.makeText(getApplicationContext(), "Respuesta Incorrecta, ¡vuelve a intentarlo!", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}
