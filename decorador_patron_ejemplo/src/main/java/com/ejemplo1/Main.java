package com.ejemplo1;

public class Main {
    public static void main(String[] args) {
        Cafe cafebasico = new CafeBasico();
        System.out.println("Costo de un café básico: $" + cafebasico.costo());

        Cafe cafeConLeche = new LecheDecorator(new CafeBasico());
        System.out.println("Costo de una café con leche: $" + cafeConLeche.costo());

        Cafe cafeConAzucar = new AzucarDecorator(new CafeBasico());
        System.out.println("Costo de un café con azucar: $" + cafeConAzucar.costo());

        Cafe cafeConAzurcarConLeche = new AzucarDecorator(new LecheDecorator(new CafeBasico()));
        System.out.println("Costo de una café con leche y azucar: " + cafeConAzurcarConLeche.costo());
    }
}