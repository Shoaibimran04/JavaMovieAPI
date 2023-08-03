package com.example.javamovieapi;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class APIUtility {
    private static String apiKey = "0fc14a0b8563c2cfe2985a0e1048bfe2";


    //search API request with keyword
    public static List<Movie> getMovies(String keyword) throws IOException, InterruptedException {
        List<Movie> movieDetails = new ArrayList<>();
        String uri = "https://api.themoviedb.org/3/search/movie?api_key=" + apiKey + "&query=" + keyword;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String responseJSON = response.body();

        System.out.println(responseJSON);

        System.out.println(responseJSON);
        Gson gson = new Gson();
        APIResponse apiResponse = gson.fromJson(responseJSON, APIResponse.class);

        for (Movie movie : apiResponse.getMovies()) {
            movieDetails.add(movie);
       }

        return movieDetails;
    }
}