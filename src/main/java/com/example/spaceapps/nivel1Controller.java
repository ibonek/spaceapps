package com.example.spaceapps;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

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
    void bVenus(ActionEvent event) {

    }

    @FXML
    void botonLuna(ActionEvent event) {

    }

    @FXML
    void botonMercurio(ActionEvent event) {

    }

    @FXML
    void irANivel2(ActionEvent event) {

    }
    public void ponerNombre(String n){
        eNombre.setText(n);
    }
}

