package com.documentos_oficina;

public class HojaCalculo implements IDocumentos {
    
    @Override
    public void abrir() {
       System.out.println("Abrir la hoja de cálculo.");
    }

    @Override
    public void editar() {
        System.out.println("Editar la hoja de cálculo.");
    }

    @Override
    public void guardar() {
        System.out.println("Guardar la hoja de cálculo.");
    }
}
