package com.example.spaceapps;

import java.io.Serializable;

public class Respuesta  implements Serializable {
    private String cuerpoRespuesta;
    private boolean correcta = false;

    public String getCuerpoRespuesta() {
        return cuerpoRespuesta;
    }

    public void setCuerpoRespuesta(String cuerpoRespuesta) {
        this.cuerpoRespuesta = cuerpoRespuesta;
    }

    public boolean isCorrecta() {
        return correcta;
    }

    public void setCorrecta() {
        this.correcta = true;
    }

    @Override
    public String toString() {
        return "Respuesta{" +
                "cuerpoRespuesta='" + cuerpoRespuesta + '\'' +
                ", correcta=" + correcta +
                '}';
    }
}
