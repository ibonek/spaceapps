package com.example.spaceapps;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class nivel2Controller {

        @FXML
        private Button bJupiter;

        @FXML
        private Button bMarte;

        @FXML
        private Button bSaturno;

        @FXML
        private MenuButton botonN2;

        @FXML
        private ImageView botonSaturno;

        @FXML
        void IrANivel3(ActionEvent event) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nivel3.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            Stage stage1 = (Stage) bSaturno.getScene().getWindow();
            //nivel2Controller controlador = fxmlLoader.getController();
            stage1.close();
            stage.setTitle("Level 3");
            stage.setMaximized(false);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }

        @FXML
        void IrANivel4(ActionEvent event) {

        }

        @FXML
        void IrANivel5(ActionEvent event) {

        }

        @FXML
        void botonJupiter(ActionEvent event) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ventanaOpcMult.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            controllerOpciones controller = fxmlLoader.getController();
            controller.setearPreguntas(3);
            stage.setTitle("Pregunta 3");
            stage.setMaximized(false);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();

        }

        @FXML
        void botonMarte(ActionEvent event) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("v-f.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            vfController controller = fxmlLoader.getController();
            controller.setearPreguntas(4);
            stage.setTitle("Pregunta 4");
            stage.setMaximized(false);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();

        }

        @FXML
        void botonSaturno(ActionEvent event) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ventanaOpcMult.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            controllerOpciones controller = fxmlLoader.getController();
            controller.setearPreguntas(5);
            stage.setTitle("Pregunta 5");
            stage.setMaximized(false);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();

        }

        @FXML
        void irANivel1(ActionEvent event) {

        }

    }


