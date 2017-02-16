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

public class PompeyaActivity extends AppCompatActivity {


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

        final Bitmap pompeya1 = BitmapFactory.decodeResource(getResources(), R.mipmap.pom1);
        final Bitmap pompeya2 = BitmapFactory.decodeResource(getResources(), R.mipmap.pom2);
        final Bitmap pompeya3 = BitmapFactory.decodeResource(getResources(), R.mipmap.pom3);
        final Bitmap pompeya4 = BitmapFactory.decodeResource(getResources(), R.mipmap.pom4);
        final Bitmap pompeya5 = BitmapFactory.decodeResource(getResources(), R.mipmap.pom5);
        final Bitmap pompeya6 = BitmapFactory.decodeResource(getResources(), R.mipmap.pom6);
        final Bitmap pompeya7 = BitmapFactory.decodeResource(getResources(), R.mipmap.pom7);
        final Bitmap pompeya8 = BitmapFactory.decodeResource(getResources(), R.mipmap.pom8);


        Button otra = (Button) findViewById(R.id.otraBoton);
        Button resuelvo = (Button) findViewById(R.id.resulevoBoton);
        final EditText respuesta = (EditText) findViewById(R.id.respuesta);

        foto.setImageBitmap(pompeya5);

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

                    foto.setImageBitmap(pompeya1);

                }else if (result.equals("2")) {

                    foto.setImageBitmap(pompeya2);

                }else if (result.equals("3")) {

                    foto.setImageBitmap(pompeya3);

                }else if (result.equals("4")) {

                    foto.setImageBitmap(pompeya4);

                }else if (result.equals("5")) {

                    foto.setImageBitmap(pompeya5);

                }else if (result.equals("6")) {

                    foto.setImageBitmap(pompeya6);

                }else if (result.equals("7")) {

                    foto.setImageBitmap(pompeya7);

                }else if (result.equals("8")) {

                    foto.setImageBitmap(pompeya8);

                }else{
                    System.out.println("ERROR");
                }
            }
        });

        resuelvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resp = respuesta.getText().toString();

                if ("Pompeya".equals(resp)){
                    Intent reg = new Intent(PompeyaActivity.this, CorrectoActivity.class);
                    startActivity(reg);
                }else {
                    Toast.makeText(getApplicationContext(), "Respuesta Incorrecta, ¡vuelve a intentarlo!", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}

