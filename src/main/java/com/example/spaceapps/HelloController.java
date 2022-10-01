package com.example.spaceapps;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button bBegin;
    @FXML
    private Label errornombre;



    @FXML
    private TextField nombre;

    @FXML
    private Button bContinue;

    @FXML
    private HBox fondo;

    @FXML
    private Label lLoad;

    @FXML
    private Label lNew;

    @FXML
    private VBox marcoNombre;

    @FXML
    void pressBegin(ActionEvent event) throws IOException {
        if(!nombre.getText().isBlank()) {
            errornombre.visibleProperty().set(false);
            OpcionesJuego opciones = new OpcionesJuego();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nivel1.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            Stage stage1 = (Stage) bBegin.getScene().getWindow();
            nivel1Controller controlador = fxmlLoader.getController();
            controlador.ponerNombre(nombre.getText());
            opciones.crearJuego();
            opciones.juego.setNombre(nombre.getText());
            controlador.setOpciones(opciones);
            stage1.close();
            stage.setTitle("Level 1");
            stage.setMaximized(false);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
        else {
            errornombre.visibleProperty().set(true);
            errornombre.setText("You must introduce a valid name");
        }
    }

    @FXML
    void pressContinue(ActionEvent event) throws IOException, ClassNotFoundException {

        OpcionesJuego opciones = new OpcionesJuego();
        try {
            opciones.juego = opciones.Cargar("juego.bin");
        } catch (Exception ex){
            ///Aqui va el codigo para que informe  que no puedes hacer eso
            System.out.println("No puedes cargar payaso");
        }


    }

}
