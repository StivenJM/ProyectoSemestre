package clases;

public class MovimientoPolitico {
    
    private String nombre;
    private int numeroDeLista;
    private Candidato presidente;
    private Candidato vicepresidente;

    public MovimientoPolitico(String nombre, int numeroDeLista, Candidato presidente, Candidato vicepresidente) {
        this.nombre = nombre;
        this.numeroDeLista = numeroDeLista;
        this.presidente = presidente;
        this.vicepresidente = vicepresidente;
    }

    public Candidato getPresidente() {
        return presidente;
    }

    public Candidato getVicepresidente() {
        return vicepresidente;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroDeLista() {
        return numeroDeLista;
    }
    
}
