package com.example.spaceapps;

import javafx.scene.image.Image;

import java.io.Serializable;
import java.util.LinkedList;

public class Juego implements Serializable {
    private LinkedList<Pregunta> preguntas = new LinkedList<>();
    private int aciertos = 1;

    private Image image;

    private int puntos = 0;
    private String nombre;
    private int vidas= 3;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }
    public void resetearPuntos(){puntos = 0;}
    public void setPuntos() {
        puntos += 100;
    }
    public void restPuntos() {
        puntos -= 100;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

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

    public void setAciertos() {
        aciertos++;
    }

    public int getAciertos() {
        return aciertos;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Image imagenExpl(){
        return image;
    }


    public void addConComprobacion(Pregunta pregunta)throws Exception{
        /*
        int contador = 0;
        for (Respuesta r: pregunta.getListaOpciones()){
            if (r.isCorrecta()){
                contador++;
            }
        }
        if (contador != 1){
            throw new Exception();
        } else{

         */
            preguntas.add(pregunta);
        }


    private void crearPreguntas() throws Exception {
        Pregunta pregunta;

        // 0
        pregunta = new Pregunta();
        pregunta.setCuerpoPregunta("What is the James Webb?");
        pregunta.setPista("It is an object related to space");
        pregunta.setExplicacion("James Webb is a NASA space telescope that was launched on December 25, 2021. And it is scanning a large part of the sky.");
        //image = new Image("../../imagenes/webb_telescope.jpg");
        Respuesta respuesta = new Respuesta();

        respuesta.setCuerpoRespuesta("A mobile phone");
        pregunta.getListaOpciones().add(respuesta);


        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("A Telescope");
        respuesta.setCorrecta();
        pregunta.getListaOpciones().add(respuesta);

        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("A NASA spaceship");
        pregunta.getListaOpciones().add(respuesta);

        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("A microscope");

        pregunta.getListaOpciones().add(respuesta);
        addConComprobacion(pregunta);

///---------------------------------------------------------------------------------------------------------------------------------------------------------------
        // 1
        pregunta= new Pregunta();
        pregunta.setCuerpoPregunta("NASA stands for 'National Aeronautics and Space Administration'");

        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("True");
        respuesta.setCorrecta();
        pregunta.getListaOpciones().add(respuesta);

        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("False");
        pregunta.getListaOpciones().add(respuesta);

        pregunta.setExplicacion("NASA is an independent agency of the US Federal government responsible for the civil space program, aeronautics research and space research. It was established in 1958 and the Headquarters are located in Washinton D.C.");
        addConComprobacion(pregunta);


//---------------------------------------------------------------------------------------------------------------------------------------------------------------

       //2
        pregunta = new Pregunta();
        pregunta.setCuerpoPregunta("How big is James Webb Telescope?");
        pregunta.setExplicacion("The sunshield dimensions are 21.2 by 14.2 meters (69.5 by 46.5 feet) and the height of the entire observatory is 8 meters (28 feet).\n");
        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("Diameter of 90 meters and area of approximately 23 square meters");
        pregunta.getListaOpciones().add(respuesta);


        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("Diameter of 6.6 meters and area of approximately 25 square meters");
        respuesta.setCorrecta();
        pregunta.getListaOpciones().add(respuesta);

        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("Diameter of 16.75 meters and area of approximately 180 square meters");
        pregunta.getListaOpciones().add(respuesta);

        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("Diameter of 77 meters and area of approximately 243 square meters");

        pregunta.getListaOpciones().add(respuesta);
        addConComprobacion(pregunta);

///---------------------------------------------------------------------------------------------------------------------------------------------------------------
//3
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
        addConComprobacion(pregunta);
///---------------------------------------------------------------------------------------------------------------------------------------------------------------
//4
        pregunta = new Pregunta();
        pregunta.setCuerpoPregunta("Which organizations participated in the creation of the James Webb Telescope?");
        pregunta.setExplicacion("Since 1996, NASA, ESA and CSA have been collaborating in the creation of the James Webb Telescope. This means that a total of 20 countries are major contributors to this project");
        pregunta.setPista("It is strongly related to USA");
        respuesta= new Respuesta();
        respuesta.setCuerpoRespuesta("NASA, ESA and CSA");
        respuesta.setCorrecta();
        pregunta.getListaOpciones().add(respuesta);

        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("'Club Natacio Sant Andreu' (CNSA)");
        pregunta.getListaOpciones().add(respuesta);

        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("'Roskosmos' (RSA)");
        pregunta.getListaOpciones().add(respuesta);

        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("Japan Aerospace Exploration Agency (JAXA)");
        pregunta.getListaOpciones().add(respuesta);
        addConComprobacion(pregunta);
        //preguntas.add(pregunta);
///---------------------------------------------------------------------------------------------------------------------------------------------------------------
//5
        pregunta = new Pregunta();
        pregunta.setCuerpoPregunta("Approximately where is the James Webb telescope located?");
        pregunta.setExplicacion("The orbit of the James Webb Space Telescope is around L2, 1.500.000km from Earth. This is one of the 5 Lagrange points. Lagrange points are points of gravitational equilibrium for small-mass objects under the influence of two massive orbiting bodies." +
        "Webb's orbit does not lie exactly at the L2 point because the Earth's shadow on the Sun would be large enough to reduce the amount of energy available to Webb's solar panels.");
        pregunta.setPista("It is not located on Earth");
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
        addConComprobacion(pregunta);
///---------------------------------------------------------------------------------------------------------------------------------------------------------------
     //6
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
        addConComprobacion(pregunta);
///---------------------------------------------------------------------------------------------------------------------------------------------------------------
     //7
        pregunta = new Pregunta();
        pregunta.setCuerpoPregunta("Mars was the second thing the James Webb telescope captured");
        pregunta.setExplicacion("NASA’s James Webb Space Telescope captured its first images and spectra of Mars Sept. 5. The telescope, an international collaboration with ESA (European Space Agency) and CSA (Canadian Space Agency), provides a unique perspective with its infrared sensitivity on our neighboring planet, complementing data being collected by orbiters, rovers, and other telescopes");

        respuesta= new Respuesta();
        respuesta.setCuerpoRespuesta("True");
        respuesta.setCorrecta();
        pregunta.getListaOpciones().add(respuesta);

        respuesta= new Respuesta();
        respuesta.setCuerpoRespuesta("False");
        pregunta.getListaOpciones().add(respuesta);
        addConComprobacion(pregunta);


///---------------------------------------------------------------------------------------------------------------------------------------------------------------
//8
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
        addConComprobacion(pregunta);
///---------------------------------------------------------------------------------------------------------------------------------------------------------------
//9
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
        addConComprobacion(pregunta);

///---------------------------------------------------------------------------------------------------------------------------------------------------------------
//10
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
        addConComprobacion(pregunta);


        ///---------------------------------------------------------------------------------------------------------------------------------------------------------------
        //11
        pregunta = new Pregunta();
        pregunta.setCuerpoPregunta("How much of the sky can Webb see");
        pregunta.setExplicacion("Over the course of six months, as Webb orbits the Sun with Earth, it has the ability to observe almost any point in the sky. Webb’s field of regard is limited to a 50-degree swath of the celestial sphere: About 39% of the sky is potentially visible to Webb at any given time. Because Webb must face away from objects that are warm and close enough to interfere with its ability to observe faint infrared light, it cannot observe the Sun, Mercury, Venus, Earth, or the Moon.");
        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("22%");
        pregunta.getListaOpciones().add(respuesta);


        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("81%");
        pregunta.getListaOpciones().add(respuesta);

        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("45%");
        pregunta.getListaOpciones().add(respuesta);

        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("39%");
        pregunta.getListaOpciones().add(respuesta);
        respuesta.setCorrecta();

        addConComprobacion(pregunta);

///---------------------------------------------------------------------------------------------------------------------------------------------------------------
        //12
        pregunta = new Pregunta();
        pregunta.setCuerpoPregunta("The first operational image taken by the James Webb Space Telescope captured a tiny area from the Northern hemisphere");
        respuesta= new Respuesta();
        respuesta.setCuerpoRespuesta("True");
        pregunta.getListaOpciones().add(respuesta);

        respuesta= new Respuesta();
        respuesta.setCuerpoRespuesta("False");
        respuesta.setCorrecta();
        pregunta.getListaOpciones().add(respuesta);

        pregunta.setExplicacion("The first operational image taken by the James Webb Space Telescope captured a tiny area from the Southern hemisphere, centered on SMACS 0723, a galaxy cluster in the constellation of Volans. Thousands of galaxies are visible in the image, some as old as 13 billion years. The image is the highest-resolution image of the early universe ever taken. Published on the 11th of July 2022");
        addConComprobacion(pregunta);
///---------------------------------------------------------------------------------------------------------------------------------------------------------------
        //13
        pregunta = new Pregunta();
        pregunta.setCuerpoPregunta("Which cameras are on the Webb Telescope");
        pregunta.setExplicacion("Webb has four scientific instruments, the Near-Infrared Camera (NIRCam), the Near-Infrared Spectrograph (NIRSpec), the Near-Infrared Imager and Slitless Spectrograph (NIRISS), and the Mid-Infrared Instrument (MIRI).");
        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("NIRCam, NIRSpec, NIRISS and MIRI");
        respuesta.setCorrecta();
        pregunta.getListaOpciones().add(respuesta);


        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("CRIOCam, CRIOSpec, CRIOISS and CRIORI");
        pregunta.getListaOpciones().add(respuesta);

        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("NIRCam and NIRSpec");
        pregunta.getListaOpciones().add(respuesta);

        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("NIRCam, NIRSpec, CRIOISS and CRIORI");

        pregunta.getListaOpciones().add(respuesta);
        addConComprobacion(pregunta);
///---------------------------------------------------------------------------------------------------------------------------------------------------------------
        //14
        pregunta = new Pregunta();
        pregunta.setCuerpoPregunta("How is Webb powered");
        pregunta.setExplicacion("The Webb telescope is powered by an on-board solar array. It also has a propulsion system to maintain the observatory’s orbit and attitude. The solar array provides 2,000 watts of electrical power for the life of the mission, and there is enough propellant onboard for at least 10 years of science operations.");
        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("It is powered by the power of love");
        pregunta.getListaOpciones().add(respuesta);


        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("Is powered by an on-board solar array");
        respuesta.setCorrecta();
        pregunta.getListaOpciones().add(respuesta);

        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("It doesn't need power");
        pregunta.getListaOpciones().add(respuesta);

        respuesta = new Respuesta();
        respuesta.setCuerpoRespuesta("It's powered by the energy of one of Jupiter's moons");

        pregunta.getListaOpciones().add(respuesta);
        addConComprobacion(pregunta);
///---------------------------------------------------------------------------------------------------------------------------------------------------------------





    }

}
