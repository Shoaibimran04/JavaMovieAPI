package com.example.javamovieapi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class MovieController {

    @FXML
    private TextField SearchBar;

    @FXML
    private ListView<MovieDetail> movieListView;
    @FXML
    void getMovieDetail(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        MovieDetail movie = movieListView.getSelectionModel().getSelectedItem();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/javamovieapi/details-view.fxml"));
        Parent root = loader.load();

        DetailsView detailsController = loader.getController();
        detailsController.loadDetails(movie);

        stage.setScene(new Scene(root));

    }

    @FXML
    void searchBtn(ActionEvent event) {
        try {
            List<Movie> movies = APIUtility.getMovies(SearchBar.getText());
            for(Movie movie: movies) {
                movieListView.getItems().add(movie.getMovieDetail());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
