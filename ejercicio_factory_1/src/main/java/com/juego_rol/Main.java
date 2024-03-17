package com.juego_rol;

public class Main {
    
    public static void main(String[] args) {
       IPersonaje guerrero = CrearPersonaje.crearPersonaje("guerrero");
       guerrero.habilidad();
        
    }
}