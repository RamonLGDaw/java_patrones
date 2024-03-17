package com.juego_rol;

public class Guerrero implements IPersonaje {
   
    @Override
    public void habilidad() {
        System.out.println("El personaje de tipo guerrero tiene la habilidad de luchar.");
    }
}
