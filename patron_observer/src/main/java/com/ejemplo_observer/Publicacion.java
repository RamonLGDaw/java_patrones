package com.ejemplo_observer;

import java.util.ArrayList;
import java.util.List;

public class Publicacion {

    private List<Observador> observadores = new ArrayList<>();
    private String contenido;

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void eleminarObservador(Observador observador){
        observadores.remove(observador);
    }

    public void notificarObservadores(){
        for (Observador observador : observadores) {
            observador.actualizar(contenido);
            getContenido();
        }
    }

    public void setContenido(String contenido){
        this.contenido = contenido;
        notificarObservadores();
    }
    public void getContenido(){
        System.out.println(this.contenido);
    }
}
