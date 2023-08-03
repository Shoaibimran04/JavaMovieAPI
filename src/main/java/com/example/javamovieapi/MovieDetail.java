package com.example.javamovieapi;

public class MovieDetail {
    public String movieTitle;
    public String description;
    public String release_date;

    public MovieDetail(String movieTitle, String description, String release_date) {
        this.movieTitle = movieTitle;
        this.description = description;
        this.release_date = release_date;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getDescription() {
        return description;
    }

    public String getRelease_date() {
        return release_date;
    }
}
