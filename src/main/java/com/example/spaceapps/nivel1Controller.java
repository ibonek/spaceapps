package com.example.spaceapps;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class nivel1Controller {
    private OpcionesJuego opciones;

    public OpcionesJuego getOpciones() {
        return opciones;
    }

    public void setOpciones(OpcionesJuego opciones) {
        this.opciones = opciones;
    }

    @FXML
    private Button bLuna;

    @FXML
    private Button bLupa;

    @FXML
    private Button bMercurio;

    @FXML
    private Button bVenus;

    @FXML
    private Label eNombre;

    @FXML
    private HBox fondo1;

    @FXML
    private ImageView imagenMercurio;

    @FXML
    private ImageView imagenVenus;

    @FXML
    private Label puntos;

    @FXML
    private ImageView vida1;

    @FXML
    private ImageView vida2;

    @FXML
    private ImageView vida3;

    int vidas;

    @FXML
    void bVenus(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ventanaOpcMult.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        controllerOpciones controller = fxmlLoader.getController();
        controller.setearPreguntas(0);
        controller.setOpciones(opciones);
        controller.setearPuntos();

        stage.setTitle("Pregunta 1");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
        puntos.setText(controller.getPoints());
        if(controller.getVidas() == 3){
            vida1.setVisible(true);
            vida2.setVisible(true);
            vida3.setVisible(true);
        } else if(controller.getVidas() == 2){
            vida1.setVisible(true);
            vida2.setVisible(true);
            vida3.setVisible(false);
        } else {
            vida1.setVisible(true);
            vida2.setVisible(false);
            vida3.setVisible(false);
        }

    }

    @FXML
    void botonLuna(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ventanaOpcMult.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        controllerOpciones controller = fxmlLoader.getController();
        controller.setearPreguntas(1);
        controller.setOpciones(opciones);
        controller.setearPuntos();
        stage.setTitle("Pregunta 2");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
        puntos.setText(controller.getPoints());
        vidas = controller.getVidas();
    }

    @FXML
    void botonMercurio(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("v-f.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        vfController controller = fxmlLoader.getController();
        controller.setearPreguntas(2);
        controller.setOpciones(opciones);

        stage.setTitle("Pregunta 3");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
        puntos.setText(controller.getPoints());

    }
    public void ponerNombre(String n){
        eNombre.setText(n);

    }
    @FXML
    void botonLupa(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("selectorNiveles.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        SelectorController controller = fxmlLoader.getController();
        controller.setOpciones(opciones,opciones.juego.getNombre());
        Stage stage1 = (Stage) bLuna.getScene().getWindow();
        stage1.close();
        stage.setTitle("World Map");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }

}
