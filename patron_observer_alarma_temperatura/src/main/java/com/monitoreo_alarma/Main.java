package com.monitoreo_alarma;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Ramon");
        MonitorTemperatura monitor1 = new MonitorTemperatura(15);

        monitor1.agregarObservador(usuario1);
        monitor1.setTemperatura(25);
        monitor1.notificarObservadores();

    }
}