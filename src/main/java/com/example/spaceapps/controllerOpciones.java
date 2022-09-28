package com.example.spaceapps;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class controllerOpciones {
    public void initialize(URL url, ResourceBundle rb){


    }
    @FXML
    private RadioButton opcion1;

    @FXML
    private RadioButton opcion2;

    @FXML
    private RadioButton opcion3;

    @FXML
    private RadioButton opcion4;

    @FXML
    private Label pregunta;

    @FXML
    void botonAceptar(ActionEvent event) {

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
    void botonResp1(ActionEvent event) {

    }

    @FXML
    void botonResp2(ActionEvent event) {

    }

    @FXML
    void botonResp3(ActionEvent event) {

    }

    @FXML
    void botonResp4(ActionEvent event) {

    }
    public void setearPreguntas(int n){
        int p = n;
        Juego juego = new Juego();
        OpcionesMultiples pregunta2 = new OpcionesMultiples();
        pregunta.setText(juego.getPreguntas().get(p).getCuerpoPregunta().toString() );


       /* NO SÉ CÓMO HACER QUE SALGAN LAS RESPUESTAS DE LA LISTA DE OPCIONES
        PERO IRIA DENTRO DEL SET TEXT.
        esto era de prueba xd:)))
        */
        opcion1.setText("1");
        opcion2.setText("2");
        opcion3.setText("3");
        opcion4.setText("4");

    }
}

