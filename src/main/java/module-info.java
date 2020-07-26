module com.julianjupiter.viewfx {
    requires javafx.fxml;
    requires javafx.graphics;

    exports com.julianjupiter.viewfx;
    opens com.julianjupiter.viewfx to javafx.fxml;
}