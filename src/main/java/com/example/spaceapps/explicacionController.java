package com.example.spaceapps;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class explicacionController {

    @FXML
    private Pane fondo;

    @FXML
    private ImageView imagen;

    @FXML
    private Label texto;

    public void setTexto(String t){
        texto.setText(t);
    }

}
