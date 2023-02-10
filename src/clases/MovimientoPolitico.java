package clases;

public class MovimientoPolitico {
    
    private String nombre;
    private int numeroDeLista;

    public MovimientoPolitico(String nombre, int numeroDeLista) {
        this.nombre = nombre;
        this.numeroDeLista = numeroDeLista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeLista() {
        return numeroDeLista;
    }

    public void setNumeroDeLista(int numeroDeLista) {
        this.numeroDeLista = numeroDeLista;
    }
    
}
