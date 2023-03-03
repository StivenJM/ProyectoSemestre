package main;

import clases.Binomio;
import clases.Candidato;
import clases.MovimientoPolitico;
import clases.Votante;
import java.util.ArrayList;
import herramientas.ManejoArchivos;

public class Main {

    public static void main(String[] args) {
        /*
        ArrayList<Binomio> listaBinomios = new ArrayList<>();
        listaBinomios.add(new Binomio(new MovimientoPolitico("Alianza Paiz", 12), 
                new Candidato("Presidente", "Rafael", "Correa"), 
                new Candidato("Vicepresidente", "Jorge", "Glaz")));
        listaBinomios.add(new Binomio(new MovimientoPolitico("Derechista", 20), 
                new Candidato("Presidente", "Stiven", "Moposita"), 
                new Candidato("Vicepresidente", "Joel", "Mugmal")));
        listaBinomios.add(new Binomio(new MovimientoPolitico("Izquierdista", 30), 
                new Candidato("Presidente", "Jhonatan", "Moposita"), 
                new Candidato("Vicepresidente", "Alexander", "Mugmal")));
        listaBinomios.add(new Binomio(new MovimientoPolitico("Populismo", 40), 
                new Candidato("Presidente", "Mayerli", "Moposita"), 
                new Candidato("Vicepresidente", "Belen", "Mugmal")));
        ManejoArchivos.guardarListaBinomios(listaBinomios);
        */
        
        
        /*
        ArrayList<Binomio> lista = ManejoArchivos.obtenerListaBinomios();
        for (Binomio binomio : lista) {
            System.out.println(binomio.getPresidente().getNombres() + "\t\t\t" +
                    binomio.getVicepresidente().getNombres());
        }
        */
        
        
        ManejoArchivos.eliminarArchivoBinomios();
    }
    
}
