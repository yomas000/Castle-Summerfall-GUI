package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class FirstController {

    @FXML
    private void goToSettings(){
        try {
            App.setRoot("settings");
        } catch (IOException e) {
           System.out.println("Couldn't find that file");
        }
    }
}
