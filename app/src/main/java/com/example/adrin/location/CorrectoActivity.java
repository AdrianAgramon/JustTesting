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


                switch (result) {
                    case "1": {

                        Intent reg = new Intent(CorrectoActivity.this, EuropaPartida.class);
                        reg.putExtra("Ciudad", "Madrid");
                        startActivity(reg);

                        break;
                    }
                    case "2": {

                        Intent reg = new Intent(CorrectoActivity.this, EuropaPartida.class);
                        reg.putExtra("Ciudad", "Berlin");
                        startActivity(reg);

                        break;
                    }
                    case "3": {

                        Intent reg = new Intent(CorrectoActivity.this, EuropaPartida.class);
                        reg.putExtra("Ciudad", "Roma");
                        startActivity(reg);

                        break;
                    }
                    case "4": {

                        Intent reg = new Intent(CorrectoActivity.this, EuropaPartida.class);
                        reg.putExtra("Ciudad", "Paris");
                        startActivity(reg);

                        break;
                    }
                    case "5": {

                        Intent reg = new Intent(CorrectoActivity.this, EuropaPartida.class);
                        reg.putExtra("Ciudad", "Pompeya");
                        startActivity(reg);

                        break;
                    }
                    case "6": {

                        Intent reg = new Intent(CorrectoActivity.this, EuropaPartida.class);
                        reg.putExtra("Ciudad", "Valencia");
                        startActivity(reg);


                        break;
                    }
                    case "7": {

                        Intent reg = new Intent(CorrectoActivity.this, EuropaPartida.class);
                        reg.putExtra("Ciudad", "Venecia");
                        startActivity(reg);

                        break;
                    }
                    case "8": {

                        Intent reg = new Intent(CorrectoActivity.this, EuropaPartida.class);
                        reg.putExtra("Ciudad", "Dublin");
                        startActivity(reg);
                        break;
                    }
                    case "9": {

                        Intent reg = new Intent(CorrectoActivity.this, EuropaPartida.class);
                        reg.putExtra("Ciudad", "Praga");
                        startActivity(reg);
                        break;
                    }
                    case "10": {

                        Intent reg = new Intent(CorrectoActivity.this, EuropaPartida.class);
                        reg.putExtra("Ciudad", "Barcelona");
                        startActivity(reg);
                        break;
                    }
                    case "11": {

                        Intent reg = new Intent(CorrectoActivity.this, EuropaPartida.class);
                        reg.putExtra("Ciudad", "Londres");
                        startActivity(reg);
                        break;
                    }
                    case "12": {

                        Intent reg = new Intent(CorrectoActivity.this, EuropaPartida.class);
                        reg.putExtra("Ciudad", "Basilea");
                        startActivity(reg);

                        break;
                    }
                    default:
                        System.out.println("ERROR");
                        break;
                }

            }
        });

    }
}
