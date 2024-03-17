package com.decorator;

public class ComponenteConcreto implements Componente {

    @Override
    public void operacion(){
        System.out.println("Operación en el componente concreto.");
    }
}
