package com.example.adrin.location;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.adrin.location.model.User;
import com.example.adrin.location.service.UserClient;
import com.jgabrielfreitas.core.BlurImageView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class welcomeActivity extends AppCompatActivity {




    Animation animation, animation2, animation3;
    BlurImageView myBlurImage;
    ImageView background;
    EditText username, password, email, nombre, username2, password2;
    Button botonLonIn,botonCrear,btnLogIn2, btnCrear2;
    AutoCompleteTextView pais;
    boolean isLogin, isCreate;


    private static final String[] COUNTRIES = new String[] {
            "India","España", "Francia", "Italia", "Alemania", "Suiza","Estados Unidos","China"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

//Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

//set content view AFTER ABOVE sequence (to avoid crash)
        this.setContentView(R.layout.activity_welcome);
        setContentView(R.layout.activity_welcome_final);

        myBlurImage = (BlurImageView)findViewById(R.id.myBlurImage);
        myBlurImage.setBlur(10);

        isCreate= false;
        isLogin = false;

        background = (ImageView) findViewById(R.id.background);

        botonLonIn = (Button) findViewById(R.id.startButton);
        btnLogIn2 = (Button)findViewById(R.id.startButton2);
        botonCrear = (Button)findViewById(R.id.buttonCrear);
        btnCrear2 = (Button)findViewById(R.id.buttonCrear2);

        final TextView title = (TextView) findViewById((R.id.title));
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        pais = (AutoCompleteTextView)findViewById(R.id.editPais);
        email = (EditText)findViewById(R.id.editMail);
        nombre = (EditText)findViewById(R.id.editNombre);
        username2= (EditText) findViewById(R.id.username2);
        password2 = (EditText) findViewById(R.id.password2);

        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
        animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        animation3 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,COUNTRIES );


        pais.setAdapter(adapter);




        botonLonIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Intent reg = new Intent(welcomeActivity.this, selectWhere.class);
              //  startActivity(reg);
                myBlurImage.setVisibility(View.VISIBLE);
                myBlurImage.startAnimation(animation2);
                background.startAnimation(animation);
                username.setVisibility(View.VISIBLE);
                username.startAnimation(animation2);
                password.setVisibility(View.VISIBLE);
                password.startAnimation(animation2);
                botonCrear.startAnimation(animation);
                botonLonIn.startAnimation(animation);
                botonLonIn.setClickable(false);
                btnLogIn2.setVisibility(View.VISIBLE);
                btnLogIn2.startAnimation(animation2);
                botonCrear.setClickable(false);
                btnCrear2.setClickable(false);
                isLogin=true;

            }
        });


        botonCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myBlurImage.setVisibility(View.VISIBLE);
                myBlurImage.startAnimation(animation2);
                background.startAnimation(animation);
                username2.setVisibility(View.VISIBLE);
                username2.startAnimation(animation2);
                password2.setVisibility(View.VISIBLE);
                password2.startAnimation(animation2);
                pais.setVisibility(View.VISIBLE);
                pais.startAnimation(animation2);
                email.setVisibility(View.VISIBLE);
                email.startAnimation(animation2);
                nombre.setVisibility(View.VISIBLE);
                nombre.startAnimation(animation2);
                botonCrear.startAnimation(animation);
                botonCrear.setVisibility(View.INVISIBLE);
                botonCrear.setClickable(false);
                botonLonIn.startAnimation(animation);
                botonLonIn.setVisibility(View.INVISIBLE);
                botonLonIn.setClickable(false);
                btnLogIn2.setClickable(false);
                btnCrear2.setVisibility(View.VISIBLE);
                btnCrear2.startAnimation(animation2);
                title.startAnimation(animation3);
                isCreate = true;

            }
        });

        btnCrear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                User user = new User(
                        username2.getText().toString(),
                        password2.getText().toString(),
                        pais.getText().toString(),
                        email.getText().toString(),
                        nombre.getText().toString()
                );

                sendNetworkRequest(user);
            }
        });



    }

    private void sendNetworkRequest(User user){
        //Crear la instancia Retrofit
        Retrofit.Builder builder = new Retrofit.Builder().baseUrl("INSERTAR URL AQUÍ").addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        //Obtenemos el cliente y llamamos un request al objeto
        UserClient client = retrofit.create(UserClient.class);
        Call<User> call = client.createAccount(user);

        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                Toast.makeText(welcomeActivity.this, "Usuario Creado correctamente! :D", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

                Toast.makeText(welcomeActivity.this, "Algo salió mal...  :( ", Toast.LENGTH_LONG).show();

            }
        });

    }

}
