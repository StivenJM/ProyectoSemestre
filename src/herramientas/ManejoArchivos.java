package herramientas;

import clases.Binomio;
import clases.Votante;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ManejoArchivos {
    
    public static void guardarListaBinomios(ArrayList<Binomio> listaBinomios) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("src"+ File.separator + "archivos" +
                            File.separator + "listaBinomios.dat"));
            for (Binomio Binomio : listaBinomios) {
                oos.writeObject(Binomio);
            }
            oos.close();
        } catch (IOException ex) {
            System.err.println("Error IOException guardarBinomio");
        } catch (Exception e) {
            System.err.println("Error Exception guardarBinomio");
        }
    }

    public static ArrayList<Binomio> obtenerListaBinomios() {
        ArrayList<Binomio> listaBinomios = new ArrayList<>();

        try {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("src"+ File.separator + "archivos" + 
                            File.separator + "listaBinomios.dat"));
            while (true) {
                try {
                    Binomio Binomio = (Binomio) ois.readObject();
                    listaBinomios.add(Binomio);
                } catch (EOFException eofe) {
                    break;
                }
            }
            ois.close();
        } catch (ClassNotFoundException ex) {
            System.err.println("Error ClassNotFoundException obtenerBinomio");
        } catch (IOException ex) {
            System.err.println("Error IOException obtenerBinomio");
        } catch (Exception e) {
            System.err.println("Error Exception obtenerBinomio");
        }

        return listaBinomios;
    }
    
    public static void guardarListaVotantes(ArrayList<Votante> listaVotantes) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("src"+ File.separator + "archivos" + 
                            File.separator + "listaVotantes.dat"));
            for (Votante Votante : listaVotantes) {
                oos.writeObject(Votante);
            }
            oos.close();
        } catch (IOException ex) {
            System.err.println("Error IOException guardarVotantes");
        } catch (Exception e) {
            System.err.println("Error Exception guardarVotantes");
        }
    }

    public static ArrayList<Votante> obtenerListaVotantes() {
        ArrayList<Votante> listaVotantes = new ArrayList<>();

        try {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("src"+ File.separator + "archivos" + 
                            File.separator + "listaVotantes.dat"));
            while (true) {
                try {
                    Votante Votante = (Votante) ois.readObject();
                    listaVotantes.add(Votante);
                } catch (EOFException eofe) {
                    break;
                }
            }
            ois.close();
        } catch (ClassNotFoundException ex) {
            System.err.println("Error ClassNotFoundException");
        } catch (IOException ex) {
            System.err.println("Error IOException obtenerVotantes");
        } catch (Exception e) {
            System.err.println("Error Exception obtenerVotantes");
        }

        return listaVotantes;
    }
    
    public static void eliminarArchivoBinomios(){
        File archivoBinomio = new File("src"+ File.separator + "archivos" + 
                File.separator + "listaBinomios.dat");
        archivoBinomio.delete();
    }
    
    public static void eliminarArchivoVotantes(){
        File archivoBinomio = new File("src"+ File.separator + "archivos" + 
                File.separator + "listaVotantes.dat");
        archivoBinomio.delete();
    }
    
}
