package com.example.lab3iot;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface OMBDService {

    //@FormUrlEncoded
    //?apikey=bf81d461"
    @GET("/")
    Call<Movie> getMovie (  @Query("apikey") String apikey,
                            @Query("i") String id);

}
