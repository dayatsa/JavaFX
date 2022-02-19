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
    public void start(Stage stage) throws IOException {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();
        
        System.out.println("Working Directory = " + System.getProperty("user.dir"));

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

        // var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        // var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}