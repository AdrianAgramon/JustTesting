package com.example.adrin.location;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import android.widget.ImageView;


public class welcomeActivity extends AppCompatActivity {


    ImageView background;

    Button botonLonIn,botonCrear;

    String baseUrl = " https://lit-ravine-97705.herokuapp.com/location/api/GestionDeUsuarios/";


    public static String usernameFinal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //set content view AFTER ABOVE sequence (to avoid crash)
        //   this.setContentView(R.layout.activity_welcome);
        this.setContentView(R.layout.activity_welcome_final);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);



//        myBlurImage = (BlurImageView)findViewById(R.id.myBlurImage);
//        myBlurImage.setBlur(10);



        background = (ImageView) findViewById(R.id.background);

        botonLonIn = (Button) findViewById(R.id.startButton);
        botonCrear = (Button)findViewById(R.id.buttonCrear);






//        final Button pass = (Button) findViewById(R.id.passButton);
//
//        pass.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent reg = new Intent(welcomeActivity.this, selectWhere.class);
//                startActivity(reg);
//
//            }
//        });




        botonLonIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent reg = new Intent(welcomeActivity.this, LoginActivity.class);
                startActivity(reg);

            }
        });

        botonCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent reg = new Intent(welcomeActivity.this, RegisterActivity.class);
                startActivity(reg);

            }
        });


    }





}
