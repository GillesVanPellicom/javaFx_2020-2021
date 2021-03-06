package me.gillesvanpellicom.ex3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main3 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("style.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("ex3");
        primaryStage.show();
    }
}
