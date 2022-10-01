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
    private VBox fondo;
    @FXML
    private Button bContinue;



    @FXML
    private Label lLoad;

    @FXML
    private Label lNew;

    @FXML
    private VBox marcoNombre;

    @FXML
    void pressBegin(ActionEvent event) throws IOException {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("new_preuba.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            OpcionesJuego opciones = new OpcionesJuego();
            Stage stage = new Stage();
            Stage stage1 = (Stage) bBegin.getScene().getWindow();
            nombreController controlador = fxmlLoader.getController();
            opciones.crearJuego();
            controlador.setOpciones(opciones);
            stage1.close();
            stage.setTitle("Login");
            stage.setMaximized(false);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();

    }

    @FXML
    void pressContinue(ActionEvent event) throws IOException, ClassNotFoundException {

        OpcionesJuego opciones = new OpcionesJuego();
        try {
            opciones.juego = opciones.Cargar("juego.bin");
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("selectorNiveles.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            Stage stage1 = (Stage) bBegin.getScene().getWindow();
            SelectorController controlador = fxmlLoader.getController();
            controlador.setPuntos(opciones.juego.getPuntos());
            controlador.setOpciones(opciones, opciones.juego.getNombre());
            controlador.setVidas(opciones.juego.getVidas());
            stage1.close();
            stage.setTitle("Browse the Webb");
            stage.setMaximized(false);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex){
            ///Aqui va el codigo para que informe  que no puedes hacer eso
            System.out.println("No puedes cargar payaso");
        }


    }

}
