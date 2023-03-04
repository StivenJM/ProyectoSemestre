package main;

import clases.Administrador;
import clases.Binomio;
import clases.Candidato;
import clases.MovimientoPolitico;
import clases.Votante;
import java.util.ArrayList;
import herramientas.ManejoArchivos;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        
        /*
        ArrayList<Binomio> listaBinomios = new ArrayList<>();
        listaBinomios.add(new Binomio(new MovimientoPolitico(
                "Izquierda Democratica", 12), 
                new Candidato("Presidente", "Rafael", "Correa"), 
                new Candidato("Vicepresidente", "Jorge", "Glaz")));
        listaBinomios.add(new Binomio(new MovimientoPolitico("Derechista", 20), 
                new Candidato("Presidente", "Stiven", "Moposita"), 
                new Candidato("Vicepresidente", "Joel", "Mugmal")));
        listaBinomios.add(new Binomio(new MovimientoPolitico("Alianza Pais", 30), 
                new Candidato("Presidente", "Jhonatan", "Moposita"), 
                new Candidato("Vicepresidente", "Alexander", "Mugmal")));
        listaBinomios.add(new Binomio(new MovimientoPolitico("Populismo", 40), 
                new Candidato("Presidente", "Mayerli", "Moposita"), 
                new Candidato("Vicepresidente", "Belen", "Mugmal")));
        
        for (Binomio binomio : listaBinomios) {
            System.out.println(binomio.getMovimientoPolitico().getNombre() +
                    "\t\t" + binomio.getPresidente().getNombres() + "\t\t" +
                    binomio.getVicepresidente().getNombres());
        }
        
        Collections.sort(listaBinomios);
        
        System.out.println("--------------------------------------------------");
        for (Binomio binomio : listaBinomios) {
            System.out.println(binomio.getMovimientoPolitico().getNombre() +
                    "\t\t" + binomio.getPresidente().getNombres() + "\t\t" +
                    binomio.getVicepresidente().getNombres());
        }
        */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        ArrayList<MovimientoPolitico> lista = new ArrayList<>();
        lista.add(new MovimientoPolitico("Alianza Paiz", 12));
        lista.add(new MovimientoPolitico("Todo Democracia", 11));
        lista.add(new MovimientoPolitico("Populismo", 6));
        lista.add(new MovimientoPolitico("Alianza Democracia", 6));
        
        for (MovimientoPolitico movimientoPolitico : lista) {
            System.out.println(movimientoPolitico.getNombre());
        }
        System.out.println("-------------------------------------");
        
        Collections.sort(lista);
        for (MovimientoPolitico movimientoPolitico : lista) {
            System.out.println(movimientoPolitico.getNombre());
        }*/
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        ArrayList<Administrador> lista = new ArrayList<>();
        lista.add(new Administrador("STIVENJM", "hola", "Stiven Joel", 
                "Moposita Mugmal"));
        lista.add(new Administrador("JHONATANMP", "hola", "Alexander Jhonatan", 
                "Moposita Mugmal"));
        lista.add(new Administrador("MAYERLIM", "hola", "Mayerli Belen", 
                "Moposita Mugmal"));
        lista.add(new Administrador("RAMDOMXD", "hola", "Fernando Luis", 
                "Castro Salazar"));
        
        for (Administrador administrador : lista) {
            System.out.println(administrador.getApellidos() + " " +
                    administrador.getNombres());
        }
        System.out.println("--------------------------------------------------");
        
        Collections.sort(lista);
        for (Administrador administrador : lista) {
            System.out.println(administrador.getApellidos() + " " +
                    administrador.getNombres());
        }
    }
    
}
