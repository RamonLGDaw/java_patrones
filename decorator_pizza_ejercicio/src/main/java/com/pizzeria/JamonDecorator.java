package com.pizzeria;

public class JamonDecorator implements Pizza {

    private Pizza pizza;

    public JamonDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public double costo(){
        return pizza.costo() + 2.5;
    }
    
}
