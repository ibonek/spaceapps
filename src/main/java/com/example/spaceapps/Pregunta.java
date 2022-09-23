package com.example.spaceapps;

import java.util.LinkedList;

public abstract class Pregunta{
    private String cuerpoPregunta;

    private String explicacion;

    private boolean resuelta = false;


    public final String getCuerpoPregunta() {
        return cuerpoPregunta;
    }

    public final void setCuerpoPregunta(String cuerpoPregunta) {
        this.cuerpoPregunta = cuerpoPregunta;
    }


    public final void resolver () {
        this.resuelta = true;
    }

    public final boolean isResuelta() {
        return resuelta;
    }

    public final String getExplicacion() {
        return explicacion;
    }

    public final void setExplicacion(String explicacion) {
        this.explicacion = explicacion;
    }

    @Override
    public String toString() {
        return "cuerpoPregunta='" + cuerpoPregunta + '\'' +
                ", explicacion='" + explicacion + '\'' +
                ", resuelta=" + resuelta
                ;
    }
}
