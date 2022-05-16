package com.example.schedulingapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class HelloApplication extends Application {
    Stage window;
    Scene addingEvent;
    @Override
    public void start(Stage stage) throws IOException {
        /*
        Scene scene = new Scene(320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        */
        //Hanno's adding event scene. Do not edit
        window = stage;
        VBox layout1 = new VBox();
        addingEvent = new Scene(layout1, 800,600);
        window.setScene(addingEvent);
        window.setTitle("Adding new Event");
        //window.show();
        //end of scene
        
    }

    public static void main(String[] args) {
        launch();
    }
}
