package com.example.spaceapps;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import static javafx.scene.paint.Color.*;

public class controllerOpciones {
    @FXML
    private Button bTryAgain;

    public String getPoints(){
        return puntos.getText();
    }
    public int getVidas(){
        return juego.getVidas();
    }
    OpcionesJuego opciones;

    public OpcionesJuego getOpciones() {
        return opciones;
    }

    public void setOpciones(OpcionesJuego opciones) {
        this.opciones = opciones;
    }

    @FXML
    private RadioButton opcion1;

    @FXML
    private RadioButton opcion2;

    @FXML
    private Button comprobar;

    @FXML
    private RadioButton opcion3;

    @FXML
    private RadioButton opcion4;

    @FXML
    private Label pregunta;
    @FXML
    private Button continuar;
    @FXML
    private Label puntos;
    @FXML
    private ImageView vida1;

    @FXML
    private ImageView vida2;

    @FXML
    private ImageView vida3;
    @FXML
    private Button bAyuda;
    @FXML
    private Label ayudaTexto;
    @FXML
    private ImageView imagenAyuda;
    int p;
    int r;
    Juego juego = new Juego();
    boolean resp1;
    boolean resp2;
    boolean resp3;
    boolean resp4;
    Respuesta respuestaSeleccionada;

    public boolean bien;

    public boolean getBoolean(){
        return bien;
    }
    @FXML
    void botonContinuar(ActionEvent event) throws IOException {
        bien = true;
        Stage stage1 = (Stage) pregunta.getScene().getWindow();
        stage1.close();
    }

    @FXML
    void botonAyuda(ActionEvent event) {
        this.ayudaTexto.setText(((Pregunta)this.opciones.juego.getPreguntas().get(this.p)).getPista());
        this.bAyuda.setVisible(true);
    }
    @FXML
    void botonTryAgain(ActionEvent event) throws IOException {
       setearPreguntas(p);
       continuar.setDisable(true);
       bTryAgain.setDisable(true);
       bTryAgain.setVisible(false);
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
        comprobar.setDisable(false);
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
    void botonComprobar(ActionEvent event) throws IOException {

        if (respuestaSeleccionada == null) return ;
        if(!respuestaSeleccionada.isCorrecta()){
            bAyuda.setVisible(true);
            bAyuda.setDisable(false);
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Alert");
            alert.setHeaderText("OH NO!");
            alert.setContentText("Your answer is not correct, try again");
            Optional<ButtonType> result = alert.showAndWait();

            opciones.juego.restPuntos();
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
                Alert alerte = new Alert(Alert.AlertType.INFORMATION);
                alerte.setTitle("Alert");
                alerte.setHeaderText("You have lost all your lives");
                alerte.setContentText("You must restart the level");
                Optional<ButtonType> resultad = alerte.showAndWait();
                if (result.isPresent() && result.get() == ButtonType.OK){
                    Stage stage1 = (Stage) pregunta.getScene().getWindow();
                    stage1.close();
                }
            }

            bTryAgain.setDisable(false);
            bTryAgain.setVisible(true);
            comprobar.setDisable(true);
            if(r==1) opcion1.setTextFill(RED);

            if(r==2) opcion2.setTextFill(RED);

            if(r==3) opcion3.setTextFill(RED);

            if(r==4) opcion4.setTextFill(RED);
         }

        if(respuestaSeleccionada.isCorrecta()){
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Alert");
            alerta.setHeaderText("CONGRATULATIONS");
            alerta.setContentText("Your answer is correct");
            Optional<ButtonType> result = alerta.showAndWait();
            opciones.juego.setPuntos();
            comprobar.setDisable(true);
            continuar.setDisable(false);
            opciones.juego.setAciertos();
            opciones.Guardar(opciones.juego);
            bTryAgain.setDisable(true);
            bTryAgain.setVisible(false);
            if(r==1) opcion1.setTextFill(DARKSEAGREEN);

            if(r==2) opcion2.setTextFill(DARKSEAGREEN);

            if(r==3) opcion3.setTextFill(DARKSEAGREEN);

            if(r==4) opcion4.setTextFill(DARKSEAGREEN);
        }
        setearPuntos();
        opcion1.setDisable(true);
        opcion2.setDisable(true);
        opcion3.setDisable(true);
        opcion4.setDisable(true);
    }
    void setearPuntos(){
        puntos.setText(opciones.juego.getPuntos()+"");
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
}





