package clases;

import java.io.Serializable;

public class Binomio implements Serializable, Comparable<Binomio> {
    
    private static final long serialVersionUID = 1L;
    private final MovimientoPolitico movimientoPolitico;
    private int numeroDeVotosAFavor;
    private Candidato presidente;
    private Candidato vicepresidente;
    
    /**
     * Constructor para crear un binomio presidencial
     * @param movimientoPolitico objeto que es el movimiento que tiene el binomio
     * @param presidente objeto del presidente que pertenece al binomio
     * @param vicepresidente objeto del vicepresidente que pertenece al binomio 
     */
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

    /**
     * Sobreescritura del método compareTo para comparar los binomios por
     * movimientos
     * @param b objeto de tipo binomio para comparar
     * @return 
     */
    @Override
    public int compareTo(Binomio b) {
        return this.movimientoPolitico.compareTo(b.movimientoPolitico);
    }
    
}
