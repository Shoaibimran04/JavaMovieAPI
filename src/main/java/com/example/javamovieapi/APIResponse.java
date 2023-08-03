package com.example.javamovieapi;

import java.util.List;

public class APIResponse {
    public int page;
    public List<Movie> results;

    public List<Movie> getMovies() {
        return results;
    }
}
