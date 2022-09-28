package com.example.spaceapps;

import java.util.LinkedList;

public class Pregunta {
    private String cuerpoPregunta;
    private LinkedList<Respuesta> listaOpciones=new LinkedList<>();
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

    public LinkedList<Respuesta> getListaOpciones() {
        return listaOpciones;
    }

    @Override
    public String toString() {
        return "Pregunta{" +
                "cuerpoPregunta='" + cuerpoPregunta + '\'' +
                ", listaOpciones=" + listaOpciones +
                ", explicacion='" + explicacion + '\'' +
                ", resuelta=" + resuelta +
                '}';
    }
}