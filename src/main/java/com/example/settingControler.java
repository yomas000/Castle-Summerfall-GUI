package com.example;

import java.io.IOException;

import javafx.fxml.FXML;

public class settingControler {

    @FXML
    private void goHome(){
        try {
            App.setRoot("first");
        } catch (IOException e) {
           System.out.println("Couldn't find that file");
        }
    }
}
