package com.curso.android.app.practica.paginglibrary.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieResponse {

    //page
    @SerializedName("page")
    @Expose
    private int page;

    //results
    @SerializedName("results")
    @Expose
    private List<Movie> movies = null;

    //total_pages
    @SerializedName("total_pages")
    @Expose
    private int totalPages;

    //total_results
    @SerializedName("total_results")
    @Expose
    private int totalResults;

    // Getters and Setters
    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

}