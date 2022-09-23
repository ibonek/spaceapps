package com.example.spaceapps;

public class VerdaderoFalso extends Pregunta{
    private boolean verdadero;

    public boolean isVerdadero() {
        return verdadero;
    }

    public void setVerdadero(boolean verdadero) {
        this.verdadero = verdadero;
    }

    @Override
    public String toString() {
        return " VerdaderoFalso{" + super.toString()+
                " verdadero=" + verdadero +
                '}';
    }
}
