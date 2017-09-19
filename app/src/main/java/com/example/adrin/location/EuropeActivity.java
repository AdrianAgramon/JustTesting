package com.example.adrin.location;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class EuropeActivity extends AppCompatActivity {



    public static int score;
    int lastResult = CorrectoActivity.resultado;
    int bestResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_europe);

        final TextView bestScore = (TextView) findViewById(R.id.bestResult);


        if (lastResult ==0){
           int bestResult=lastResult;
        }else if (bestResult < lastResult){
            bestResult=lastResult;
        }

        int score = 0;

        int min = 1;
        int max = 12;

        Random r = new Random();
        int number = r.nextInt(max - min + 1) + min;
        final String result = String.valueOf(number);






        bestScore.setText(" "+bestResult +" ");

        final Button botonPartida = (Button) findViewById(R.id.TryAgainButton);

        botonPartida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int score = 0;

                int min = 1;
                int max = 12;

                Random r = new Random();
                int number = r.nextInt(max - min + 1) + min;
                final String result = String.valueOf(number);

                final int partidas =5;

                switch (result) {
                    case "1": {

                        Intent reg = new Intent(EuropeActivity.this, EuropaPartida.class);
                        reg.putExtra("Ciudad", "Madrid");
                        reg.putExtra("Partidas", partidas);
                        startActivity(reg);
                        break;
                    }
                    case "2": {

                        Intent reg = new Intent(EuropeActivity.this, EuropaPartida.class);
                        reg.putExtra("Ciudad", "Paris");
                        reg.putExtra("Partidas", partidas);
                        startActivity(reg);

                        break;
                    }
                    case "3": {

                        Intent reg = new Intent(EuropeActivity.this, EuropaPartida.class);
                        reg.putExtra("Ciudad", "Basilea");
                        reg.putExtra("Partidas", partidas);
                        startActivity(reg);

                        break;
                    }
                    case "4": {

                        Intent reg = new Intent(EuropeActivity.this, EuropaPartida.class);
                        reg.putExtra("Ciudad", "Barcelona");
                        reg.putExtra("Partidas", partidas);
                        startActivity(reg);

                        break;
                    }
                    case "5": {

                        Intent reg = new Intent(EuropeActivity.this, EuropaPartida.class);
                        reg.putExtra("Ciudad", "Berlin");
                        reg.putExtra("Partidas", partidas);
                        startActivity(reg);

                        break;
                    }
                    case "6": {

                        Intent reg = new Intent(EuropeActivity.this, EuropaPartida.class);
                        reg.putExtra("Ciudad", "Dublin");
                        reg.putExtra("Partidas", partidas);
                        startActivity(reg);


                        break;
                    }
                    case "7": {

                        Intent reg = new Intent(EuropeActivity.this, EuropaPartida.class);
                        reg.putExtra("Ciudad", "Roma");
                        //  reg.putExtra("Score", score);
                        startActivity(reg);

                        break;
                    }
                    case "8": {

                        Intent reg = new Intent(EuropeActivity.this, EuropaPartida.class);
                        reg.putExtra("Ciudad", "Pompeya");
                        reg.putExtra("Partidas", partidas);
                        startActivity(reg);
                        break;
                    }
                    case "9": {

                        Intent reg = new Intent(EuropeActivity.this, EuropaPartida.class);
                        reg.putExtra("Ciudad", "Praga");
                        reg.putExtra("Partidas", partidas);
                        startActivity(reg);
                        break;
                    }
                    case "10": {

                        Intent reg = new Intent(EuropeActivity.this, EuropaPartida.class);
                        reg.putExtra("Cuidad", "Valencia");
                        reg.putExtra("Partidas", partidas);
                        startActivity(reg);
                        break;
                    }
                    case "11": {

                        Intent reg = new Intent(EuropeActivity.this, EuropaPartida.class);
                        reg.putExtra("Ciudad", "Venecia");
                        reg.putExtra("Partidas", partidas);
                        startActivity(reg);
                        break;
                    }
                    case "12": {

                        Intent reg = new Intent(EuropeActivity.this, EuropaPartida.class);
                        reg.putExtra("Ciudad", "Londres");
                        reg.putExtra("Partidas", partidas);
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
