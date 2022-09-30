package com.example.spaceapps;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class nivel1Controller {

    @FXML
    private HBox fondo1;

    @FXML
    private Button bLuna;

    @FXML
    private Button bMercurio;

    @FXML
    private Button bVenus;

    @FXML
    private MenuButton botonN2;

    @FXML
    private ImageView botonSaturno;

    @FXML
    private Label eNombre;

    @FXML
    void IrANivel3(ActionEvent event) {

    }

    @FXML
    void IrANivel4(ActionEvent event) {

    }

    @FXML
    void IrANivel5(ActionEvent event) {

    }

    @FXML
    void bVenus(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ventanaOpcMult.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        controllerOpciones controller = fxmlLoader.getController();
        controller.setearPreguntas(0);
        stage.setTitle("Pregunta 1");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void botonLuna(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ventanaOpcMult.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        controllerOpciones controller = fxmlLoader.getController();
        controller.setearPreguntas(1);
        stage.setTitle("Pregunta 2");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void botonMercurio(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("v-f.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        vfController controller = fxmlLoader.getController();
        controller.setearPreguntas(2);
        stage.setTitle("Pregunta 3");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void irANivel2(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nivel2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        Stage stage1 = (Stage) bVenus.getScene().getWindow();
        nivel2Controller controlador = fxmlLoader.getController();
        stage1.close();
        stage.setTitle("Level 2");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }
    public void ponerNombre(String n){
        eNombre.setText(n);
    }
}

