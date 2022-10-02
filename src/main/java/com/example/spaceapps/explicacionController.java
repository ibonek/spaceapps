package com.example.spaceapps;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class explicacionController {

    @FXML
    private ImageView NASA_logo;

    @FXML
    private Button bBack;

    @FXML
    private HBox fondo;

    @FXML
    private ImageView james_webb_1;

    @FXML
    private Label texto;

    @FXML
    private ImageView ultraviolet;

    @FXML
    private ImageView webb_cameras;

    @FXML
    private ImageView webb_dimensiones;

    @FXML
    private ImageView webb_distance;

    @FXML
    private ImageView webb_locations;

    @FXML
    private ImageView webb_mars;

    @FXML
    private ImageView webb_objective;

    @FXML
    private ImageView webb_southern;

    @FXML
    private ImageView webb_telescope;

    @FXML
    private ImageView webb_temperature;

    @FXML
    private ImageView webb_vs_hubble;

    @FXML
    private ImageView imagen;

    @FXML
    void botonBack(ActionEvent event) {

    }
    OpcionesJuego opciones;

    public void setTexto(String t){
        texto.setText(t);
    }

    private Image image;
    public void setearImagenes(Image imagenRec){
        image = imagenRec;
        imagen.setImage(image);
        imagen.setVisible(true);
        System.out.println("he llegado" + image.getUrl());
    }

    public void setOpciones(OpcionesJuego opciones) { this.opciones = opciones; }


}
