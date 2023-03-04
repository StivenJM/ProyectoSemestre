package herramientas;

import clases.Binomio;
import clases.Candidato;
import clases.MovimientoPolitico;
import java.util.ArrayList;
import java.util.Collections;
import ventanas.FrmPrincipal;

public class ManejoDeListas {
    
    /*Esta clase se enfoca unicamente en las listas declaradas en la 
    ventana Principal FrmPrincipal*/
    
    public static void ordenarListaDeBinomios(){
        Collections.sort(FrmPrincipal.listaBinomios);
    }
    
    public static void ordenarListaDeVotantes(){
        Collections.sort(FrmPrincipal.listaVotantes);
    }
    
    public static void ordenarListaDeAdministradores(){
        Collections.sort(FrmPrincipal.listaAdministradores);
    }
    
    public static ArrayList<Binomio> obtenerListaBinomiosOrdenadaPorVotos(){
        ArrayList<Binomio> listaBinomios = new ArrayList<>();
        OrdenarBinomiosPorNumeroVotos o = new OrdenarBinomiosPorNumeroVotos();
        
        listaBinomios.addAll(FrmPrincipal.listaBinomios);
        
        Collections.sort(listaBinomios, o);
        return listaBinomios;
    }
    
}
