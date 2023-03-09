package herramientas;

import clases.Binomio;
import java.util.Comparator;

public class OrdenarBinomiosPorNumeroVotos implements Comparator<Binomio>{

    /**
     * Comparar los binomios para poder clasificarlos mediante el número de votos
     * obtenidos
     * @param binomio1 primer objeto de tipo binomio para comparar
     * @param binomio2 segundo objeto de tipo binomio para comparar
     * @return entero según el resultado obtenido
     */
    @Override
    public int compare(Binomio binomio1, Binomio binomio2) {
        return Integer.compare(binomio1.getNumeroDeVotosAFavor(), 
                binomio2.getNumeroDeVotosAFavor());
    }
    
}
