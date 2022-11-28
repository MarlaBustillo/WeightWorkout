package com.example.weightworkout2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class HelloController {
    @FXML
    private Label welcomeText;
    private Label workouts;
    private Label bodyparts;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to Weight Workouts!");
        welcomeText.setText("Your guide to weight loss!");

    }
    protected void onWorkoutButtonClick(){
        workouts.setText("Please enter what workouts you would like to do");
        ArrayList<String> arms=new ArrayList<>();
        arms.add("Pull ups");
        arms.add("Chairdips");
        arms.add("Bicep Curls");



    }
    protected void onBodypartButtonClick(){
        ArrayList<String> bodypart = new ArrayList<String>();
        bodypart.add("0. Warmup");
        bodypart.add("1.Arms");
        bodypart.add("2.Legs");
        bodypart.add("3.Core");
        bodypart.add("4.Glutes");
        bodyparts.setText("Please choose from the following:");
        bodyparts.setText(String.valueOf(bodypart));
    }
}
