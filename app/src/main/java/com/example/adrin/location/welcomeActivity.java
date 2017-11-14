package com.example.adrin.location;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
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
    EditText username1, password, email, nombre, username2, password2;
    Button botonLonIn,botonCrear,btnLogIn2, btnCrear2;
    AutoCompleteTextView pais;
    boolean isLogin, isCreate;
    TextInputLayout txt1, txt2, txt3, txt4, txt5, txt6, txt7;
    String baseUrl = " https://lit-ravine-97705.herokuapp.com/location/api/GestionDeUsuarios/";


    public static String usernameFinal;

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
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);



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
        username1 = (EditText) findViewById(R.id.username);
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

        final Button pass = (Button) findViewById(R.id.passButton);

        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent reg = new Intent(welcomeActivity.this, selectWhere.class);
                startActivity(reg);

            }
        });




        botonLonIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

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

                        if(TextUtils.isEmpty(username1.getText().toString())){
                            username1.setError("Este campo no puede estar vacío");
                            return;
                        }else if (TextUtils.isEmpty(password.getText().toString())){
                            password.setError("Este campo no puede estar vacío");
                            return;
                        }else {
                            String username = username1.getText().toString();
                            usernameFinal = username;
                            String contrasenna = password.getText().toString();

                            sendNetworkRequestLogin(username, contrasenna);
                        }

            }
        });


        botonCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myBlurImage.setVisibility(View.VISIBLE);
                myBlurImage.startAnimation(animation2);
                background.startAnimation(animation);

                txt2.setVisibility(View.VISIBLE);
                txt2.startAnimation(animation2);
                txt1.setVisibility(View.VISIBLE);
                txt1.startAnimation(animation2);
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

                if(TextUtils.isEmpty(username2.getText().toString())){
                    username2.setError("Este campo no puede estar vacío");
                    return;
                }else if(TextUtils.isEmpty(password2.getText().toString())){
                    password2.setError("Este campo no puede estar vacío");
                    return;
                }else if(TextUtils.isEmpty(email.getText().toString())){
                    email.setError("Este campo no puede estar vacío");
                    return;
                }else if(TextUtils.isEmpty(nombre.getText().toString())){
                    nombre.setError("Este campo no puede estar vacío");
                    return;
                }else {

                    Usuario user = new Usuario(

                            username2.getText().toString(),
                            password2.getText().toString(),
                            pais.getText().toString(),
                            email.getText().toString(),
                            nombre.getText().toString()

                    );

                    sendNetworkRequestAlta(user);
                }
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

                if(response.code()== 200) {

                    Toast.makeText(welcomeActivity.this, "Usuario logeado correctamente! :D", Toast.LENGTH_SHORT).show();
                    Intent reg = new Intent(welcomeActivity.this, selectWhere.class);
                    startActivity(reg);
                    finish();
                }else if (response.code()==400){
                    Toast.makeText(welcomeActivity.this, "Usuario o contraseña incorrectos", Toast.LENGTH_LONG).show();
                }

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

                if(response.code()== 200) {
                    txt1.setVisibility(View.INVISIBLE);
                    txt1.startAnimation(animation);
                    txt2.setVisibility(View.INVISIBLE);
                    txt2.startAnimation(animation);
                    txt5.setVisibility(View.INVISIBLE);
                    txt5.startAnimation(animation);
                    txt6.setVisibility(View.INVISIBLE);
                    txt6.startAnimation(animation);
                    txt7.setVisibility(View.INVISIBLE);
                    txt7.startAnimation(animation);
                    btnCrear2.setVisibility(View.INVISIBLE);
                    btnCrear2.setClickable(false);
                    btnCrear2.startAnimation(animation);

                    btnLogIn2.setClickable(true);
                    btnLogIn2.setVisibility(View.VISIBLE);
                    btnLogIn2.startAnimation(animation2);
                    txt3.setVisibility(View.VISIBLE);
                    txt3.startAnimation(animation2);
                    txt4.setVisibility(View.VISIBLE);
                    txt4.startAnimation(animation2);

                    Toast.makeText(welcomeActivity.this, "Usuario Creado correctamente! :D", Toast.LENGTH_SHORT).show();

                }else if (response.code()==400){
                    Toast.makeText(welcomeActivity.this, "Hubo algún fallo....", Toast.LENGTH_LONG).show();
                }


            }

            @Override
            public void onFailure(Call<Usuario> call, Throwable t) {

                Toast.makeText(welcomeActivity.this, "Algo salió mal...  :( ", Toast.LENGTH_LONG).show();

            }
        });

    }



}
