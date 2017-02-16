package com.example.adrin.location;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CorrectoActivity extends AppCompatActivity {

    public static int resultado = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correcto);

        TextView puntuacion = (TextView) findViewById(R.id.puntuacionText) ;

        resultado =EuropeActivity.score;


        puntuacion.setText(" "+resultado+" ");

        Button otra = (Button) findViewById(R.id.restartbutton);

        otra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent reg = new Intent(CorrectoActivity.this, EuropeActivity.class);
                    startActivity(reg);

            }
        });

    }
}
