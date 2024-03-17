package com.documentos_oficina;

public class Presentacion implements IDocumentos {
    @Override
    public void abrir() {
       System.out.println("Abrir la presentación.");
    }

    @Override
    public void editar() {
        System.out.println("Editar la presentación.");
    }

    @Override
    public void guardar() {
        System.out.println("Guardar la presentación.");
    }
}
