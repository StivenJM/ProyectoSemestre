package clases;

public class Votante extends Persona {
    
    private static final long serialVersionUID = 1L;
    private boolean tieneVotoRegistrado;
    
    public Votante(String nombres, String apellidos, int[] fechaNacimiento, String numeroCedula) {
        super(nombres, apellidos, fechaNacimiento, numeroCedula);
        tieneVotoRegistrado = false;
    }
    
    public void votarPorBinomio(Binomio binomio){
        binomio.setNumeroDeVotosAFavor();
    }

    public boolean getTieneVotoRegistrado() {
        return tieneVotoRegistrado;
    }

    public void setTieneVotoRegistrado() {
        this.tieneVotoRegistrado = true;
    }
    
}
