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
    void botonAceptar(ActionEvent event) throws IOException {


    }

    @FXML
    void botonAtras(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        Stage stage1 = (Stage) pregunta.getScene().getWindow();
        stage1.close();
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

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



