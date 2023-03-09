package herramientas;

import clases.Administrador;
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
    
    /**
     * Método para guardar la lista de binomios que se ingrese en el programa,
     * dentro de un archivo
     * @param listaBinomios lista que se va a almacenar en un archivo
     */
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

    /**
     * Método para recuperar la lista de los binomios desde el archivo
     * @return lista de los binomios registrados
     */
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
    
    /**
     * Método para guardar la lista de votantes que se ingrese en el programa,
     * dentro de un archivo
     * @param listaVotantes lista que se va a almacenar en un archivo
     */
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

    /**
     * Método para recuperar la lista de los votantes desde el archivo
     * @return lista de los votantes registrados
     */
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
    
    /**
     * Método para guardar la lista de administradores que se ingrese en el 
     * programa, dentro de un archivo
     * @param listaAdministradores lista que se va a almacenar en un archivo
     */
    public static void guardarListaAdministradores(ArrayList<Administrador> listaAdministradores) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("src"+ File.separator + "archivos" + 
                File.separator + "listaAdministradores.dat"));
            for (Administrador Administrador : listaAdministradores) {
                oos.writeObject(Administrador);
            }
            oos.close();
        } catch (IOException ex) {
            System.err.println("Error IOException guardarAdministradores");
        } catch (Exception e) {
            System.err.println("Error Exception guardarAdministradores");
        }
    }

    /**
     * Método para recuperar la lista de los administradores desde el archivo
     * @return lista de los administradores registrados
     */
    public static ArrayList<Administrador> obtenerListaAdministradores() {
        ArrayList<Administrador> listaAdministradores = new ArrayList<>();

        try {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("src"+ File.separator + "archivos" + 
                File.separator + "listaAdministradores.dat"));
            while (true) {
                try {
                    Administrador Administrador = (Administrador) ois.readObject();
                    listaAdministradores.add(Administrador);
                } catch (EOFException eofe) {
                    break;
                }
            }
            ois.close();
        } catch (ClassNotFoundException ex) {
            System.err.println("Error ClassNotFoundException");
        } catch (IOException ex) {
            System.err.println("Error IOException obtenerAdministradores");
        } catch (Exception e) {
            System.err.println("Error Exception obtenerAdministradores");
        }

        return listaAdministradores;
    }
    
    /**
     * Método para eliminar el archivo de la lista de binomios existente
     */
    public static void eliminarArchivoBinomios(){
        File archivoBinomio = new File("src"+ File.separator + "archivos" + 
                File.separator + "listaBinomios.dat");
        archivoBinomio.delete();
    }
    
    /**
     * Método para eliminar el archivo de la lista de votantes existente
     */
    public static void eliminarArchivoVotantes(){
        File archivoBinomio = new File("src"+ File.separator + "archivos" + 
                File.separator + "listaVotantes.dat");
        archivoBinomio.delete();
    }
    
    /**
     * Método para eliminar el archivo de la lista de administradores existente
     */
    public static void eliminarArchivoAdministradores(){
        File archivoBinomio = new File("src"+ File.separator + "archivos" + 
                File.separator + "listaAdministradores.dat");
        archivoBinomio.delete();
    }
    
    /**
     * Método para comprobar si el archivo de lista de binomios existe
     * @return true si el archivo existe
     */
    public static boolean archivoBinomiosExiste(){
        File archivoBinomio = new File("src"+ File.separator + "archivos" + 
                File.separator + "listaBinomios.dat");
        return archivoBinomio.exists();
    }
    
    /**
     * Método para comprobar si el archivo de lista de votantes existe
     * @return true si el archivo existe
     */
    public static boolean archivoVotantesExiste(){
        File archivoVotante = new File("src"+ File.separator + "archivos" + 
                File.separator + "listaVotantes.dat");
        return archivoVotante.exists();
    }
    
    /**
     * Método para comprobar si el archivo de lista de administradores existe
     * @return true si el archivo existe
     */
    public static boolean archivoAdministradoresExiste(){
        File archivoAdministradores = new File("src"+ File.separator + "archivos" + 
                File.separator + "listaAdministradores.dat");
        return archivoAdministradores.exists();
    }
    
}
