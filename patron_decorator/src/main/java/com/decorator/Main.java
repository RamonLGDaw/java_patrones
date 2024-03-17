package com.decorator;

public class Main {
    public static void main(String[] args) {
       Componente componente1 = new ComponenteConcreto();
       componente1.operacion();

       Componente componenteDecorado = new DecoradorConcreto(new ComponenteConcreto());
       componenteDecorado.operacion();
    }
}