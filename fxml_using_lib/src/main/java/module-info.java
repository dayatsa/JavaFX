module org.openjfx {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires eu.hansolo.medusa; 
 
    opens org.openjfx.controller to javafx.fxml;
    exports org.openjfx;
}