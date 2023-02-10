package clases;

public class Binomio {
    
    private Candidato canditadoAPresidente;
    private Candidato canditadoAVicepresidente;
    private int numeroDatosAFavor;

    public Binomio(Candidato canditadoAPresidente, Candidato canditadoAVicepresidente) {
        this.canditadoAPresidente = canditadoAPresidente;
        this.canditadoAVicepresidente = canditadoAVicepresidente;
    }

    public Candidato getCanditadoAPresidente() {
        return canditadoAPresidente;
    }

    public void setCanditadoAPresidente(Candidato canditadoAPresidente) {
        this.canditadoAPresidente = canditadoAPresidente;
    }

    public Candidato getCanditadoAVicepresidente() {
        return canditadoAVicepresidente;
    }

    public void setCanditadoAVicepresidente(Candidato canditadoAVicepresidente) {
        this.canditadoAVicepresidente = canditadoAVicepresidente;
    }

    public int getNumeroDatosAFavor() {
        return numeroDatosAFavor;
    }

    public void agregarVotoAFavor() {
        this.numeroDatosAFavor++;
    }
    
}
