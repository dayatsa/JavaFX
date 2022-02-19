package org.openjfx;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {

        URL url = App.class.getResource("view/test.fxml");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(url);

        BorderPane root = null;
        try {
            root = loader.<BorderPane>load();
        } catch (IOException e) {
            //TODO: handle exception
            e.printStackTrace();
        }

        Scene scene = new Scene(root, 600, 400);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}