package clases;

import java.io.Serializable;

public class MovimientoPolitico implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String nombre;
    private int numeroDeLista;

    public MovimientoPolitico(String nombre, int numeroDeLista) {
        this.nombre = nombre;
        this.numeroDeLista = numeroDeLista;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroDeLista() {
        return numeroDeLista;
    }
    
}
