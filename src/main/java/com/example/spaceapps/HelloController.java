package com.example.spaceapps;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;

public class HelloController {

    @FXML
    private Button bBegin;
    @FXML
    private Label errornombre;


    @FXML
    private TextField nombre;

    @FXML
    private Button bContinue;

    @FXML
    private HBox fondo;

    @FXML
    private Label lLoad;

    @FXML
    private Label lNew;

    @FXML
    private VBox marcoNombre;

    @FXML
    void pressBegin(ActionEvent event) throws IOException {
        if(!nombre.getText().isBlank()) {
            errornombre.visibleProperty().set(false);
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("v-f.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            Stage stage1 = (Stage) bBegin.getScene().getWindow();
            controllerOpciones controlador = fxmlLoader.getController();
            controlador.setearPreguntas(2);
            stage1.close();
            stage.setTitle("Hello!");
            stage.setMaximized(false);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
        else {
            errornombre.visibleProperty().set(true);
            errornombre.setText("Debe introducir un nombre");
        }
    }

    @FXML
    void pressContinue(ActionEvent event) throws IOException, ClassNotFoundException {


    }

    public void Guardar(Juego juego)throws IOException{
        FileOutputStream fos = new FileOutputStream("juego.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(juego);
        oos.close();
    }

    public Juego Cargar()throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream("juego.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Juego juego = (Juego) ois.readObject();
        ois.close();
        return juego;
    }
}
