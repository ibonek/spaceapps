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

public class SelectorController {

    OpcionesJuego opciones;
    @FXML
    private Button bLevel1;

    @FXML
    private Button bLevel2;

    @FXML
    private Button bLevel3;

    @FXML
    private Button bLevel4;

    @FXML
    private Button bLevel5;

    @FXML
    private Label eNombre;

    @FXML
    private HBox fondoSelect;

    @FXML
    private Label puntos;

    @FXML
    private ImageView vida1;

    @FXML
    private ImageView vida2;

    @FXML
    private ImageView vida3;


    public void setPuntos(int n){
        puntos.setText(n + "");
    }
    public void setVidas(int v){
        if(v == 3){
            vida1.setVisible(true);
            vida2.setVisible(true);
            vida3.setVisible(true);
        } else if(v == 2){
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
    void botonLevel1(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nivel1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        nivel1Controller controlador = fxmlLoader.getController();
        controlador.setOpciones(opciones);
        controlador.ponerNombre(opciones.juego.getNombre());
        controlador.setVidas(opciones.juego.getVidas());
        controlador.setPuntos(Integer.parseInt(puntos.getText()));
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
        puntos.setText(controlador.getPuntos());
        setVidas(opciones.juego.getVidas());
    }

    @FXML
    void botonLevel2(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nivel2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        nivel2Controller controlador = fxmlLoader.getController();
        controlador.ponerNombre(opciones.juego.getNombre());
        controlador.setPuntos(Integer.parseInt(puntos.getText()));
        controlador.setOpciones(opciones);
        controlador.setVidas(opciones.juego.getVidas());
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
        puntos.setText(controlador.getPuntos());
        setVidas(opciones.juego.getVidas());
    }

    @FXML
    void botonLevel3(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nivel3.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        nivel3Controller controlador = fxmlLoader.getController();
        controlador.ponerNombre(opciones.juego.getNombre());
        controlador.setPuntos(Integer.parseInt(puntos.getText()));
        controlador.setOpciones(opciones);
        controlador.setVidas(opciones.juego.getVidas());
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
        puntos.setText(controlador.getPuntos());
        setVidas(opciones.juego.getVidas());
    }

    @FXML
    void botonLevvel4(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nivel4.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        nivel4Controller controlador = fxmlLoader.getController();
        controlador.ponerNombre(opciones.juego.getNombre());
        controlador.setPuntos(Integer.parseInt(puntos.getText()));
        controlador.setOpciones(opciones);
        stage.setMaximized(false);
        controlador.setVidas(opciones.juego.getVidas());
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
        puntos.setText(controlador.getPuntos());
        setVidas(opciones.juego.getVidas());
    }
    @FXML
    void BotonLevel5(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nivel5.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        nivel5Controller controlador = fxmlLoader.getController();
        controlador.ponerNombre(opciones.juego.getNombre());
        controlador.setPuntos(Integer.parseInt(puntos.getText()));
        controlador.setOpciones(opciones);
        controlador.setVidas(opciones.juego.getVidas());
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
        puntos.setText(controlador.getPuntos());
        setVidas(opciones.juego.getVidas());
    }
    public OpcionesJuego getOpciones() {
        return opciones;
    }

    public void setOpciones(OpcionesJuego opciones, String n) {
        this.opciones = opciones;
        eNombre.setText(n);
    }
}
