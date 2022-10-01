package com.example.spaceapps;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class nivel5Controller {

    @FXML
    private Button bAguNegro;

    @FXML
    private Button bAnillos;

    @FXML
    private Button bLupa;

    @FXML
    private Button bSuperNova;

    @FXML
    private HBox cabecera5;

    @FXML
    private Label eNombre;

    @FXML
    private HBox fondo5;

    @FXML
    private ImageView imagenAguNegro;

    @FXML
    private ImageView imagenAnillos;

    @FXML
    private ImageView imagenSuperNova;

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
    void botonAguNegro(ActionEvent event) {

    }

    @FXML
    void botonAnillos(ActionEvent event) {

    }

    @FXML
    void botonLupa(ActionEvent event) throws IOException {
        Stage stage1 = (Stage) bAguNegro.getScene().getWindow();
        stage1.close();
    }

    @FXML
    void botonSuperNova(ActionEvent event) {

    }
    public void ponerNombre(String n){
        eNombre.setText(n);
    }
    public String getPuntos(){return puntos.getText();}
    public void setPuntos(int n){
        puntos.setText(n + "");
    }
}
