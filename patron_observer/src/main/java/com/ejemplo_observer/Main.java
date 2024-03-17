package com.ejemplo_observer;

public class Main {
    public static void main(String[] args) {
        Publicacion publicacion1 = new Publicacion();
        Publicacion publicacion2 = new Publicacion();
        publicacion2.setContenido("Este es el contenido de la segunda publicación.");

        publicacion1.setContenido("Este es el contenido de la nueva publicación.");

        Usuario usuario1 = new Usuario("Ramon");
        Usuario usuario2 = new Usuario("Monica");

        publicacion1.agregarObservador(usuario1);
        publicacion1.agregarObservador(usuario2);
        publicacion2.agregarObservador(usuario1);
        publicacion2.agregarObservador(usuario2);


        publicacion1.notificarObservadores();
        publicacion2.notificarObservadores();

    }
}