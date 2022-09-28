package com.example.spaceapps;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button bBegin;

    @FXML
    private TextField nombre;

    @FXML
    private Button bContinue;

    @FXML
    private HBox fondo;

    @FXML
    private Label lLoad;

    @FXML
    private Label lNew;

    @FXML
    private VBox marcoNombre;

    @FXML
    void pressBegin(ActionEvent event) throws IOException {
        if(!nombre.getText().isBlank()) {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ventanaOpcMult.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            Stage stage1 = (Stage) bBegin.getScene().getWindow();
            //controllerOpciones controlador = fxmlLoader.getController();
            //controlador.setearPreguntas(0);
            stage1.close();
            stage.setTitle("Hello!");
            stage.setMaximized(false);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
    }

    @FXML
    void pressContinue(ActionEvent event) {

    }

}
