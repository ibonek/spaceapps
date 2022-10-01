package com.example.spaceapps;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class nombreController {
    private OpcionesJuego opciones;
    @FXML
    private Label errornombre;
    @FXML
    private Button bContinue;

    @FXML
    private Label lNew;

    @FXML
    private Label lNew1;

    @FXML
    private VBox marcoNombre;

    @FXML
    private TextField nombre;

    @FXML
    void pressContinue(ActionEvent event) throws IOException {
        if(!nombre.getText().isBlank()) {
            errornombre.visibleProperty().set(false);
            OpcionesJuego opciones = new OpcionesJuego();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("selectorNiveles.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            Stage stage1 = (Stage) bContinue.getScene().getWindow();
           // nivel1Controller controlador = fxmlLoader.getController();
            //controlador.ponerNombre(nombre.getText());
            SelectorController controlador =fxmlLoader.getController();

            opciones.crearJuego();
            opciones.juego.setNombre(nombre.getText());
            controlador.setOpciones(opciones, opciones.juego.getNombre());
            stage1.close();
            stage.setTitle("Browse the Webb");
            stage.setMaximized(false);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
        else {
            errornombre.visibleProperty().set(true);
            errornombre.setText("You must introduce a valid name");
        }}

    public OpcionesJuego getOpciones() {
        return opciones;
    }

    public void setOpciones(OpcionesJuego opciones) {
        this.opciones = opciones;
    }

    }


