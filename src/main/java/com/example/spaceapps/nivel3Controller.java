package com.example.spaceapps;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class nivel3Controller {

    @FXML
    private Button bNeptuno;

    @FXML
    private Button bPluto;

    @FXML
    private Button bUrano;

    @FXML
    private MenuButton botonN2;

    @FXML
    private Label eNombre;

    @FXML
    private HBox fondo3;

    @FXML
    void IrANivel1(ActionEvent event) {

    }

    @FXML
    void IrANivel4(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nivel4.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        Stage stage1 = (Stage) bUrano.getScene().getWindow();
       // nivel2Controller controlador = fxmlLoader.getController();
        stage1.close();
        stage.setTitle("Level 4");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void IrANivel5(ActionEvent event) {

    }

    @FXML
    void bNeptuno(ActionEvent event) {

    }

    @FXML
    void botonPluto(ActionEvent event) {

    }

    @FXML
    void botonUrano(ActionEvent event) {

    }

    @FXML
    void irANivel2(ActionEvent event) {

    }

}
