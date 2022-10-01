package com.example.spaceapps;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;


public class nivel2Controller {

    @FXML
    private Button bJupiter;

    @FXML
    private Button bLupa;

    @FXML
    private Button bMarte;

    @FXML
    private Button bSaturno;

    @FXML
    private ImageView botonSaturno;

    @FXML
    private HBox cabecera5;

    @FXML
    private Label eNombre;

    @FXML
    private HBox fondo2;

    @FXML
    private Label puntos;

    @FXML
    private ImageView vida1;

    @FXML
    private ImageView vida2;

    @FXML
    private ImageView vida3;

    private OpcionesJuego opciones;
    public OpcionesJuego getOpciones() {
        return opciones;
    }

    public void setOpciones(OpcionesJuego opciones) {
        this.opciones = opciones;
    }


    @FXML
    void botonJupiter(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ventanaOpcMult.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        controllerOpciones controller = fxmlLoader.getController();
        controller.setearPreguntas(3);
        stage.setTitle("Pregunta 3");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void botonMarte(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("v-f.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        vfController controller = fxmlLoader.getController();
        controller.setearPreguntas(4);
        stage.setTitle("Pregunta 4");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    void botonSaturno(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ventanaOpcMult.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        controllerOpciones controller = fxmlLoader.getController();
        controller.setearPreguntas(5);
        stage.setTitle("Pregunta 5");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    void botonLupa(ActionEvent event) {

    }

}


