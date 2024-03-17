package com.monitoreo_alarma;

import java.util.*;

public class MonitorTemperatura {

    private List<Observador> observadores = new ArrayList<>();
    private int temperatura;
    
    public MonitorTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public void agregarObservador(Observador observador){
        observadores.add(observador);
        
    }

    public void eliminarObservador(Observador observador){
        observadores.remove(observador);
    }

    public void notificarObservadores(){
        for (Observador observador : observadores) {
            observador.actualizar(temperatura);
            
        }
    }

    public void setTemperatura(int nuevaTemp){
        this.temperatura = nuevaTemp;
    }
}
