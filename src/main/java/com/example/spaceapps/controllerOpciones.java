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

import static javafx.scene.paint.Color.*;

public class controllerOpciones {

    @FXML
    private RadioButton opcion1;

    @FXML
    private RadioButton opcion2;

    @FXML
    private Button compr;

    @FXML
    private RadioButton opcion3;

    @FXML
    private RadioButton opcion4;

    @FXML
    private Label pregunta;
    @FXML
    private Button continuar;
    @FXML
    private Label progreso;
    int contador;
    int p;
    int r;
    Juego juego = new Juego();
    boolean resp1;
    boolean resp2;
    boolean resp3;
    boolean resp4;
    Respuesta respuestaSeleccionada;
    Respuesta respuestaCorrecta;

    @FXML
    void botonAceptar(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nivel1.fxml"));
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
    void botonAtras(ActionEvent event) throws IOException {
        Stage stage1 = (Stage) pregunta.getScene().getWindow();
        stage1.close();
    }

    @FXML
    void botonResp1(ActionEvent event) {
        opcion1.setSelected(true);
        opcion2.setSelected(false);
        opcion3.setSelected(false);
        opcion4.setSelected(false);
        respuestaSeleccionada = juego.getPreguntas().get(p).getListaOpciones().get(0);
        r=1;
    }

    @FXML
    void botonResp2(ActionEvent event) {
        opcion1.setSelected(false);
        opcion2.setSelected(true);
        opcion3.setSelected(false);
        opcion4.setSelected(false);
        respuestaSeleccionada = juego.getPreguntas().get(p).getListaOpciones().get(1);
        r=2;
    }

    @FXML
    void botonResp3(ActionEvent event) {
        opcion1.setSelected(false);
        opcion2.setSelected(false);
        opcion3.setSelected(true);
        opcion4.setSelected(false);
        respuestaSeleccionada = juego.getPreguntas().get(p).getListaOpciones().get(2);
        r=3;
    }

    @FXML
    void botonResp4(ActionEvent event) {
        opcion1.setSelected(false);
        opcion2.setSelected(false);
        opcion3.setSelected(false);
        opcion4.setSelected(true);
        respuestaSeleccionada = juego.getPreguntas().get(p).getListaOpciones().get(3);
        r=4;
    }
    public void setearPreguntas(int n){
        opcion1.setDisable(false);
        opcion2.setDisable(false);
        opcion3.setDisable(false);
        opcion4.setDisable(false);
        compr.setDisable(false);
        opcion1.setSelected(false);
        opcion2.setSelected(false);
        opcion3.setSelected(false);
        opcion4.setSelected(false);
        opcion1.setTextFill(BLACK);
        opcion2.setTextFill(BLACK);
        opcion3.setTextFill(BLACK);
        opcion4.setTextFill(BLACK);
         p = n;
        pregunta.setText(juego.getPreguntas().get(p).getCuerpoPregunta().toString() );


       /* NO SÉ CÓMO HACER QUE SALGAN LAS RESPUESTAS DE LA LISTA DE OPCIONES
        PERO IRIA DENTRO DEL SET TEXT.
        esto era de prueba xd:)))
        */
        opcion1.setText(juego.getPreguntas().get(p).getListaOpciones().get(0).getCuerpoRespuesta());
        resp1= juego.getPreguntas().get(p).getListaOpciones().get(0).isCorrecta();
        opcion2.setText(juego.getPreguntas().get(p).getListaOpciones().get(1).getCuerpoRespuesta());
        resp2= juego.getPreguntas().get(p).getListaOpciones().get(1).isCorrecta();
        opcion3.setText(juego.getPreguntas().get(p).getListaOpciones().get(2).getCuerpoRespuesta());
        resp3= juego.getPreguntas().get(p).getListaOpciones().get(2).isCorrecta();
        opcion4.setText(juego.getPreguntas().get(p).getListaOpciones().get(3).getCuerpoRespuesta());
        resp4= juego.getPreguntas().get(p).getListaOpciones().get(3).isCorrecta();


    }
    @FXML
    void botonComprobar(ActionEvent event) {

        if (resp1) opcion1.setTextFill(DARKSEAGREEN);
        if (resp2) opcion2.setTextFill(DARKSEAGREEN);
        if (resp3) opcion3.setTextFill(DARKSEAGREEN);
        if (resp4) opcion4.setTextFill(DARKSEAGREEN);

        if(!respuestaSeleccionada.isCorrecta()){

            if(r==1) opcion1.setTextFill(RED);

            if(r==2) opcion2.setTextFill(RED);

            if(r==3) opcion3.setTextFill(RED);

            if(r==4) opcion4.setTextFill(RED);
         }
        opcion1.setDisable(true);
        opcion2.setDisable(true);
        opcion3.setDisable(true);
        opcion4.setDisable(true);
        compr.setDisable(true);
        continuar.setDisable(false);

    }



}





