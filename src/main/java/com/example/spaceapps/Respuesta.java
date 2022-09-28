package com.example.spaceapps;

public class Respuesta {
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
