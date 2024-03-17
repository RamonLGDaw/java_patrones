package com.decorator;

public abstract class Decorador implements Componente {
    protected Componente componente;

    public Decorador(Componente componente){
        this.componente = componente;
    }

    @Override
    public void operacion(){
        componente.operacion();
    }
}
