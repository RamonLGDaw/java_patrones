package com.ejemplo_observer;

public class Usuario implements Observador {

    private String nombre;

    public Usuario(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String contenido) {
        System.out.println("Hola " + nombre + " se ha publicado nuevo contenido.");
        
    }
    
    
}
