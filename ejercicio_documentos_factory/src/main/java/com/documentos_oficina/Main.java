package com.documentos_oficina;

public class Main {
    public static void main(String[] args) {
        IDocumentos miHojaDeCalculo = DocumentsFactory.crearDocumento("calculo");
        miHojaDeCalculo.abrir();
        IDocumentos miDocumento = DocumentsFactory.crearDocumento("texto");
        miDocumento.abrir();
    }
}