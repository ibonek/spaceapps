package com.example.spaceapps;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Juego juego = new Juego();
        /*

        Si quieres acceder a una pregunta en concreto:
        juego.getPreguntas().get(numPregunta);

        Si quieres acceder a una respuesta de una pregunta en concreto:
        juego.getPreguntas().get(numPregunta).getListaOpciones().get(numRespuesta);

        Si quieres saber si esa respuesta es la correcta o no:
        juego.getPreguntas().get(numPregunta).getListaOpciones().get(numRespuesta).isCorrecta();


        Las preguntas verdadero y falso solo tienen 2 posibles respuestas obviamente así que cuidado al usar numRespuesta > 1 porque puede que estés en una pregunta con 2 respuestas
         */
        int numPregunta = 3;
        int numRespuesta = 1;
        System.out.println(juego.getPreguntas().get(numPregunta).getListaOpciones().get(numRespuesta));
        launch();
    }

}