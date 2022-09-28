package com.example.spaceapps;

import java.io.Serializable;
import java.util.LinkedList;

public class Juego implements Serializable {
    private LinkedList<Pregunta> preguntas = new LinkedList<>();
    private int nivelActual = 1;

    public Juego() {
        try {
            crearPreguntas();
        } catch (Exception ex){
            System.out.println("Has intentado crear una pregunta sin respuesta correcta o con más de 1 posible respuesta correcta");
        }
    }

    public LinkedList<Pregunta> getPreguntas() {
        return preguntas;
    }


    public int getNivelActual() {
        return nivelActual;
    }

    public void addConComprobacion(Pregunta pregunta)throws Exception{
        int contador = 0;
        for (Respuesta r: pregunta.getListaOpciones()){
            if (r.isCorrecta()){
                contador++;
            }
        }
        if (contador != 1){
            throw new Exception();
        } else{
            preguntas.add(pregunta);
        }
    }

    public void setNivelActual(int nivelActual) {
        this.nivelActual = nivelActual;
    }
    private void crearPreguntas() throws Exception {
        Pregunta pregunta = new Pregunta();

        pregunta.setCuerpoPregunta("Which organizations participated in the creation of the James Webb Telescope?");
        pregunta.setExplicacion("Since 1996, NASA, ESA and CSA have been collaborating in the creation of the James Webb Telescope. This means that a total of 20 countries are major contributors to this project");

        Respuesta respuesta= new Respuesta();
        respuesta.setCuerpoRespuesta("NASA, ESA and CSA");
        respuesta.setCorrecta();
        pregunta.getListaOpciones().add(respuesta);

        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("CNSA");
        pregunta.getListaOpciones().add(respuesta);

        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("RSA");
        pregunta.getListaOpciones().add(respuesta);

        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("JAXA");
        pregunta.getListaOpciones().add(respuesta);
        addConComprobacion(pregunta);
        //preguntas.add(pregunta);
///---------------------------------------------------------------------------------------------------------------------------------------------------------------


        pregunta = new Pregunta();
        pregunta.setCuerpoPregunta("Approximately where is the James Webb telescope located?");
        pregunta.setExplicacion("The orbit of the James Webb Space Telescope is around L2, 1.500.000km from Earth. This is one of the 5 Lagrange points. Lagrange points are points of gravitational equilibrium for small-mass objects under the influence of two massive orbiting bodies." +
        "Webb's orbit does not lie exactly at the L2 point because the Earth's shadow on the Sun would be large enough to reduce the amount of energy available to Webb's solar panels.");

        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("Approximately the distance of the Moon");
        pregunta.getListaOpciones().add(respuesta);


        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("Approximately at point L2");
        respuesta.setCorrecta();
        pregunta.getListaOpciones().add(respuesta);

        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("In the U.S");
        pregunta.getListaOpciones().add(respuesta);

        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("Somewhere in Europe");

        pregunta.getListaOpciones().add(respuesta);
        preguntas.add(pregunta);
///---------------------------------------------------------------------------------------------------------------------------------------------------------------


        pregunta = new Pregunta();
        pregunta.setCuerpoPregunta("It is necessary to keep the James Webb Telescope's temperature under 50 K (-223,2 ºC)?");

        respuesta= new Respuesta();
        respuesta.setCuerpoRespuesta("True");
        respuesta.setCorrecta();
        pregunta.getListaOpciones().add(respuesta);

        respuesta= new Respuesta();
        respuesta.setCuerpoRespuesta("False");
        pregunta.getListaOpciones().add(respuesta);
        pregunta.setExplicacion("The James Webb Space Telescope must be kept below 50 K (-223.2 ºC); otherwise, infrared radiation from the telescope itself would overwhelm its sensors. To maintain this temperature, a large sunshield blocks light and heat from nearby space bodies and stops impacts from small asteroids. In addition, a mechanical helium gas cooler is located on the hot side of the environmental shield");
        preguntas.add(pregunta);
///---------------------------------------------------------------------------------------------------------------------------------------------------------------

        pregunta = new Pregunta();
        pregunta.setCuerpoPregunta("When was James Webb Telescope launched?");
        pregunta.setExplicacion("The James Webb Space Telescope was launched on 25 December 2021 on an Ariane 5 Rocket from French Guiana");

        respuesta= new Respuesta();
        respuesta.setCuerpoRespuesta("25 December 2021");
        respuesta.setCorrecta();
        pregunta.getListaOpciones().add(respuesta);

        respuesta= new Respuesta();
        respuesta.setCuerpoRespuesta("14 February 2004");
        pregunta.getListaOpciones().add(respuesta);

        respuesta= new Respuesta();
        respuesta.setCuerpoRespuesta("6 July 2015");
        pregunta.getListaOpciones().add(respuesta);

        respuesta= new Respuesta();
        respuesta.setCuerpoRespuesta("29 April 2001");
        pregunta.getListaOpciones().add(respuesta);
        preguntas.add(pregunta);
///---------------------------------------------------------------------------------------------------------------------------------------------------------------

        pregunta= new Pregunta();
        pregunta.setCuerpoPregunta("James Webb Space Telescope is considered the formal succesor to the Hubbel Space Telescope");

        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("True");
        respuesta.setCorrecta();
        pregunta.getListaOpciones().add(respuesta);

        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("False");
        pregunta.getListaOpciones().add(respuesta);

        pregunta.setExplicacion("The James Webb Space Telescope is considered the formal successor to the Hubbel Space Telescope and the Spitzer Space Telescope. In addition, the James Webb will surpass these two telescopes by being able to see many more stars and older galaxies, giving us the highest resolution images of space to date");
        preguntas.add(pregunta);
///---------------------------------------------------------------------------------------------------------------------------------------------------------------

        pregunta = new Pregunta();
        pregunta.setCuerpoPregunta("Which is one of the main objectives of the James Webb Telescope?");
        pregunta.setExplicacion("The James Webb Space Telescope has 4 main objectives: to study the formation and evolution of galaxies, to understand the formation of stars, to study the origins of life and to search for light from the first stars that formed in the universe after the Big Bang");

        respuesta= new Respuesta();
        respuesta.setCuerpoRespuesta("To know the weather forecast");
        pregunta.getListaOpciones().add(respuesta);

        respuesta= new Respuesta();
        respuesta.setCuerpoRespuesta("To understand the rotation of the Moon");
        pregunta.getListaOpciones().add(respuesta);

        respuesta= new Respuesta();
        respuesta.setCuerpoRespuesta("To study the changes in the Earth's temperature");
        pregunta.getListaOpciones().add(respuesta);

        respuesta= new Respuesta();
        respuesta.setCuerpoRespuesta("To study galaxy formation and evolution");
        respuesta.setCorrecta();
        pregunta.getListaOpciones().add(respuesta);
        preguntas.add(pregunta);

        ///---------------------------------------------------------------------------------------------------------------------------------------------------------------

        pregunta= new Pregunta();
        pregunta.setCuerpoPregunta("Does the James Webb Space Telescope measure visible and ultraviolet light?");

        respuesta= new Respuesta();
        respuesta.setCuerpoRespuesta("True");
        pregunta.getListaOpciones().add(respuesta);

        respuesta= new Respuesta();
        respuesta.setCuerpoRespuesta("False");
        respuesta.setCorrecta();
        pregunta.getListaOpciones().add(respuesta);

        pregunta.setExplicacion("The James Webb Space Telescope observes in near-infrared light rather than visible or ultraviolet light in order to accomplish more effectively its objectives");
        preguntas.add(pregunta);

        ///---------------------------------------------------------------------------------------------------------------------------------------------------------------

        /*
        ¿Se pueden hacer preguntas que en vez de elegir entre opciones de texto se tenga que elegir entre imágenes? si se puede:

        HAY QUE CAMBIAR ESTO Y SEGUIR LA ESTRUCTURA DEL RESTO

        pregunta.setCuerpoPregunta(Select the image which was captured by James Webb Space Telescope);
        pregunta.getListaOpciones().add(RUTA A IMAGEN DEL WEBBS FIRST DEEP FIELD);
        pregunta.getListaOpciones().add(RUTA A IMAGEN DEL HABBEL FIRST DEEP FIELD);
        pregunta.setOpcionCorrecta(0);
        pregunta.setExplicacion("That image corresponds to Webb's First Deep Field which was the first full false-color image from the James Webb Telescope and the highest-resolution infrared view of the universe to date. The other image corresponds to the same galaxy cluster being captured by the Hubbel Telescope in 2017");
        preguntas.add(pregunta);

        pregunta.setCuerpoPregunta(Select the Neptune's image which was captured by James Webb Space Telescope);
        pregunta.getListaOpciones().add(RUTA A IMAGEN DEL NEPTUNO HABBEL);
        pregunta.getListaOpciones().add(RUTA A IMAGEN DEL NEPTUNO WEBB);
        pregunta.setOpcionCorrecta(1);
        pregunta.setExplicacion("That image is the clearest ever seen of Neptune with its rings, moons and space dust. The other image is the Hubbel view of the same planet, the difference between the two images is due to the different wavelengths of light used by the two telescopes.");
        preguntas.add(pregunta);
         */


    }

}