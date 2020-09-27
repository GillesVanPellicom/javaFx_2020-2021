package me.gillesvanpellicom.ex1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("style.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("ex1");
        primaryStage.show();
    }
}
