package herramientas;

import clases.Binomio;
import java.util.Comparator;

public class OrdenarBinomiosPorNumeroVotos implements Comparator<Binomio>{

    @Override
    public int compare(Binomio binomio1, Binomio binomio2) {
        return Integer.compare(binomio1.getNumeroDeVotosAFavor(), 
                binomio2.getNumeroDeVotosAFavor());
    }
    
}
