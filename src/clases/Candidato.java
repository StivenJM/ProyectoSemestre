package clases;

import java.io.File;

public class Candidato extends Persona{
    
    private static final long serialVersionUID = 1L;
    private String cargoPublicoPostulado;
    private String rutaImagen;

    /**
     * Constructor para crear un candidato
     * @param cargoPublicoPostulado texto que indica el cargo al que aspira el
     * candidato
     * @param nombres nombres del candidato
     * @param apellidos apellidos del candidato
     */
    public Candidato(String cargoPublicoPostulado, String nombres, 
            String apellidos) {
        super(nombres, apellidos);
        this.cargoPublicoPostulado = cargoPublicoPostulado;
        this.rutaImagen = "src" + File.separator + "imagenes" + File.separator +
                "candidatos" + File.separator + "logoCandidato.png";
    }

    public String getCargoPublicoPostulado() {
        return cargoPublicoPostulado;
    }

    public void setCargoPublicoPostulado(String cargoPublicoPostulado) {
        this.cargoPublicoPostulado = cargoPublicoPostulado;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
    
}
