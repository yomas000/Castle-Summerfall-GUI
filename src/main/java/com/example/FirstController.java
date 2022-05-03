package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class FirstController {

    @FXML
    private void goToSettings() throws IOException{
        App.setRoot("settings");
    }
}
