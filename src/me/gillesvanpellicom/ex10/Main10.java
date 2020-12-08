package me.gillesvanpellicom.ex9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main9 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("style.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("ex9");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
