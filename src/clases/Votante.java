package clases;

public class Votante extends Persona {
    
    private static final long serialVersionUID = 1L;
    private boolean tieneVotoRegistrado;
    
    /**
     * Constructor para crear votante
     * @param nombres nombres del votante que pasan al super
     * @param apellidos apellidos del votante que pasan al super
     * @param fechaNacimiento fecha de nacimiento del votante que pasan al super
     * @param numeroCedula cedula del votante que pasan al super
     */
    public Votante(String nombres, String apellidos, String fechaNacimiento, String numeroCedula) {
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
