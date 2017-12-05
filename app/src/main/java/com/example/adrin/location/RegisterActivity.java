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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adrin.location.model.Usuario;
import com.example.adrin.location.service.UserClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RegisterActivity extends AppCompatActivity {


    EditText  email, nombre, username2, password2;
    Button  btnCrear2;
    AutoCompleteTextView pais;

    TextInputLayout txt1, txt2, txt5, txt6, txt7;
    String baseUrl = " https://dry-sierra-56010.herokuapp.com/location/api/GestionDeUsuarios/";

    private static final String[] COUNTRIES = new String[] {
            "India","España", "Francia", "Italia", "Alemania", "Suiza","Estados Unidos","China"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnCrear2 = (Button)findViewById(R.id.buttonCrear2);




        pais = (AutoCompleteTextView)findViewById(R.id.editPais);
        email = (EditText)findViewById(R.id.editMail);
        nombre = (EditText)findViewById(R.id.editNombre);
        username2= (EditText) findViewById(R.id.username2);
        password2 = (EditText) findViewById(R.id.password2);

        txt2 = (TextInputLayout) findViewById(R.id.textinput2);
        txt1 = (TextInputLayout) findViewById(R.id.textinput1);
        txt5 = (TextInputLayout) findViewById(R.id.textinput5);
        txt6 = (TextInputLayout) findViewById(R.id.textinput6);
        txt7 = (TextInputLayout) findViewById(R.id.textinput7);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,COUNTRIES );
        pais.setAdapter(adapter);

        btnCrear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(username2.getText().toString())){
                    username2.setError("Este campo no puede estar vacío");
                    return;
                }else if(TextUtils.isEmpty(password2.getText().toString())){
                    password2.setError("Este campo no puede estar vacío");
                    return;
                }else if(TextUtils.isEmpty(nombre.getText().toString())){
                    nombre.setError("Este campo no puede estar vacío");
                    return;
                }else if(TextUtils.isEmpty(email.getText().toString())){
                    email.setError("Este campo no puede estar vacío");
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

    private void sendNetworkRequestAlta(Usuario user){
        //Crear la instancia Retrofit
        Retrofit.Builder builder = new Retrofit.Builder().baseUrl(""+baseUrl).addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        //Obtenemos el cliente y llamamos un request al objeto
        UserClient client = retrofit.create(UserClient.class);
        Call<Boolean> call = client.createAccount(user);

        call.enqueue(new Callback<Boolean>() {
            @Override
            public void onResponse(Call<Boolean> call, Response<Boolean> response) {

                if(response.code()== 200) {

                    Toast.makeText(RegisterActivity.this, "Usuario Creado correctamente! :D", Toast.LENGTH_SHORT).show();

                    Intent reg = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(reg);
                    finish();

                }else {
                    Toast.makeText(RegisterActivity.this, "Algo salió mal", Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onFailure(Call<Boolean> call, Throwable t) {

                Toast.makeText(RegisterActivity.this, "Algo salió mal...  :( ", Toast.LENGTH_LONG).show();

            }
        });

    }

}
