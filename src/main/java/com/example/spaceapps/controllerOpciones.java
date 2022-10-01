package com.example.spaceapps;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static javafx.scene.paint.Color.*;

public class controllerOpciones {
    @FXML
    private Button bTryAgain;

    public String getPoints(){
        return puntos.getText();
    }
    public int getVidas(){
        return vida;
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

    int p;
    int r;
    Juego juego = new Juego();
    boolean resp1;
    boolean resp2;
    boolean resp3;
    boolean resp4;
    int vida;
    Respuesta respuestaSeleccionada;

    @FXML
    void botonContinuar(ActionEvent event) throws IOException {
        Stage stage1 = (Stage) pregunta.getScene().getWindow();
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
            opciones.juego.restPuntos();
            if(vida3.isVisible()){
                vida3.setVisible(false);
                vida = 2;
            }else if(vida2.isVisible()){
                vida3.setVisible(false);
                vida2.setVisible(false);
                vida = 1;
            }else {
                vida3.setVisible(false);
                vida2.setVisible(false);
                vida1.setVisible(false);
                //alerta muerto
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


}





