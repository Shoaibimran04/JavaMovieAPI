package com.example.javamovieapi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MovieDetailsViewController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}