package com.example.spaceapps;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static javafx.scene.paint.Color.DARKSEAGREEN;
import static javafx.scene.paint.Color.RED;
public class vfController {

    @FXML
    private Button compr;

    @FXML
    private Button puntos;

    public String getPoints(){
        return puntos.getText();
    }
    public OpcionesJuego getOpciones() {
        return opciones;
    }

    public void setOpciones(OpcionesJuego opciones) {
        this.opciones = opciones;
    }
    public void setVidas(int v){
        if(v == 3){
            //vida1.setVisible(true);
            //vida2.setVisible(true);
            //vida3.setVisible(true);
        } else if(v == 2){
            //vida1.setVisible(true);
            //vida2.setVisible(true);
            //vida3.setVisible(false);
        } else {
            //vida1.setVisible(true);
            //vida2.setVisible(false);
            //vida3.setVisible(false);
        }
    }
    private OpcionesJuego opciones;
    @FXML
    private RadioButton opcionF;

    @FXML
    private RadioButton opcionV;
    @FXML
    private Button cont;
    @FXML
    private Label progreso;
    @FXML
    private Label pregunta;
    Respuesta respuestaSeleccionada;
    Respuesta respuestaCorrecta;
    boolean resp1;
    boolean resp2;
    int p;
    int r;
    Juego juego = new Juego();



    @FXML
    void botonContinuar(ActionEvent event) throws IOException {


    }

    @FXML
    void botonTryAgain(ActionEvent event) throws IOException {

    }

    @FXML
    void botonComprobar(ActionEvent event) throws IOException {

        if (resp1) opcionV.setTextFill(DARKSEAGREEN);
        if (resp2) opcionF.setTextFill(DARKSEAGREEN);
        if(r==2 && resp1) {opcionF.setTextFill(RED); System.out.println("hola");}

        opcionV.setDisable(true);
        opcionF.setDisable(true);

        compr.setDisable(true);
        cont.setDisable(false);
    }



    @FXML
    void botonRespV(ActionEvent event) {
        opcionV.setSelected(true);
        opcionF.setSelected(false);
        r=1;

    }
    @FXML
    void botonRespF(ActionEvent event) {
        opcionV.setSelected(false);
        opcionF.setSelected(true);
        r=2;

    }
    public void setearPreguntas(int n){
        p = n;
        pregunta.setText(juego.getPreguntas().get(p).getCuerpoPregunta().toString() );

        opcionV.setText("True");
        resp1= juego.getPreguntas().get(p).getListaOpciones().get(0).isCorrecta();
        opcionF.setText("False");
        resp2= juego.getPreguntas().get(p).getListaOpciones().get(1).isCorrecta();



    }



}



