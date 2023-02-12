package clases;

public class Binomio {
    
    private final MovimientoPolitico movimientoPolitico;
    private int numeroDeVotosAFavor;

    public Binomio(MovimientoPolitico movimientoPolitico) {
        this.movimientoPolitico = movimientoPolitico;
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
    
}
