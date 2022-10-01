package com.example.spaceapps;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class SelectorController {

    OpcionesJuego opciones;
    @FXML
    private Button bLevel1;

    @FXML
    private Button bLevel2;

    @FXML
    private Button bLevel3;

    @FXML
    private Button bLevel4;

    @FXML
    private Button bLevel5;

    @FXML
    private Label eNombre;

    @FXML
    private HBox fondoSelect;

    @FXML
    void BotonLevel5(ActionEvent event) {

    }

    @FXML
    void botonLevel1(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nivel1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        nivel1Controller controlador = fxmlLoader.getController();
        controlador.ponerNombre(opciones.juego.getNombre());
        controlador.setOpciones(opciones);
    }

    @FXML
    void botonLevel2(ActionEvent event) {

    }

    @FXML
    void botonLevel3(ActionEvent event) {

    }

    @FXML
    void botonLevvel4(ActionEvent event) {

    }

    public OpcionesJuego getOpciones() {
        return opciones;
    }

    public void setOpciones(OpcionesJuego opciones) {
        this.opciones = opciones;
    }
}
