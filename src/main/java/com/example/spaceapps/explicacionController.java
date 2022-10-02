package com.example.spaceapps;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class explicacionController {

    @FXML
    private Pane fondo;

    @FXML
    private ImageView imagen;

    @FXML
    private Label texto;

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
