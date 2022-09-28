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


        if(!respuestaSeleccionada.isCorrecta()){

            if(r==1) opcionV.setTextFill(RED);

            if(r==2) opcionF.setTextFill(RED);

        }
        opcionV.setDisable(true);
        opcionF.setDisable(true);

        compr.setDisable(true);

    }



    @FXML
    void botonRespV(ActionEvent event) {
        opcionV.setSelected(true);
        opcionF.setSelected(false);
        respuestaSeleccionada = juego.getPreguntas().get(p).getListaOpciones().get(p);
        r=1;

    }
    @FXML
    void botonRespF(ActionEvent event) {
        opcionV.setSelected(false);
        opcionF.setSelected(true);
        respuestaSeleccionada = juego.getPreguntas().get(p).getListaOpciones().get(p+1);
        r=2;

    }
    public void setearPreguntas(int n){
        p = n;
        pregunta.setText(juego.getPreguntas().get(p).getCuerpoPregunta().toString() );


       /* NO SÉ CÓMO HACER QUE SALGAN LAS RESPUESTAS DE LA LISTA DE OPCIONES
        PERO IRIA DENTRO DEL SET TEXT.
        esto era de prueba xd:)))
        */
        opcionV.setText(juego.getPreguntas().get(p).getListaOpciones().get(p).getCuerpoRespuesta());
        resp1= juego.getPreguntas().get(p).getListaOpciones().get(p).isCorrecta();
        opcionF.setText(juego.getPreguntas().get(p).getListaOpciones().get(p+1).getCuerpoRespuesta());
        resp2= juego.getPreguntas().get(p).getListaOpciones().get(p+1).isCorrecta();



    }



}



