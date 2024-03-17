package com.decorator;

public class DecoradorConcreto extends Decorador {
    public DecoradorConcreto(Componente componente){
        super(componente);
    }

    @Override
    public void operacion(){
        super.operacion();
        agregarFuncionalidad();
    }
    
    private void agregarFuncionalidad(){
        System.out.println("Funcionalidad agregada por el decorador.");
    }
}
