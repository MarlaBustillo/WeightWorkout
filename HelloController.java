package com.example.weightworkoutfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onstartButtonClick() {
        welcomeText.setText("Welcome to WeightWorkout!");


    }
}
