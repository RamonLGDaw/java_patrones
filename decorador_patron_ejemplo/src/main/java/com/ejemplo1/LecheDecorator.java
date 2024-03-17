package com.ejemplo1;

public class LecheDecorator implements Cafe {

    private Cafe cafe;

    public LecheDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public double costo() {

        // Se agrega el coste de la leche al coste del café.
        return cafe.costo() + 1.0;
    }

}
