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
    private Label e13;

    @FXML
    private Label e14;

    @FXML
    private Label e15;

    @FXML
    private Button expAguNegro;

    @FXML
    private Button expAnillos;

    @FXML
    private Button expSuperNova;

    @FXML
    private ImageView vida1;

    @FXML
    private ImageView vida2;

    @FXML
    private ImageView vida3;
    private OpcionesJuego opciones;

    @FXML
    void botonExpAguNegro(ActionEvent event) {

    }

    @FXML
    void botonExpAnillos(ActionEvent event) {

    }

    @FXML
    void botonExpSuperNova(ActionEvent event) {

    }
    @FXML
    void botonAguNegro(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ventanaOpcMult.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        controllerOpciones controller = fxmlLoader.getController();
        controller.setearPreguntas(3);
        controller.setVidas(opciones.juego.getVidas());
        stage.setTitle("Pregunta 3");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
        puntos.setText(controller.getPoints());
    }

    @FXML
    void botonAnillos(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ventanaOpcMult.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        controllerOpciones controller = fxmlLoader.getController();
        controller.setearPreguntas(3);
        controller.setVidas(opciones.juego.getVidas());
        stage.setTitle("Pregunta 3");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
        puntos.setText(controller.getPoints());
    }

    @FXML
    void botonLupa(ActionEvent event) throws IOException {
        Stage stage1 = (Stage) bAguNegro.getScene().getWindow();
        stage1.close();
    }

    @FXML
    void botonSuperNova(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ventanaOpcMult.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        controllerOpciones controller = fxmlLoader.getController();
        controller.setearPreguntas(3);
        controller.setVidas(opciones.juego.getVidas());
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
    public OpcionesJuego getOpciones() {
        return opciones;
    }

    public void setOpciones(OpcionesJuego opciones) {
        this.opciones = opciones;
    }

    public String getPuntos(){return puntos.getText();}
    public void setPuntos(int n){
        puntos.setText(n + "");
    }

    public void setVidas(int v){
        if(opciones.juego.getVidas() == 3){
            vida1.setVisible(true);
            vida2.setVisible(true);
            vida3.setVisible(true);
        } else if(opciones.juego.getVidas() == 2){
            vida1.setVisible(true);
            vida2.setVisible(true);
            vida3.setVisible(false);
        } else if(opciones.juego.getVidas() == 1){
            vida1.setVisible(true);
            vida2.setVisible(false);
            vida3.setVisible(false);
        } else {
            vida1.setVisible(true);
            vida2.setVisible(true);
            vida3.setVisible(true);
            opciones.juego.setVidas(3);
            opciones.juego.resetearPuntos();
        }
    }
}
