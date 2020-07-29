package com.julianjupiter.viewfx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ViewFX<T extends Controller, U extends Parent> {
    private static final String FXML_EXTENSION = ".fxml";
    private final Class<? extends Controller> controllerClass;
    private final ResourceBundle resourceBundle;
    private FXMLLoader loader;
    private U u;

    private ViewFX(Class<? extends Controller> controllerClass, ResourceBundle resourceBundle) throws IOException {
        this.controllerClass = controllerClass;
        this.resourceBundle = resourceBundle;
        this.load();
    }

    public static <T extends Controller, U extends Parent> ViewFX<T, U> of(Class<T> controllerClass, Class<U> componentClass) {
        try {
            return new ViewFX<>(controllerClass, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T extends Controller, U extends Parent> ViewFX<T, U> of(Class<T> controllerClass, Class<U> componentClass, ResourceBundle resourceBundle) {
        try {
            return new ViewFX<>(controllerClass, resourceBundle);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void load() throws IOException {
        this.loader = new FXMLLoader(this.fxmlUrl(), this.resourceBundle);
        this.u = this.loader.load();
    }

    private URL fxmlUrl() {
        return this.controllerClass.getResource(this.controllerClass.getSimpleName() + FXML_EXTENSION);
    }

    public U component() {
        return u;
    }

    public T controller() {
        return this.loader.getController();
    }
}
