package com.example.lab3iot;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface OMBDService {

    // de la forma/?apikey=bf81d461&i=tt3896198
    /*@GET("/")
    Call<Movie> getMovie(@Query("apikey") String apikey,
                         @Query("i") String id);*/

    @FormUrlEncoded
    @POST("/?apikey=bf81d461")
    Call<String> getMovie (@Field("i") String id);

}
