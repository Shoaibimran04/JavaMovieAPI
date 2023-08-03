package com.example.javamovieapi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.List;

public class MovieController {

    @FXML
    private TextField SearchBar;

    @FXML
    private ListView<String> movieListView;

    @FXML
    void searchBtn(ActionEvent event) {
        try {
            List<Movie> movies = APIUtility.getMovies(SearchBar.getText());
            for(Movie movie: movies) {
                movieListView.getItems().add(movie.getMovieDetail().getMovieTitle());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
