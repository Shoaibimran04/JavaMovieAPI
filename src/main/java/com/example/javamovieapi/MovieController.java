package com.example.javamovieapi;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

public class MovieController implements Initializable {

    @FXML
    private Text name;
    @FXML
    private ListView<String> movieListView;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            List<Movie> movies = APIUtility.getMovies("Barbie");
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
