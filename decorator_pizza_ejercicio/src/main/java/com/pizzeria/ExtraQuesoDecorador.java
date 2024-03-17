package com.pizzeria;

public class ExtraQuesoDecorador implements Pizza {

    private Pizza pizza;

    public ExtraQuesoDecorador(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public double costo(){
        return pizza.costo() + 3.0;
    }
}
