package com.example;

import java.io.IOException;

import javafx.fxml.FXML;

public class settingController {

    @FXML
    private void goHome() throws IOException{;
            App.setRoot("first");
    }
}
