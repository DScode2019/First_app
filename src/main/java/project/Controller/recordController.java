package project.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class recordController {

    @FXML
    private TextField first_Name;

    @FXML
    private TextField Last_Name;

    @FXML
    private Button addRecord;

    @FXML
    private Label clear;




    @FXML
    public void Clear(){
        first_Name.setText("");
        Last_Name.setText("");
    }




}
