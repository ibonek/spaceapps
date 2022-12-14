package com.example.spaceapps;

import javafx.css.converter.URLConverter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static javafx.scene.paint.Color.WHITE;

import static javafx.scene.paint.Color.YELLOW;

public class nivel1Controller {

    @FXML
    private Button bLuna;

    @FXML
    private Button bLupa;

    @FXML
    private Button bMercurio;

    @FXML
    private Button bVenus;

    @FXML
    private Label e1;

    @FXML
    private Label e2;

    @FXML
    private Label e3;

    @FXML
    private Label eNombre;

    @FXML
    private Button expLuna;

    @FXML
    private Button expMercurio;

    @FXML
    private Button expVenus;

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

    public boolean correcto;
    @FXML
    void botonExpVenus(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("explicacion.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        explicacionController controller = fxmlLoader.getController();
        controller.setImageView(2);
        controller.setTexto(opciones.juego.getPreguntas().get(1).getExplicacion());
        stage.setTitle("Explanation");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void botonExpLuna(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("explicacion.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        explicacionController controller = fxmlLoader.getController();
        controller.setOpciones(opciones);
        controller.setImageView(1);
        controller.setTexto(opciones.juego.getPreguntas().get(0).getExplicacion());
        stage.setTitle("Explanation");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();



    }
    @FXML
    void botonExpMercurio(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("explicacion.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        explicacionController controller = fxmlLoader.getController();
        controller.setImageView(3);
        controller.setTexto(opciones.juego.getPreguntas().get(2).getExplicacion());
        stage.setTitle("Explanation");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void bVenus(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("v-f.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        vfController controller = fxmlLoader.getController();
        controller.setearPreguntas(1);
        controller.setOpciones(opciones);
        controller.setPuntos(opciones.juego.getPuntos());
        controller.setVidas(opciones.juego.getVidas());
        stage.setTitle("Question 2");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
        correcto = controller.getBoolean();
        if(correcto){
            desbloquear();
        }
        if(opciones.juego.getVidas() == 3){
            vida1.setVisible(true);
            vida2.setVisible(true);
            vida3.setVisible(true);
        } else if(opciones.juego.getVidas() == 2){
            vida1.setVisible(true);
            vida2.setVisible(true);
            vida3.setVisible(false);
        } else {
            vida1.setVisible(true);
            vida2.setVisible(false);
            vida3.setVisible(false);
        }
        puntos.setText(controller.getPoints());
    }

    @FXML
    void botonLuna(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ventanaOpcMult.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        controllerOpciones controller = fxmlLoader.getController();
        controller.setearPreguntas(0);
        controller.setOpciones(opciones);
        controller.setearPuntos();
        controller.setVidas(opciones.juego.getVidas());
        stage.setTitle("Question 1");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
        puntos.setText(controller.getPoints());
        correcto = controller.getBoolean();
        if(correcto){
            desbloquear();
        }
        if(opciones.juego.getVidas() == 3){
            vida1.setVisible(true);
            vida2.setVisible(true);
            vida3.setVisible(true);
        } else if(opciones.juego.getVidas() == 2){
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
    void botonMercurio(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ventanaOpcMult.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        controllerOpciones controller = fxmlLoader.getController();
        controller.setearPreguntas(2);
        controller.setOpciones(opciones);
        controller.setearPuntos();
        controller.setVidas(opciones.juego.getVidas());
        stage.setTitle("Question 3");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
        puntos.setText(controller.getPoints());
        correcto = controller.getBoolean();
        if(correcto){
            desbloquear();
        }
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
    public void ponerNombre(String n){
        eNombre.setText(n);
    }

    @FXML
    void botonLupa(ActionEvent event) throws IOException {
        Stage stage1 = (Stage) bLuna.getScene().getWindow();
        stage1.close();
    }
    private OpcionesJuego opciones;

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
    public void desbloquear() throws IOException  {
        if(opciones.juego.getAciertos() > 3){
            e1.setTextFill(YELLOW);
            e2.setTextFill(YELLOW);
            e3.setTextFill(YELLOW);
            expLuna.setVisible(true);
            expLuna.setDisable(false);
            expVenus.setVisible(true);
            expVenus.setDisable(false);
            expMercurio.setVisible(true);
            expMercurio.setDisable(false);
            bLuna.setDisable(true);
            bVenus.setDisable(true);
            bMercurio.setDisable(true);
        }
        if(opciones.juego.getAciertos() == 3){
            e1.setTextFill(YELLOW);
            e2.setTextFill(YELLOW);
            e3.setTextFill(WHITE);
            expLuna.setVisible(true);
            expLuna.setDisable(false);
            expVenus.setVisible(true);
            expVenus.setDisable(false);
            bLuna.setDisable(true);
            bVenus.setDisable(true);
            bMercurio.setDisable(false);
        }
        if(opciones.juego.getAciertos() == 2){
            bVenus.setDisable(false);
            e2.setTextFill(WHITE);
            bLuna.setDisable(true);
            e1.setTextFill(YELLOW);
            expLuna.setVisible(true);
            expLuna.setDisable(false);
            bMercurio.setDisable(true);

        }
    }
}

