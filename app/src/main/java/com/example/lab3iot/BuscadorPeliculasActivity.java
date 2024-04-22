package com.example.lab3iot;

import android.content.Intent;
import android.os.Bundle;
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

public class BuscadorPeliculasActivity extends AppCompatActivity {

    private String movieID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_buscador_peliculas);

        //datos de pelicula
        TextView pelicula = findViewById(R.id.text1);
        TextView director = findViewById(R.id.textdirector);
        TextView actores = findViewById(R.id.campo2_1);
        TextView fechaEstreno = findViewById(R.id.campo3_1);
        TextView generos = findViewById(R.id.campo4_1);
        TextView escritores = findViewById(R.id.campo5_1);
        TextView trama = findViewById(R.id.text10);


        Intent intent1 = getIntent();
        movieID = intent1.getStringExtra("movieID");

        OMBDService ombdService= new Retrofit.Builder()
                .baseUrl("https://www.omdbapi.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(OMBDService.class);

        ombdService.getMovie("bf81d461",movieID).enqueue(new Callback<Movie>() {
            @Override
            public void onResponse(Call<Movie> call, Response<Movie> response) {
                if(response.isSuccessful()) {
                    Movie movie = response.body();
                    Log.d("msg-test", "aws: " + movie.getDirector());
                    pelicula.setText(movie.getTitle());
                    director.setText(movie.getDirector());
                    actores.setText(movie.getActores());
                    fechaEstreno.setText(movie.getFechaEstreno());
                    generos.setText(movie.getGeneros());
                    escritores.setText(movie.getEscritores());
                    trama.setText(movie.getTrama());

                }else{
                    Log.d("msg-test", "error en la respuesta del webservice");
                }
            }
            @Override
            public void onFailure(Call<Movie> call, Throwable t) {
                t.printStackTrace();
            }


        });

    }

}
