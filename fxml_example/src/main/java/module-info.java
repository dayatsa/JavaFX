module org.openjfx {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
 
    opens org.openjfx.controller to javafx.fxml;
    exports org.openjfx;
}