package com.example.spaceapps;

import java.io.*;


public class OpcionesJuego {

    Juego juego;
    public void Guardar(Juego juego) throws IOException {
        FileOutputStream fos = new FileOutputStream( "juego.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(juego);
        oos.close();
    }

    public Juego Cargar(String archivo) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(archivo);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Juego juego = (Juego) ois.readObject();
        ois.close();
        return juego;
    }

    public void crearJuego(){
        juego = new Juego();




    }
}
