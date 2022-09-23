package com.example.spaceapps;

import java.util.LinkedList;

public class OpcionesMultiples extends Pregunta{
    private LinkedList<String> listaOpciones=new LinkedList<>();
    private int opcionCorrecta;

    public LinkedList<String> getListaOpciones() {
        return listaOpciones;
    }
    

    public int getOpcionCorrecta() {
        return opcionCorrecta;
    }

    public void setOpcionCorrecta(int opcionCorrecta) {
        this.opcionCorrecta = opcionCorrecta;
    }

    @Override
    public String toString() {
        return "OpcionesMultiples{" + super.toString()+
                " listaOpciones=" + listaOpciones +
                ", opcionCorrecta=" + opcionCorrecta +
                '}';
    }
}
