package com.example.controller;

import com.julianjupiter.viewfx.Controller;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


public class HelloController implements Controller, Initializable {
    private Stage primaryStage;
    private ResourceBundle resourceBundle;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.resourceBundle = resourceBundle;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    private void sayHello() {
        System.out.println("say hello");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Say Hello");
        alert.setContentText(resourceBundle.getString("say.hello"));
        alert.initModality(Modality.WINDOW_MODAL);
        System.out.println("say hi");
        alert.initOwner(primaryStage);
        alert.showAndWait();
    }
}
