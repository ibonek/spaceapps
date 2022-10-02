package com.example.spaceapps;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import static javafx.scene.paint.Color.DARKSEAGREEN;
import static javafx.scene.paint.Color.RED;

public class vfController {

    @FXML
    private Button bTryAgain;

    @FXML
    private HBox cabecera5;

    @FXML
    private Button comprobar;

    @FXML
    private Button continuar;

    @FXML
    private RadioButton opcionF;

    @FXML
    private RadioButton opcionV;

    @FXML
    private Label pregunta;

    @FXML
    private Label puntos;

    @FXML
    private ImageView vida1;

    @FXML
    private ImageView vida2;

    @FXML
    private ImageView vida3;
    OpcionesJuego opciones;
    Respuesta respuestaSeleccionada;
    Respuesta respuestaCorrecta;
    boolean resp1;
    boolean resp2;
    int p;
    int r;
    Juego juego = new Juego();

    public boolean bien;
    public boolean getBoolean(){
        return bien;
    }
    public String getPoints(){
        return opciones.juego.getPuntos() + "";
    }
    public OpcionesJuego getOpciones() {
        return opciones;
    }

    public void setOpciones(OpcionesJuego opciones) {
        this.opciones = opciones;
    }
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
    void botonContinuar(ActionEvent event) throws IOException {
        bien = true;
        Stage stage1 = (Stage) comprobar.getScene().getWindow();
        stage1.close();
    }

    @FXML
    void botonTryAgain(ActionEvent event) throws IOException {
        setearPreguntas(p);
        continuar.setDisable(true);
        bTryAgain.setDisable(true);
        bTryAgain.setVisible(false);
    }

    @FXML
    void botonComprobar(ActionEvent event) throws IOException {
        if(r==1&&resp1 || r==2 && resp2){
            opciones.juego.setPuntos();
            puntos.setText(opciones.juego.getPuntos() + "");
            comprobar.setDisable(true);
            continuar.setDisable(false);
            opciones.Guardar(opciones.juego);
            opciones.juego.setAciertos();
        } else {
            opciones.juego.setVidas(opciones.juego.getVidas());
            opciones.juego.restPuntos();
            bTryAgain.setVisible(true);
            bTryAgain.setDisable(false);
            if(vida3.isVisible()){
                vida3.setVisible(false);
                opciones.juego.setVidas(2);
            }else if(vida2.isVisible()){
                vida3.setVisible(false);
                vida2.setVisible(false);
                opciones.juego.setVidas(1);
            }else {
                vida3.setVisible(false);
                vida2.setVisible(false);
                vida1.setVisible(false);
                opciones.juego.setVidas(3);
                opciones.juego.resetearPuntos();
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Alert");
                alert.setHeaderText("You have lost all your lives");
                alert.setContentText("You must restart the level");
                Optional<ButtonType> result = alert.showAndWait();
                if (result.isPresent() && result.get() == ButtonType.OK){
                    Stage stage1 = (Stage) pregunta.getScene().getWindow();
                    stage1.close();
                }
            }
        }
        if (resp1) opcionV.setTextFill(DARKSEAGREEN);
        if (resp2) opcionF.setTextFill(DARKSEAGREEN);
        if(r==2 && resp1) {opcionF.setTextFill(RED);}

        opcionV.setDisable(true);
        opcionF.setDisable(true);
        puntos.setText(opciones.juego.getPuntos() + "");
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




