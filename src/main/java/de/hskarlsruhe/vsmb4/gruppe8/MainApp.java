
package de.hskarlsruhe.vsmb4.gruppe8;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class MainApp extends Application {

    @FXML
    public Button btn_start;

    public static void main (String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {


        Parent root = FXMLLoader.load(getClass().getResource("Startseite.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Rush Hour");
        primaryStage.show();



    }


}
