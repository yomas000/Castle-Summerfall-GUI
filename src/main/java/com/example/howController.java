package com.example;

import java.io.IOException;

import javafx.fxml.FXML;

public class howController {
    
    @FXML
    private void goHome() throws IOException{
        App.setRoot("first");
    }
}
