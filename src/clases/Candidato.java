package clases;

public class Candidato extends Persona{
    
    private static final long serialVersionUID = 1L;
    private String cargoPublicoPostulado;

    public Candidato(String cargoPublicoPostulado, String nombres, 
            String apellidos) {
        super(nombres, apellidos);
        this.cargoPublicoPostulado = cargoPublicoPostulado;
    }

    public String getCargoPublicoPostulado() {
        return cargoPublicoPostulado;
    }

    public void setCargoPublicoPostulado(String cargoPublicoPostulado) {
        this.cargoPublicoPostulado = cargoPublicoPostulado;
    }
    
}
