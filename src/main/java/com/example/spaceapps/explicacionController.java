package com.example.spaceapps;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class explicacionController {
    @FXML
    public ImageView NASA_logo;

    @FXML
    private Button bBack;

    @FXML
    private HBox fondo;

    @FXML
    public ImageView james_webb_1;

    @FXML
    private Label texto;

    @FXML
    public ImageView ultraviolet;

    @FXML
    public ImageView webb_cameras;

    @FXML
    public ImageView webb_dimensiones;

    @FXML
    public ImageView webb_distance;

    @FXML
    public ImageView webb_locations;

    @FXML
    public ImageView webb_mars;

    @FXML
    public ImageView webb_objective;

    @FXML
    public ImageView webb_southern;

    @FXML
    public ImageView webb_telescope;

    @FXML
    public ImageView webb_temperature;

    @FXML
    public ImageView webb_vs_hubble;

    @FXML
    void botonBack(ActionEvent event) throws IOException {
        Stage stage1 = (Stage) bBack.getScene().getWindow();
        stage1.close();
    }
    OpcionesJuego opciones;

    public void setTexto(String t){
        texto.setText(t);
    }

    public void setImageView(int n){
        if(n == 1){
            webb_telescope.setVisible(true);
            webb_telescope.setFitWidth(400);
            webb_telescope.setFitHeight(500);
        }
        if(n == 2){
            NASA_logo.setVisible(true);
            NASA_logo.setFitWidth(400);
            NASA_logo.setFitHeight(500);
        }
        if(n == 3){
            webb_dimensiones.setVisible(true);
            webb_dimensiones.setFitWidth(400);
            webb_dimensiones.setFitHeight(500);
        }
        if(n == 4){
            webb_vs_hubble.setVisible(true);
            webb_vs_hubble.setFitWidth(400);
            webb_vs_hubble.setFitHeight(500);
        }
        if(n == 5){
            //webb_telescope.setVisible(true);
            //webb_telescope.setFitWidth(400);
            //webb_telescope.setFitHeight(500);
        }
        if(n == 6){
            webb_locations.setVisible(true);
            webb_locations.setFitWidth(400);
            webb_locations.setFitHeight(500);
        }
        if(n == 7){
            webb_temperature.setVisible(true);
            webb_temperature.setFitWidth(400);
            webb_temperature.setFitHeight(500);
        }
        if(n == 8){
            webb_mars.setVisible(true);
            webb_mars.setFitWidth(400);
            webb_mars.setFitHeight(500);
        }
        if(n == 9){
            james_webb_1.setVisible(true);
            james_webb_1.setFitWidth(400);
            james_webb_1.setFitHeight(500);
        }
        if(n == 10){
            webb_objective.setVisible(true);
            webb_objective.setFitWidth(400);
            webb_objective.setFitHeight(500);
        }
        if(n == 11){
            ultraviolet.setVisible(true);
            ultraviolet.setFitWidth(400);
            ultraviolet.setFitHeight(500);
        }
        if(n == 12){
            webb_distance.setVisible(true);
            webb_distance.setFitWidth(400);
            webb_distance.setFitHeight(500);
        }
        if(n == 13){
            webb_southern.setVisible(true);
            webb_southern.setFitWidth(400);
            webb_southern.setFitHeight(500);
        }
    }
    public void setOpciones(OpcionesJuego opciones) { this.opciones = opciones; }


}
