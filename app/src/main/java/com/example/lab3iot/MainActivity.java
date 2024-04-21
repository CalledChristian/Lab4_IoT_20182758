package com.example.lab3iot;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private EditText movieIMDb;
    private Button buscarButton;

    private String movieId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }


    public void irContadorPrimos(View view) {

        //primero crear el intento
        Intent intent = new Intent(this, ContadorPrimosActivity.class);
        //iniciar activity
        startActivity(intent);

    }

    public void irBuscadorPeliculas(View view) {

        movieIMDb = findViewById(R.id.editTextText);
        buscarButton = findViewById(R.id.button2);

        //codigo basado en gpt
        //inicio
        buscarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!movieId.isEmpty()) {
                    movieId = movieIMDb.getEditableText().toString();
                    Log.d("id",movieId);
                } else {
                    Toast.makeText(MainActivity.this, "Ingrese un ID de IMDb", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //fin

        //primero crear el intento
        Intent intent = new Intent(this, BuscadorPeliculasActivity.class);
        intent.putExtra("movieID",movieId);
        //iniciar activity
        startActivity(intent);

    }
}

