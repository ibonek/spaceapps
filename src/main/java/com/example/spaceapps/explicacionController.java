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
    private ImageView imagen;

    @FXML
    void botonBack(ActionEvent event) throws IOException {
        Stage stage1 = (Stage) bBack.getScene().getWindow();
        stage1.close();
    }
    OpcionesJuego opciones;

    public void setTexto(String t){
        texto.setText(t);
    }
    public void setearImagenes(ImageView imagenRec){
        imagen.setImage(imagenRec.getImage());
    }
    public void setImageView(int n){
        if(n == 1){
            webb_telescope.setVisible(true);
            webb_telescope.setFitWidth(799);
            webb_telescope.setFitHeight(500);
        }
        if(n == 2){
            webb_telescope.setVisible(true);
            webb_telescope.setFitWidth(799);
            webb_telescope.setFitHeight(500);
        }
        if(n == 3){
            webb_telescope.setVisible(true);
            webb_telescope.setFitWidth(799);
            webb_telescope.setFitHeight(500);
        }
        if(n == 4){
            webb_telescope.setVisible(true);
            webb_telescope.setFitWidth(799);
            webb_telescope.setFitHeight(500);
        }
        if(n == 5){
            webb_telescope.setVisible(true);
            webb_telescope.setFitWidth(799);
            webb_telescope.setFitHeight(500);
        }
        if(n == 6){
            webb_telescope.setVisible(true);
            webb_telescope.setFitWidth(799);
            webb_telescope.setFitHeight(500);
        }
        if(n == 7){
            webb_telescope.setVisible(true);
            webb_telescope.setFitWidth(799);
            webb_telescope.setFitHeight(500);
        }
        if(n == 8){
            webb_telescope.setVisible(true);
            webb_telescope.setFitWidth(799);
            webb_telescope.setFitHeight(500);
        }
        if(n == 9){
            webb_telescope.setVisible(true);
            webb_telescope.setFitWidth(799);
            webb_telescope.setFitHeight(500);
        }
        if(n == 10){
            webb_telescope.setVisible(true);
            webb_telescope.setFitWidth(799);
            webb_telescope.setFitHeight(500);
        }
        if(n == 11){
            webb_telescope.setVisible(true);
            webb_telescope.setFitWidth(799);
            webb_telescope.setFitHeight(500);
        }
        if(n == 12){
            webb_telescope.setVisible(true);
            webb_telescope.setFitWidth(799);
            webb_telescope.setFitHeight(500);
        }
        if(n == 13){
            webb_telescope.setVisible(true);
            webb_telescope.setFitWidth(799);
            webb_telescope.setFitHeight(500);
        }
    }
    public void setOpciones(OpcionesJuego opciones) { this.opciones = opciones; }


}
