package clases;

import java.io.Serializable;

public class Binomio implements Serializable, Comparable<Binomio> {
    
    private static final long serialVersionUID = 1L;
    private final MovimientoPolitico movimientoPolitico;
    private int numeroDeVotosAFavor;
    private Candidato presidente;
    private Candidato vicepresidente;

    public Binomio(MovimientoPolitico movimientoPolitico, Candidato presidente,
            Candidato vicepresidente) {
        this.movimientoPolitico = movimientoPolitico;
        this.presidente = presidente;
        this.vicepresidente = vicepresidente;
        this.numeroDeVotosAFavor = 0;
    }
    
    public MovimientoPolitico getMovimientoPolitico() {
        return movimientoPolitico;
    }
    public int getNumeroDeVotosAFavor() {
        return numeroDeVotosAFavor;
    }

    public void setNumeroDeVotosAFavor() {
        this.numeroDeVotosAFavor++;
    }

    public Candidato getPresidente() {
        return presidente;
    }

    public Candidato getVicepresidente() {
        return vicepresidente;
    }

    @Override
    public int compareTo(Binomio o) {
        return this.movimientoPolitico.compareTo(o.movimientoPolitico);
    }
    
}
