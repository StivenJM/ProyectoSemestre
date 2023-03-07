package clases;

import java.io.Serializable;

public class MovimientoPolitico implements Serializable, 
        Comparable<MovimientoPolitico> {
    
    private static final long serialVersionUID = 1L;
    private String nombre;
    private int numeroDeLista;
    private String rutaImagen;

    public MovimientoPolitico(String nombre, int numeroDeLista) {
        this.nombre = nombre;
        this.numeroDeLista = numeroDeLista;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroDeLista(int numeroDeLista) {
        this.numeroDeLista = numeroDeLista;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroDeLista() {
        return numeroDeLista;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    @Override
    public int compareTo(MovimientoPolitico o) {
        return this.nombre.compareTo(o.nombre);
    }
    
}
