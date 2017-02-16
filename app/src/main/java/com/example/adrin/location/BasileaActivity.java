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

public class BasileaActivity extends AppCompatActivity {

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

        final Bitmap basel1 = BitmapFactory.decodeResource(getResources(), R.mipmap.basel1);
        final Bitmap basel2 = BitmapFactory.decodeResource(getResources(), R.mipmap.basel2);
        final Bitmap basel3 = BitmapFactory.decodeResource(getResources(), R.mipmap.basel3);
        final Bitmap basel4 = BitmapFactory.decodeResource(getResources(), R.mipmap.basel4);
        final Bitmap basel5 = BitmapFactory.decodeResource(getResources(), R.mipmap.basel5);
        final Bitmap basel6 = BitmapFactory.decodeResource(getResources(), R.mipmap.basel6);
        final Bitmap basel7 = BitmapFactory.decodeResource(getResources(), R.mipmap.basel7);
        final Bitmap basel8 = BitmapFactory.decodeResource(getResources(), R.mipmap.basel8);


        Button otra = (Button) findViewById(R.id.otraBoton);
        Button resuelvo = (Button) findViewById(R.id.resulevoBoton);
        final EditText respuesta = (EditText) findViewById(R.id.respuesta);

        foto.setImageBitmap(basel2);

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

                    foto.setImageBitmap(basel1);

                }else if (result.equals("2")) {

                    foto.setImageBitmap(basel2);

                }else if (result.equals("3")) {

                    foto.setImageBitmap(basel3);

                }else if (result.equals("4")) {

                    foto.setImageBitmap(basel4);

                }else if (result.equals("5")) {

                    foto.setImageBitmap(basel5);

                }else if (result.equals("6")) {

                    foto.setImageBitmap(basel6);

                }else if (result.equals("7")) {

                    foto.setImageBitmap(basel7);

                }else if (result.equals("8")) {

                    foto.setImageBitmap(basel8);

                }else{
                    System.out.println("ERROR");
                }
            }
        });

        resuelvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resp = respuesta.getText().toString();

                if ("Basilea".equals(resp)){
                    Intent reg = new Intent(BasileaActivity.this, CorrectoActivity.class);
                    startActivity(reg);
                }else {
                    Toast.makeText(getApplicationContext(), "Respuesta Incorrecta, ¡vuelve a intentarlo!", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}
