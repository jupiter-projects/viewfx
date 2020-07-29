package com.example;

import com.example.controller.HelloController;
import com.julianjupiter.viewfx.ViewFX;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Hello extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        var locale = new Locale("en");
        var resourceBundle = ResourceBundle.getBundle("messages", locale);
        var view = ViewFX.of(HelloController.class, AnchorPane.class, resourceBundle);
        var anchorPane = view.component();
        var scene = new Scene(anchorPane);
        stage.setScene(scene);
        var helloController = view.controller();
        helloController.setPrimaryStage(stage);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}