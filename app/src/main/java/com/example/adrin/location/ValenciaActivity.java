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

public class ValenciaActivity extends AppCompatActivity {

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

        final Bitmap valencia1 = BitmapFactory.decodeResource(getResources(), R.mipmap.vale1);
        final Bitmap valencia2 = BitmapFactory.decodeResource(getResources(), R.mipmap.vale2);
        final Bitmap valencia3 = BitmapFactory.decodeResource(getResources(), R.mipmap.vale3);
        final Bitmap valencia4 = BitmapFactory.decodeResource(getResources(), R.mipmap.vale4);
        final Bitmap valencia5 = BitmapFactory.decodeResource(getResources(), R.mipmap.vale5);
        final Bitmap valencia6 = BitmapFactory.decodeResource(getResources(), R.mipmap.vale6);
        final Bitmap valencia7 = BitmapFactory.decodeResource(getResources(), R.mipmap.vale7);
        final Bitmap valencia8 = BitmapFactory.decodeResource(getResources(), R.mipmap.vale8);


        Button otra = (Button) findViewById(R.id.otraBoton);
        Button resuelvo = (Button) findViewById(R.id.resulevoBoton);
        final EditText respuesta = (EditText) findViewById(R.id.respuesta);

        foto.setImageBitmap(valencia1);

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

                    foto.setImageBitmap(valencia1);

                }else if (result.equals("2")) {

                    foto.setImageBitmap(valencia2);

                }else if (result.equals("3")) {

                    foto.setImageBitmap(valencia3);

                }else if (result.equals("4")) {

                    foto.setImageBitmap(valencia4);

                }else if (result.equals("5")) {

                    foto.setImageBitmap(valencia5);

                }else if (result.equals("6")) {

                    foto.setImageBitmap(valencia6);

                }else if (result.equals("7")) {

                    foto.setImageBitmap(valencia7);

                }else if (result.equals("8")) {

                    foto.setImageBitmap(valencia8);

                }else{
                    System.out.println("ERROR");
                }
            }
        });

        resuelvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resp = respuesta.getText().toString();

                if ("Valencia".equals(resp)){
                    Intent reg = new Intent(ValenciaActivity.this, CorrectoActivity.class);
                    startActivity(reg);
                }else {
                    Toast.makeText(getApplicationContext(), "Respuesta Incorrecta, ¡vuelve a intentarlo!", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}


