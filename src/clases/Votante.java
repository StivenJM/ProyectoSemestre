package clases;

public class Votante extends Persona{
    
    public Votante(String nombres, String apellidos, int[] fechaNacimiento, String numeroCedula) {
        super(nombres, apellidos, fechaNacimiento, numeroCedula);
    }
    
    public void votarPorBinomio(Binomio binomio){
        binomio.setNumeroDeVotosAFavor();
    }
    
}
