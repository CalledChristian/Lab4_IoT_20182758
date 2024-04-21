package com.example.lab3iot;

import android.net.Uri;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Movie  {

    @SerializedName("Title")
    private String title;
    @SerializedName("Director")
    private String director;

    @SerializedName("Actors")
    private String actores;

    @SerializedName("Released")
    private String fechaEstreno;

    @SerializedName("Genre")
    private String generos;

    @SerializedName("Writer")
    private String escritores;

    @SerializedName("Plot")
    private String trama;

    /*@SerializedName("Ratings")
    private List<Rating> rating;*/

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(String fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public String getGeneros() {
        return generos;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    public String getEscritores() {
        return escritores;
    }

    public void setEscritores(String escritores) {
        this.escritores = escritores;
    }

    public String getTrama() {
        return trama;
    }

    public void setTrama(String trama) {
        this.trama = trama;
    }
}
