package com.juego_rol;

public class Mago implements IPersonaje {
    
    @Override
    public void habilidad() {
        System.out.println("El personaje mago tiene la habilidad de crear hechizos.");
    }
    
}
