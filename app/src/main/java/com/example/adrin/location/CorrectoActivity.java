package com.example.adrin.location;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class CorrectoActivity extends AppCompatActivity {

    public static int resultado = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correcto);

        TextView puntuacion = (TextView) findViewById(R.id.puntuacionText) ;

       resultado+=getIntent().getExtras().getInt("score");

        puntuacion.setText(" "+resultado+" ");

        Button otra = (Button) findViewById(R.id.restartbutton);

        otra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int min = 1;
                int max = 12;

                Random r = new Random();
                int number = r.nextInt(max - min + 1) + min;
                final String result = String.valueOf(number);




                if (result.equals("1")) {

                    Intent reg = new Intent(CorrectoActivity.this, EuropaPartida.class);
                    reg.putExtra("Ciudad", "Madrid");
                    startActivity(reg);

                } else if (result.equals("2")) {

                    Intent reg = new Intent(CorrectoActivity.this, EuropaPartida.class);
                    reg.putExtra("Ciudad", "Berlin");
                    startActivity(reg);

                } else if (result.equals("3")) {

                    Intent reg = new Intent(CorrectoActivity.this, EuropaPartida.class);
                    reg.putExtra("Ciudad", "Roma");
                    startActivity(reg);

                } else if (result.equals("4")) {

                    Intent reg = new Intent(CorrectoActivity.this, EuropaPartida.class);
                    reg.putExtra("Ciudad", "Paris");
                    startActivity(reg);

                } else if (result.equals("5")) {

                    Intent reg = new Intent(CorrectoActivity.this, EuropaPartida.class);
                    reg.putExtra("Ciudad", "Pompeya");
                    startActivity(reg);

                } else if (result.equals("6")) {

                    Intent reg = new Intent(CorrectoActivity.this, EuropaPartida.class);
                    reg.putExtra("Ciudad", "Valencia");
                    startActivity(reg);


                } else if (result.equals("7")) {

                    Intent reg = new Intent(CorrectoActivity.this, EuropaPartida.class);
                    reg.putExtra("Ciudad", "Venecia");
                    startActivity(reg);

                } else if (result.equals("8")) {

                    Intent reg = new Intent(CorrectoActivity.this, EuropaPartida.class);
                    reg.putExtra("Ciudad", "Dublin");
                    startActivity(reg);
                } else if (result.equals("9")) {

                    Intent reg = new Intent(CorrectoActivity.this, EuropaPartida.class);
                    reg.putExtra("Ciudad", "Praga");
                    startActivity(reg);
                } else if (result.equals("10")) {

                    Intent reg = new Intent(CorrectoActivity.this, EuropaPartida.class);
                    reg.putExtra("Ciudad", "Barcelona");
                    startActivity(reg);
                } else if (result.equals("11")) {

                    Intent reg = new Intent(CorrectoActivity.this, EuropaPartida.class);
                    reg.putExtra("Ciudad", "Londres");
                    startActivity(reg);
                } else if (result.equals("12")) {

                    Intent reg = new Intent(CorrectoActivity.this, EuropaPartida.class);
                    reg.putExtra("Ciudad", "Basilea");
                    startActivity(reg);

                } else {
                    System.out.println("ERROR");
                }

            }
        });

    }
}
