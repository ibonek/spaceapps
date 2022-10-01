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

public class nivel3Controller {
private OpcionesJuego opciones;
    @FXML
    private Button bLupa;

    @FXML
    private Button bNeptuno;

    @FXML
    private Button bPluto;

    @FXML
    private Button bUrano;

    @FXML
    private HBox cabecera5;

    @FXML
    private Label eNombre;

    @FXML
    private HBox fondo3;

    @FXML
    private Label puntos;

    @FXML
    private ImageView vida1;

    @FXML
    private ImageView vida2;

    @FXML
    private ImageView vida3;

    @FXML
    void bNeptuno(ActionEvent event) {

    }

    public OpcionesJuego getOpciones() {
        return opciones;
    }

    public void setOpciones(OpcionesJuego opciones) {
        this.opciones = opciones;
    }
    @FXML
    void botonLupa(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("selectorNiveles.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        SelectorController controller = fxmlLoader.getController();
        controller.setOpciones(opciones,opciones.juego.getNombre());
        Stage stage1 = (Stage) bNeptuno.getScene().getWindow();
        stage1.close();
        stage.setTitle("World Map");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void botonPluto(ActionEvent event) {

    }

    @FXML
    void botonUrano(ActionEvent event) {

    }
    public void ponerNombre(String n){
        eNombre.setText(n);

    }
}
