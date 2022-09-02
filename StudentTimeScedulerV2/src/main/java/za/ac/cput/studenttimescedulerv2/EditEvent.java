/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.studenttimescedulerv2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 *
 * @author Hanno
 */
public class EditEvent {
      Scene editEvent;
    GridPane editevent_Grid;


    Label lblEditEvent_Heading, lblEditEvent_Type, lblEditEvent_Date, lblEditEvent_Start,
            lblEditEvent_End, lblEditEvent_Repeat, lblEditEvent_Reminder, lblEditEvent_Priority,
            lblEditEvent_Description, lblEditEvent_EventName, lblEditEvent_Min, lblEditEvent_Start2,
            lblEditEvent_End2;
    Button btnEditEvent_Cancel,btnEditEvent_Save;
    TextField txtEditEvent_EventName;
    ComboBox cmbEditEvent_Type, cmbEditEvent_Start, cmbEditEvent_End;
    ColorPicker clpEditEvent_Color;
    DatePicker dtpEditEvent_Date;
    Spinner spnEditEvent_Reminder, spnEditEvent_Priority, spnEditEvent_StartHours, spnEditEvent_StartMin,
            spnEditEvent_EndHours, spnEditEvent_EndMin ;
    TextArea txtaEditEvent_Description;

    public void setEditEvent_GUI(){
        editevent_Grid = new GridPane();
        //bPane = new BorderPane();
        editEvent = new Scene(editevent_Grid, 600,550);

        //respective classes/nodes
        lblEditEvent_Heading = new Label("Edit Event");
        lblEditEvent_EventName = new Label("Event name: ");
        lblEditEvent_Type = new Label("Event Type: ");
        lblEditEvent_Date = new Label("Date: ");
        lblEditEvent_Start = new Label("Start: ");
        lblEditEvent_End = new Label("End: ");
        lblEditEvent_Repeat = new Label("Repeat: ");
        lblEditEvent_Reminder = new Label("Reminder: ");
        lblEditEvent_Priority = new Label("Priority: ");
        lblEditEvent_Description = new Label("Description: ");
        lblEditEvent_Min = new Label("min's");
        lblEditEvent_End2 = new Label(":");
        lblEditEvent_Start2 = new Label(":");

        btnEditEvent_Cancel = new Button("Cancel");
        btnEditEvent_Save = new Button("Save Event");

        txtEditEvent_EventName = new TextField();

        String arrType[] = {"Custom", "Study", "Assessment", "Assignment", "Class"};
        cmbEditEvent_Type = new ComboBox();
        cmbEditEvent_Type.getItems().addAll(arrType);
        cmbEditEvent_Start = new ComboBox();
        cmbEditEvent_Start.getItems().addAll("AM", "PM");
        cmbEditEvent_End = new ComboBox();
        cmbEditEvent_End.getItems().addAll("AM", "PM");

        dtpEditEvent_Date = new DatePicker();

        spnEditEvent_Reminder = new Spinner<>(0,60,0,5);
        spnEditEvent_Priority = new Spinner<>(1,10,0,1);
        spnEditEvent_StartHours = new Spinner<>(1,12,0,1);
        spnEditEvent_EndHours = new Spinner<>(1,12,0,1);
        spnEditEvent_StartMin = new Spinner<>(0,60,0,1);
        spnEditEvent_EndMin = new Spinner<>(0,60,0,1);

        txtaEditEvent_Description = new TextArea();

        setEditEvent_Grid();
        setEditEvent();
        functionality();
    }

    public void setEditEvent() {
       editevent_Grid.setBackground(new Background(new BackgroundFill(Color.HONEYDEW, CornerRadii.EMPTY, Insets.EMPTY)));
        editevent_Grid.setHgap(10);
        editevent_Grid.setVgap(10);
        Font f1 = new Font("Serif",  20);
        Font f2 = new Font("Serif",  14);
        lblEditEvent_Heading.setFont(f1);
        lblEditEvent_Heading.setTextFill(Color.CRIMSON);
        lblEditEvent_EventName.setFont(f2);
        lblEditEvent_Type.setFont(f2);
        lblEditEvent_Date.setFont(f2);
        lblEditEvent_Start.setFont(f2);
        lblEditEvent_End.setFont(f2);
        lblEditEvent_Repeat.setFont(f2);
        lblEditEvent_Reminder.setFont(f2);
        lblEditEvent_Priority.setFont(f2);
        lblEditEvent_Description.setFont(f2);
        lblEditEvent_Min.setFont(f2);
        lblEditEvent_End2.setFont(f2);
        lblEditEvent_Start2.setFont(f2);

    }

    public void setEditEvent_Grid (){
        editevent_Grid.setAlignment(Pos.TOP_CENTER);
        editevent_Grid.add(lblEditEvent_Heading, 0, 0, 1, 1);
        editevent_Grid.add(lblEditEvent_EventName,0,1,1,1);
        editevent_Grid.add(txtEditEvent_EventName,1,1,1,1);

        editevent_Grid.add(lblEditEvent_Type,0,2,1,1);
        editevent_Grid.add(cmbEditEvent_Type,1,2,1,1);

        editevent_Grid.add(lblEditEvent_Date,0,3,1,1);
        editevent_Grid.add(dtpEditEvent_Date,1,3,1,1);

        editevent_Grid.add(lblEditEvent_Start,0,4,1,1);
        editevent_Grid.add(spnEditEvent_StartHours,1,4,1,1);
        editevent_Grid.add(lblEditEvent_Start2,2,4,1,1);
        editevent_Grid.add(spnEditEvent_StartMin,3,4,1,1);
        editevent_Grid.add(cmbEditEvent_Start,4,4,1,1);

        editevent_Grid.add(lblEditEvent_End,0,5,1,1);
        editevent_Grid.add(spnEditEvent_EndHours,1,5,1,1);
        editevent_Grid.add(lblEditEvent_End2,2,5,1,1);
        editevent_Grid.add(spnEditEvent_EndMin,3,5,1,1);
        editevent_Grid.add(cmbEditEvent_End,4,5,1,1);

        editevent_Grid.add(lblEditEvent_Reminder,0,6,1,1);
        editevent_Grid.add(spnEditEvent_Reminder,1,6,1,1);
        editevent_Grid.add(lblEditEvent_Min,2,6,1,1);

        editevent_Grid.add(lblEditEvent_Priority,0,7,1,1);
        editevent_Grid.add(spnEditEvent_Priority,1,7,1,1);

        editevent_Grid.add(lblEditEvent_Description,0,8,1,1);

        editevent_Grid.add(txtaEditEvent_Description,0,9,5,5);

        editevent_Grid.add(btnEditEvent_Save,0,14,1,1);
        editevent_Grid.add(btnEditEvent_Cancel,1,14,1,1);

    }

    public void functionality(){
        btnEditEvent_Cancel.setOnAction(e-> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("You clicked on the cancel button");
           // alert.getDialogPane().setExpandableContent(new TextArea("you clicked the cancel button"));
            alert.showAndWait();
            System.exit(0);
        } );

        btnEditEvent_Save.setOnAction(e -> {
            validation();
        });

    }

    public void validation(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        if (txtEditEvent_EventName.getText().equals("")){
            alert.setTitle("error");
            alert.setHeaderText("Event name must be entered");
            alert.showAndWait();
            txtEditEvent_EventName.requestFocus();
        } else if (cmbEditEvent_Type.getValue() == null) {
            alert.setTitle("error");
            alert.setHeaderText("Event type needs to be selected");
            alert.showAndWait();
            cmbEditEvent_Type.requestFocus();
        } else if (dtpEditEvent_Date.getValue() == null) {
            alert.setTitle("error");
            alert.setHeaderText("Date needs to be selected");
            alert.showAndWait();
            dtpEditEvent_Date.requestFocus();
        } else if (spnEditEvent_Reminder.getValue().equals(0)) {
            alert.setTitle("error");
            alert.setHeaderText("Reminder cannot be 0 min's ");
            alert.showAndWait();
            spnEditEvent_Reminder.requestFocus();
        }
    }

    public String getTitle(){
        return "Edit Event";
    }
}
