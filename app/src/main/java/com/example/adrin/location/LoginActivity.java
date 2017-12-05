package com.example.adrin.location;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.adrin.location.ResideMenu.MainActivity;
import com.example.adrin.location.service.UserClient;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginActivity extends AppCompatActivity {


    EditText username1, password;
    Button btnLogIn2;
    TextInputLayout txt3, txt4;
    String baseUrl = " https://dry-sierra-56010.herokuapp.com/location/api/GestionDeUsuarios/";

    public static String usernameFinal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txt3 = (TextInputLayout) findViewById(R.id.textinput3);
        txt4 = (TextInputLayout) findViewById(R.id.textinput4);

        username1 = (EditText) findViewById(R.id.username) ;
        password = (EditText) findViewById(R.id.password) ;

        btnLogIn2 = (Button)findViewById(R.id.startButton2);

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

                    Toast.makeText(LoginActivity.this, "Usuario logeado correctamente! :D", Toast.LENGTH_SHORT).show();
                    Intent reg = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(reg);
                    finish();
                }else if (response.code()==400){
                    Toast.makeText(LoginActivity.this, "Algo salió mal", Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onFailure(Call<Boolean> call, Throwable t) {

                Toast.makeText(LoginActivity.this, "Algo salió mal...  :( ", Toast.LENGTH_LONG).show();

            }
        });



    }
}
