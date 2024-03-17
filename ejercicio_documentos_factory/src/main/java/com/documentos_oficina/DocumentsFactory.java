package com.documentos_oficina;

public class DocumentsFactory {
    
    public static IDocumentos crearDocumento(String tipoDocumento) {
        if (tipoDocumento.equals("texto")) {
            return new Texto();
        } else if (tipoDocumento.equals("calculo")) {
            return new HojaCalculo();
        } else if (tipoDocumento.equals("presentacion")) {
            return new Presentacion();
        }
        return null;
    }
}
