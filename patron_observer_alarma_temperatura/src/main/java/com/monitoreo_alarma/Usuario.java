package com.monitoreo_alarma;

public class Usuario implements Observador {

    private String nombre;

    public Usuario(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void actualizar(int temp) {
       System.out.println(  getUsuario() +" la temperatura ha variado ");
    }

    public String getUsuario(){
        return nombre;
    }
    
}
