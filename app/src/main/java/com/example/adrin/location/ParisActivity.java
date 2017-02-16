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

public class ParisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intento);

        EuropeActivity.score = 500;
        int min =1;
        int max =9;

        Random r = new Random();
        int number = r.nextInt(max - min+1)+min;
        final String result = String.valueOf(number);

        final ImageView foto = (ImageView) findViewById(R.id.fotosMadrid);

        final Bitmap paris1 = BitmapFactory.decodeResource(getResources(), R.mipmap.paris1);
        final Bitmap paris2 = BitmapFactory.decodeResource(getResources(), R.mipmap.paris2);
        final Bitmap paris3 = BitmapFactory.decodeResource(getResources(), R.mipmap.paris3);
        final Bitmap paris4 = BitmapFactory.decodeResource(getResources(), R.mipmap.paris4);
        final Bitmap paris5 = BitmapFactory.decodeResource(getResources(), R.mipmap.paris5);
        final Bitmap paris6 = BitmapFactory.decodeResource(getResources(), R.mipmap.paris6);
        final Bitmap paris7 = BitmapFactory.decodeResource(getResources(), R.mipmap.paris7);
        final Bitmap paris8 = BitmapFactory.decodeResource(getResources(), R.mipmap.paris8);
        final Bitmap paris9 = BitmapFactory.decodeResource(getResources(), R.mipmap.paris9);

        Button otra = (Button) findViewById(R.id.otraBoton);
        Button resuelvo = (Button) findViewById(R.id.resulevoBoton);
        final EditText respuesta = (EditText) findViewById(R.id.respuesta);

        foto.setImageBitmap(paris9);

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

                    foto.setImageBitmap(paris1);

                }else if (result.equals("2")) {

                    foto.setImageBitmap(paris2);

                }else if (result.equals("3")) {

                    foto.setImageBitmap(paris3);

                }else if (result.equals("4")) {

                    foto.setImageBitmap(paris4);

                }else if (result.equals("5")) {

                    foto.setImageBitmap(paris5);

                }else if (result.equals("6")) {

                    foto.setImageBitmap(paris6);

                }else if (result.equals("7")) {

                    foto.setImageBitmap(paris7);

                }else if (result.equals("8")) {

                    foto.setImageBitmap(paris9);

                }else if (result.equals("9")) {

                        foto.setImageBitmap(paris9);


                    }else{
                    System.out.println("ERROR");
                }
            }
        });

        resuelvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resp = respuesta.getText().toString();

                if ("Paris".equals(resp)){
                    Intent reg = new Intent(ParisActivity.this, CorrectoActivity.class);
                    startActivity(reg);
                }else {
                    Toast.makeText(getApplicationContext(), "Respuesta Incorrecta, ¡vuelve a intentarlo!", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}
