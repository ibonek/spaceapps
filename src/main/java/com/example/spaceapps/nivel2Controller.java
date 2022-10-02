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


public class nivel2Controller {

    @FXML
    private Button bJupiter;

    @FXML
    private Button bLupa;

    @FXML
    private Button bMarte;

    @FXML
    private Button bSaturno;

    @FXML
    private ImageView botonSaturno;

    @FXML
    private HBox cabecera5;

    @FXML
    private Label eNombre;

    @FXML
    private Button expJupiter;

    @FXML
    private Button expMarte;

    @FXML
    private Button expSaturno;

    @FXML
    private HBox fondo2;

    @FXML
    private Label puntos;

    @FXML
    private Label e4;

    @FXML
    private Label e5;

    @FXML
    private Label e6;
    @FXML
    private ImageView vida1;

    @FXML
    private ImageView vida2;

    @FXML
    private ImageView vida3;

    @FXML
    void botonExpJupiter(ActionEvent event) {

    }

    @FXML
    void botonExpMarte(ActionEvent event) {

    }

    @FXML
    void botonExpSaturno(ActionEvent event) {

    }
    public boolean correcto;
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


    @FXML
    void botonJupiter(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ventanaOpcMult.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        controllerOpciones controller = fxmlLoader.getController();
        controller.setearPreguntas(4);
        controller.setOpciones(opciones);
        controller.setVidas(opciones.juego.getVidas());
        controller.setearPuntos();
        stage.setTitle("Pregunta 3");
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
    void botonMarte(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("v-f.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        vfController controller = fxmlLoader.getController();
        controller.setearPreguntas(3);
        controller.setOpciones(opciones);
        controller.setVidas(opciones.juego.getVidas());
        controller.setPuntos(opciones.juego.getPuntos());
        stage.setTitle("Pregunta 4");
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
    void botonSaturno(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ventanaOpcMult.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        controllerOpciones controller = fxmlLoader.getController();
        controller.setearPreguntas(5);
        controller.setOpciones(opciones);
        controller.setVidas(opciones.juego.getVidas());
        controller.setearPuntos();
        stage.setTitle("Pregunta 5");
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
    void botonLupa(ActionEvent event) throws IOException {
        Stage stage1 = (Stage) bJupiter.getScene().getWindow();
        stage1.close();
    }
    public void ponerNombre(String n){
        eNombre.setText(n);
    }
    public void desbloquear(){
        if(opciones.juego.getAciertos() > 6){
            e4.setTextFill(YELLOW);
            e5.setTextFill(YELLOW);
            e6.setTextFill(YELLOW);
            expMarte.setVisible(true);
            expMarte.setDisable(false);
            expSaturno.setVisible(true);
            expSaturno.setDisable(false);
            expJupiter.setVisible(true);
            expJupiter.setDisable(false);
            bJupiter.setDisable(true);
            bMarte.setDisable(true);
            bSaturno.setDisable(true);
        }
        if(opciones.juego.getAciertos() == 6){
            e4.setTextFill(YELLOW);
            e5.setTextFill(YELLOW);
            e6.setTextFill(WHITE);
            expMarte.setVisible(true);
            expMarte.setDisable(false);
            expJupiter.setVisible(true);
            expJupiter.setDisable(false);
            bMarte.setDisable(true);
            bJupiter.setDisable(true);
            bSaturno.setDisable(false);
        }
        if(opciones.juego.getAciertos() == 5){
            bJupiter.setDisable(false);
            e5.setTextFill(WHITE);
            bMarte.setDisable(true);
            e4.setTextFill(YELLOW);
            expMarte.setVisible(true);
            expMarte.setDisable(false);
            bSaturno.setDisable(true);
        }
    }
}


