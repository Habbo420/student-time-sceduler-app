
/* This is the start of a  block comment



package com.example.checkbox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.collections.*;
import javafx.stage.Stage;
import javafx.scene.paint.*;

public class Settings extends Application {

    // launch the application
    public void start(Stage s)
    {
        // set title for the stage
        s.setTitle("Settings");

        // create a tile pane
        TilePane r = new TilePane();

        // create a label
        Label l = new Label("Notifications");

        // string array
        String st[] = { "popup" };

        // add label
        r.getChildren().add(l);

        for (int i = 0; i < st.length; i++) {

            // create a checkbox
            CheckBox c = new CheckBox(st[i]);

            // add label
            r.getChildren().add(c);

            // set IndeterMinate
            c.setIndeterminate(true);
        }

        // create a label
        Label f = new Label("Filter");
        // add label
        r.getChildren().add(f);


// Filter
        String sort[] =
                { "Date", "Time", "Name",
                        "ascending", "descending" };

        // Create a combo box
        ComboBox combo_box =
                new ComboBox(FXCollections
                        .observableArrayList(sort));
        // add label
        r.getChildren().add(combo_box);
//--------------------------------------------------------------------------------------------

        // create a label
        Label v = new Label("Class reminders");
        // add label
        r.getChildren().add(v);


// Filter
        String classses[] =
                { "Don't remind me ", "Remind me 5 minutes before", "Remind me 15 minutes before",
                        "Remind me 30 minutes before" };

        // Create a combo box
        ComboBox combo =
                new ComboBox(FXCollections
                        .observableArrayList(classses));
        // add label
        r.getChildren().add(combo);
//--------------------------------------------------------------------------------------------

        // create a label
        Label I = new Label("Assingment reminders");
        // add label
        r.getChildren().add(I);


// Filter
        String assingment[] =
                { "Don't remind me ", "Remind me 5 minutes before", "Remind me 15 minutes before",
                        "Remind me 30 minutes before" };

        // Create a combo box
        ComboBox comb =
                new ComboBox(FXCollections
                        .observableArrayList(assingment));
        // add label
        r.getChildren().add(comb);

//--------------------------------------------------------------------------------------------

        // create a label
        Label b = new Label("Exam reminders");
        // add label
        r.getChildren().add(b);


// Filter
        String exam[] =
                { "Don't remind me ", "Remind me 5 minutes before", "Remind me 15 minutes before",
                        "Remind me 30 minutes before" };

        // Create a combo box
        ComboBox com =
                new ComboBox(FXCollections
                        .observableArrayList(exam));
        // add label
        r.getChildren().add(com);
        // create a scene
        Scene sc = new Scene(r, 500, 140,Color.WHITE);

        // set the scene
        s.setScene(sc);
        s.setResizable(false);
        s.show();
    }

  
}
*/  //This is the end of a  block comment