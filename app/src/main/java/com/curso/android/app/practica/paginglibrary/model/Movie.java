package com.curso.android.app.practica.paginglibrary.model;

import androidx.annotation.Nullable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Movie {

    // id
    @SerializedName("id")
    @Expose
    private int id;

    //poster path
    @SerializedName("poster_path")
    @Expose
    private String poster_path;

    // vote average
    @SerializedName("vote_average")
    @Expose
    private double vote_average;

    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public double getVote_average() {
        return vote_average;
    }

    public void setVote_average(double vote_average) {
        this.vote_average = vote_average;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj == null){
            return false;
        } else if (obj == this) {
            return true;
        }
        return false;
    }
}
