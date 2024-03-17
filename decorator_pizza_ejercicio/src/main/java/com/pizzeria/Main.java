package com.pizzeria;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new PizzaBasica();
        System.out.println("El precio de una pizza básica es: $" + pizza1.costo());
        System.out.println("*************************************");
        Pizza pizza_jamon = new JamonDecorator(new PizzaBasica());
        System.out.println("El precio de una pizza básica con jamón es: $" + pizza_jamon.costo());
        System.out.println("*************************************");
        Pizza pizza_jamon_pimiento = new JamonDecorator(new PimientoDecorator(new PizzaBasica()));
        System.out.println("El precio de una pizza básica + jamón + pimiento es: $" + pizza_jamon_pimiento.costo());
        System.out.println("*************************************");
        Pizza pizza_jamon_pimiento_queso = new JamonDecorator(new PimientoDecorator(new ExtraQuesoDecorador(new PizzaBasica())));
        System.out.println("El precio de la pizza con todos los decoradores es: $" + pizza_jamon_pimiento_queso.costo());

    }
}