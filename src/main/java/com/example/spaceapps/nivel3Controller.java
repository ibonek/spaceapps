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

public class nivel3Controller {
private OpcionesJuego opciones;
    @FXML
    private Button bLupa;

    @FXML
    private Button bNeptuno;

    @FXML
    private Button bPluto;

    @FXML
    private Button bUrano;

    @FXML
    private HBox cabecera5;

    @FXML
    private Label eNombre;

    @FXML
    private HBox fondo3;

    @FXML
    private Label puntos;

    @FXML
    private ImageView vida1;

    @FXML
    private ImageView vida2;

    @FXML
    private Label e7;

    @FXML
    private Label e8;

    @FXML
    private Label e9;
    @FXML
    private ImageView vida3;

    @FXML
    private Button expNeptuno;

    @FXML
    private Button expPluton;

    @FXML
    private Button expUrano;

    public boolean correcto;
    @FXML
    void botonExpNeptuno(ActionEvent event) {

    }

    @FXML
    void botonExpPluton(ActionEvent event) {

    }

    @FXML
    void botonExpUrano(ActionEvent event) {

    }
    @FXML
    void bNeptuno(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("v-f.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        vfController controller = fxmlLoader.getController();
        controller.setearPreguntas(6);
        controller.setVidas(opciones.juego.getVidas());
        controller.setOpciones(opciones);
        controller.setPuntos(opciones.juego.getPuntos());
        stage.setTitle("Question 6");
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
    }

    public OpcionesJuego getOpciones() {
        return opciones;
    }

    public void setOpciones(OpcionesJuego opciones) {
        this.opciones = opciones;
    }
    @FXML
    void botonLupa(ActionEvent event) throws IOException {
        Stage stage1 = (Stage) bNeptuno.getScene().getWindow();
        stage1.close();
    }

    @FXML
    void botonPluto(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ventanaOpcMult.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        controllerOpciones controller = fxmlLoader.getController();
        controller.setearPreguntas(8);
        controller.setVidas(opciones.juego.getVidas());
        controller.setOpciones(opciones);
        controller.setearPuntos();
        stage.setTitle("Question 9");
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
    }

    @FXML
    void botonUrano(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("v-f.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        vfController controller = fxmlLoader.getController();
        controller.setearPreguntas(7);
        controller.setVidas(opciones.juego.getVidas());
        controller.setOpciones(opciones);
        controller.setPuntos(opciones.juego.getPuntos());
        stage.setTitle("Question 8");
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
    }
    public void ponerNombre(String n){
        eNombre.setText(n);
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
        if(opciones.juego.getAciertos() > 9){
            e7.setTextFill(YELLOW);
            e8.setTextFill(YELLOW);
            e9.setTextFill(YELLOW);
            expUrano.setVisible(true);
            expUrano.setDisable(false);
            expNeptuno.setVisible(true);
            expNeptuno.setDisable(false);
            expPluton.setVisible(true);
            expPluton.setDisable(false);
            bUrano.setDisable(true);
            bNeptuno.setDisable(true);
            bPluto.setDisable(true);
        }
        if(opciones.juego.getAciertos() == 9){
            e7.setTextFill(YELLOW);
            e8.setTextFill(YELLOW);
            e9.setTextFill(WHITE);
            expUrano.setVisible(true);
            expUrano.setDisable(false);
            expNeptuno.setVisible(true);
            expNeptuno.setDisable(false);
            bUrano.setDisable(true);
            bNeptuno.setDisable(true);
            bPluto.setDisable(false);
        }
        if(opciones.juego.getAciertos() == 8){
            bNeptuno.setDisable(false);
            e8.setTextFill(WHITE);
            bUrano.setDisable(true);
            e7.setTextFill(YELLOW);
            expUrano.setVisible(true);
            expUrano.setDisable(false);
            bPluto.setDisable(true);
        }
    }
}
