package com.example.adrin.location;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Random;

public class EuropeActivity extends AppCompatActivity {



     int lastResult = CorrectoActivity.resultado;
    int bestResult;


    public static int score;



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





        bestScore.setText(" "+bestResult +" ");

        final Button botonPartida = (Button) findViewById(R.id.TryAgainButton);

        botonPartida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int score = 500;

                int min = 1;
                int max = 12;

                Random r = new Random();
                int number = r.nextInt(max - min + 1) + min;
               // final String result = String.valueOf(number);

                final String result = "1";


                if (result.equals("1")) {

                    Intent reg = new Intent(EuropeActivity.this, MadridActivity.class);
                    startActivity(reg);
                } else if (result.equals("2")) {

                    Intent reg = new Intent(EuropeActivity.this, ParisActivity.class);
                    startActivity(reg);

                } else if (result.equals("3")) {

                    Intent reg = new Intent(EuropeActivity.this, BasileaActivity.class);
                    startActivity(reg);

                } else if (result.equals("4")) {

                    Intent reg = new Intent(EuropeActivity.this, BarcelonaActivity.class);
                    startActivity(reg);

                } else if (result.equals("5")) {

                    Intent reg = new Intent(EuropeActivity.this, BerlinActivity.class);
                    startActivity(reg);

                } else if (result.equals("6")) {

                    Intent reg = new Intent(EuropeActivity.this, DublinActivity.class);
                    startActivity(reg);


                } else if (result.equals("7")) {

                    Intent reg = new Intent(EuropeActivity.this, RomeActivity.class);
                    startActivity(reg);

                } else if (result.equals("8")) {

                    Intent reg = new Intent(EuropeActivity.this, PompeyaActivity.class);
                    startActivity(reg);
                } else if (result.equals("9")) {

                    Intent reg = new Intent(EuropeActivity.this, PragaActivity.class);
                    startActivity(reg);
                } else if (result.equals("10")) {

                    Intent reg = new Intent(EuropeActivity.this, ValenciaActivity.class);
                    startActivity(reg);
                } else if (result.equals("11")) {

                    Intent reg = new Intent(EuropeActivity.this, VeneciaActivity.class);
                    startActivity(reg);
                } else if (result.equals("12")) {

                    Intent reg = new Intent(EuropeActivity.this, LondresActivity.class);
                    startActivity(reg);

                } else {
                    System.out.println("ERROR");
                }
            }
        });

    }


}
