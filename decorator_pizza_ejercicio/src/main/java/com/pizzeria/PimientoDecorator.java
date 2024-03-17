package com.pizzeria;

public class PimientoDecorator implements Pizza {

    private Pizza pizza;

    public PimientoDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public double costo() {
        
        return pizza.costo() + 1;
    }
    
}
