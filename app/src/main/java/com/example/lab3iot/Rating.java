package com.example.lab3iot;

import com.google.gson.annotations.SerializedName;

public class Rating {

    @SerializedName("Source")
    private String source;

    @SerializedName("Value")
    private String value;
}
