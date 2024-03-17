package com.juego_rol;

public class CrearPersonaje {

    public static IPersonaje crearPersonaje(String tipoPersonaje) {
        if (tipoPersonaje.equals("mago")) {
            return new Mago();

        } else if (tipoPersonaje.equals("arquero")) {
            return new Arquero();

        } else if (tipoPersonaje.equals("guerrero")) {
            return new Guerrero();
        }
        return null;
    }
}
