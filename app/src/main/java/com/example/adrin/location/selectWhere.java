package com.example.adrin.location;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class selectWhere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_where);

        final Button botonEuropa = (Button) findViewById(R.id.europeButton);

        botonEuropa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent reg = new Intent(selectWhere.this, EuropeActivity.class);
                startActivity(reg);
            }
        });

    }



}
