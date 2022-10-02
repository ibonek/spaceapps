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

import static javafx.scene.paint.Color.WHITE;
import static javafx.scene.paint.Color.YELLOW;

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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("v-f.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        vfController controller = fxmlLoader.getController();
        controller.setearPreguntas(12);
        controller.setVidas(opciones.juego.getVidas());
        controller.setOpciones(opciones);
        controller.setPuntos(opciones.juego.getPuntos());
        stage.setTitle("Question 13");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
        puntos.setText(controller.getPoints());
        if(controller.getBoolean()){
            desbloquear();
        }
    }

    @FXML
    void botonAnillos(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ventanaOpcMult.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        controllerOpciones controller = fxmlLoader.getController();
        controller.setearPreguntas(13);
        controller.setVidas(opciones.juego.getVidas());
        controller.setearPuntos();
        controller.setOpciones(opciones);
        stage.setTitle("Question 14");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
        puntos.setText(controller.getPoints());
        if(controller.getBoolean()){
            desbloquear();
        }
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
        controller.setearPreguntas(14);
        controller.setVidas(opciones.juego.getVidas());
        controller.setearPuntos();
        controller.setOpciones(opciones);
        stage.setTitle("Question 15");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
        puntos.setText(controller.getPoints());
        if(controller.getBoolean()){
            desbloquear();
        }
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
    public void desbloquear(){
        if(opciones.juego.getAciertos() > 11){
            e13.setTextFill(YELLOW);
            e14.setTextFill(YELLOW);
            e15.setTextFill(YELLOW);
            expAguNegro.setVisible(true);
            expAguNegro.setDisable(false);
            expAnillos.setVisible(true);
            expAnillos.setDisable(false);
            expSuperNova.setVisible(true);
            expSuperNova.setDisable(false);
            bAguNegro.setDisable(true);
            bAnillos.setDisable(true);
            bSuperNova.setDisable(true);
        }
        if(opciones.juego.getAciertos() == 11){
            e13.setTextFill(YELLOW);
            e14.setTextFill(YELLOW);
            e15.setTextFill(WHITE);
            expAguNegro.setVisible(true);
            expAguNegro.setDisable(false);
            expAnillos.setVisible(true);
            expAnillos.setDisable(false);
            bAguNegro.setDisable(true);
            bAnillos.setDisable(true);
            bSuperNova.setDisable(false);
        }
        if(opciones.juego.getAciertos() == 10){
            bAnillos.setDisable(false);
            e14.setTextFill(WHITE);
            bAguNegro.setDisable(true);
            e13.setTextFill(YELLOW);
            expAguNegro.setVisible(true);
            expAguNegro.setDisable(false);
            bAnillos.setDisable(true);
        }
    }
}
