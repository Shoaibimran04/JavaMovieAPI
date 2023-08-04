package com.example.javamovieapi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class DetailsView {

    @FXML
    private Text movieName;
    private Text movieDescription;
    private Text movieReleaseDate;

    public void loadDetails(MovieDetail movie) {
        movieName.setText(movie.getMovieTitle());
        movieDescription.setText(movie.getDescription());
//        movieReleaseDate.setText(movie.getRelease_date());
    }

    @FXML
    void back(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/javamovieapi/movie-view.fxml"));
        Parent root = loader.load();

        stage.setScene(new Scene(root));
    }

}
