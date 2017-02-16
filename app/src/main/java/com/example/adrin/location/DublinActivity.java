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

public class DublinActivity extends AppCompatActivity {

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

        final Bitmap dublin1 = BitmapFactory.decodeResource(getResources(), R.mipmap.dub1);
        final Bitmap dublin2 = BitmapFactory.decodeResource(getResources(), R.mipmap.dub2);
        final Bitmap dublin3 = BitmapFactory.decodeResource(getResources(), R.mipmap.dub3);
        final Bitmap dublin4 = BitmapFactory.decodeResource(getResources(), R.mipmap.dub4);
        final Bitmap dublin5 = BitmapFactory.decodeResource(getResources(), R.mipmap.dub5);
        final Bitmap dublin6 = BitmapFactory.decodeResource(getResources(), R.mipmap.dub6);
        final Bitmap dublin7 = BitmapFactory.decodeResource(getResources(), R.mipmap.dub7);
        final Bitmap dublin8 = BitmapFactory.decodeResource(getResources(), R.mipmap.dub8);


        Button otra = (Button) findViewById(R.id.otraBoton);
        Button resuelvo = (Button) findViewById(R.id.resulevoBoton);
        final EditText respuesta = (EditText) findViewById(R.id.respuesta);

        foto.setImageBitmap(dublin2);

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

                    foto.setImageBitmap(dublin1);

                }else if (result.equals("2")) {

                    foto.setImageBitmap(dublin2);

                }else if (result.equals("3")) {

                    foto.setImageBitmap(dublin3);

                }else if (result.equals("4")) {

                    foto.setImageBitmap(dublin4);

                }else if (result.equals("5")) {

                    foto.setImageBitmap(dublin5);

                }else if (result.equals("6")) {

                    foto.setImageBitmap(dublin6);

                }else if (result.equals("7")) {

                    foto.setImageBitmap(dublin7);

                }else if (result.equals("8")) {

                    foto.setImageBitmap(dublin8);

                }else{
                    System.out.println("ERROR");
                }
            }
        });

        resuelvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resp = respuesta.getText().toString();

                if ("Dublin".equals(resp)){
                    Intent reg = new Intent(DublinActivity.this, CorrectoActivity.class);
                    startActivity(reg);
                }else {
                    Toast.makeText(getApplicationContext(), "Respuesta Incorrecta, ¡vuelve a intentarlo!", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}
