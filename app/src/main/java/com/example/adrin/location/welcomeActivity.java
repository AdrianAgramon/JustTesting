package com.example.adrin.location;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.design.widget.TextInputLayout;
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

import com.example.adrin.location.model.Usuario;
import com.example.adrin.location.service.UserClient;
import com.jgabrielfreitas.core.BlurImageView;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

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
    TextInputLayout txt1, txt2, txt3, txt4, txt5, txt6, txt7;
    String baseUrl = "http://10.10.2.197:8888/location/api/GestionDeUsuarios/";


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
     //   this.setContentView(R.layout.activity_welcome);
        this.setContentView(R.layout.activity_welcome_final);



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

        txt1 = (TextInputLayout) findViewById(R.id.textinput1);
        txt2 = (TextInputLayout) findViewById(R.id.textinput2);
        txt3 = (TextInputLayout) findViewById(R.id.textinput3);
        txt4 = (TextInputLayout) findViewById(R.id.textinput4);
        txt5 = (TextInputLayout) findViewById(R.id.textinput5);
        txt6 = (TextInputLayout) findViewById(R.id.textinput6);
        txt7 = (TextInputLayout) findViewById(R.id.textinput7);

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
                txt3.setVisibility(View.VISIBLE);
                txt3.startAnimation(animation2);
                txt4.setVisibility(View.VISIBLE);
                txt4.startAnimation(animation2);
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

        btnLogIn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = username2.getText().toString();
                String contrasenna =  password2.getText().toString();

                sendNetworkRequestLogin(username,contrasenna);

            }
        });


        botonCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myBlurImage.setVisibility(View.VISIBLE);
                myBlurImage.startAnimation(animation2);
                background.startAnimation(animation);
                txt1.setVisibility(View.VISIBLE);
                txt1.startAnimation(animation2);
                txt2.setVisibility(View.VISIBLE);
                txt2.startAnimation(animation2);
                txt5.setVisibility(View.VISIBLE);
                txt5.startAnimation(animation2);
                txt6.setVisibility(View.VISIBLE);
                txt6.startAnimation(animation2);
                txt7.setVisibility(View.VISIBLE);
                txt7.startAnimation(animation2);
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

                Usuario user = new Usuario(
                        username2.getText().toString(),
                        password2.getText().toString(),
                        pais.getText().toString(),
                        email.getText().toString(),
                        nombre.getText().toString()
               );

                sendNetworkRequestAlta(user);

                Intent reg = new Intent(welcomeActivity.this, welcomeActivity.class);
                startActivity(reg);
            }
        });



    }

    private  void sendNetworkRequestLogin (String username, String contrasenna){
        //Crear la instancia Retrofit
        Retrofit.Builder builder = new Retrofit.Builder().baseUrl(""+baseUrl).addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit = builder.build();

        Map<String,String> map = new HashMap<>();
        map.put("username", username);
        map.put("contrasenna", contrasenna);

        //Obtenemos el cliente y llamamos un request al objeto
        UserClient client = retrofit.create(UserClient.class);
        Call<Boolean> call = client.logIn(map);

        call.enqueue(new Callback<Boolean>() {
            @Override
            public void onResponse(Call<Boolean> call, Response<Boolean> response) {

                Toast.makeText(welcomeActivity.this, "Usuario Creado correctamente! :D", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Boolean> call, Throwable t) {

                Toast.makeText(welcomeActivity.this, "Algo salió mal...  :( ", Toast.LENGTH_LONG).show();

            }
        });



    }
    private void sendNetworkRequestAlta(Usuario user){
        //Crear la instancia Retrofit
        Retrofit.Builder builder = new Retrofit.Builder().baseUrl(""+baseUrl).addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        //Obtenemos el cliente y llamamos un request al objeto
        UserClient client = retrofit.create(UserClient.class);
        Call<Usuario> call = client.createAccount(user);

        call.enqueue(new Callback<Usuario>() {
            @Override
            public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                Toast.makeText(welcomeActivity.this, "Usuario Creado correctamente! :D", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Usuario> call, Throwable t) {

                Toast.makeText(welcomeActivity.this, "Algo salió mal...  :( ", Toast.LENGTH_LONG).show();

            }
        });

    }

}
