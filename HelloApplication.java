package com.example.weightworkoutfx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("WeightWorkout");
        Label title= new Label("Welcome to WeightWorkout!");
        Label space= new Label(" ");
        Label label1= new Label("Enter Name, Weight, and Height");
        TextArea textArea = new TextArea();
        textArea.setText("Name:"+"\nWeight:"+"\nHeight:");
        Button button = new Button("Submit");
        button.setMinWidth(50);

        button.setOnAction(action -> {
            System.out.println(textArea.getText());

            textArea.setText("Saved!");

        });
        Label help=new Label("Getting Started!");

        Hashtable<String, String> ht1 = new Hashtable<>();


        ht1.put("Fat Loss", " 12 reps, 3 sets");
        ht1.put("Gain Muscle", "8 reps, 3 sets");
        ht1.put("Health and Endurance", "16 reps, 3 sets");
        TextField textField1 = new TextField();

        textField1.setText("Here are some tips: "+ht1);

        System.out.println("Here are some tips:"+"\n"+ht1);
        Label info1= new Label("Please choose a workout:");
        Label space2= new Label("");



        VBox vbox = new VBox(8); // spacing = 8
        Button Core = new Button("Core");
        Core.setOnAction(action -> {
            Label COREWORKOUTS= new Label("1.Turkish Get Up"+"\n2.Russin Twists"+"\n3.Cable Machine Crunches");
            vbox.getChildren().addAll(COREWORKOUTS);
            ArrayList<String> COREW = new ArrayList<String>();
            COREW.add("1.Turkish Get Up");
            COREW.add("2.Russian Twists");
            COREW.add("3.Cable Machine Crunches");
            System.out.println(COREW);

        });
        Button LowerBody  = new Button("Lower-Body");
        LowerBody.setOnAction(action -> {
            Stack LBs=new Stack();
            LBs.add("1.Leg Press");
            LBs.add("2.Leg Extensions");
            LBs.add("3.Seated Leg Curl");
            Label LB= new Label("1.Leg Press"+"\n2.Leg Extensions"+"\n3.Seated Leg Curl");
            System.out.println(LBs);
            vbox.getChildren().addAll(LB);


        });
        Button UpperBody  = new Button("Upper-Body");
        UpperBody.setOnAction(action -> {
            Label UB= new Label("1.Shoulder Press"+"\n2.Cable Biceps Bar"+"\n3.Chest Press");
            vbox.getChildren().addAll(UB);

        });
        Button CoolDown  = new Button("Cool Down Cardio");
       CoolDown.setOnAction(action -> {
            Label CD= new Label("1.Stair Master"+ "\n2.TrueForm Trainer"+"\n3.Treadmill");
            vbox.getChildren().add(CD);

        });




            vbox.getChildren().addAll(title,space,label1,textArea,button,help,textField1,info1,space2,Core,LowerBody,UpperBody,CoolDown);


        Scene scene = new Scene(vbox, 500, 500, Color.BLUE);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
