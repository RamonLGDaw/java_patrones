package com.documentos_oficina;

public class Texto implements IDocumentos {

    @Override
    public void abrir() {
       System.out.println("Abrir el archivo de texto");
    }

    @Override
    public void editar() {
        System.out.println("Editar el archivo de texto");
    }

    @Override
    public void guardar() {
        System.out.println("Guardar el archivo de texto");
    }
    
}
