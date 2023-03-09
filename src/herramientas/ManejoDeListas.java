package herramientas;

import clases.*;
import clases.MovimientoPolitico;
import java.util.ArrayList;
import java.util.Collections;
import ventanas.FrmPrincipal;

public class ManejoDeListas {

    /*Esta clase se enfoca unicamente en las listas declaradas en la 
    ventana Principal FrmPrincipal*/
    /**
     * Método para ordenar la lista de binomios
     */
    public static void ordenarListaDeBinomios() {
        Collections.sort(FrmPrincipal.listaBinomios);
    }

    /**
     * Método para ordenar la lista de votantes
     */
    public static void ordenarListaDeVotantes() {
        Collections.sort(FrmPrincipal.listaVotantes);
    }

    /**
     * Método para ordenar la lista de administradores
     */
    public static void ordenarListaDeAdministradores() {
        Collections.sort(FrmPrincipal.listaAdministradores);
    }
    
    /**
     * Método para obtener una lista ordenada a partir de una lista desordenada
     * @return lista de binomios ordenada
     */
    public static ArrayList<Binomio> obtenerListaBinomiosOrdenadaPorVotos() {
        ArrayList<Binomio> listaBinomios = new ArrayList<>();
        OrdenarBinomiosPorNumeroVotos o = new OrdenarBinomiosPorNumeroVotos();

        listaBinomios.addAll(FrmPrincipal.listaBinomios);

        Collections.sort(listaBinomios, o);
        return listaBinomios;
    }

    /**
     * Método para buscar un binomio por el nombre del movimiento
     * @param nombreDeLista nombre del movimiento a buscar
     * @return posición dento de la lista de binomios, del binomio buscado
     */
    public static int buscarEnListaDeBinomios(String nombreDeLista) {
        boolean existeNombreDeMovimiento;
        int posicionBinomio = -1;
        for (int i = 0; i < FrmPrincipal.listaBinomios.size(); i++) {
            existeNombreDeMovimiento = FrmPrincipal.listaBinomios.get(i).getMovimientoPolitico().getNombre().equals(nombreDeLista);
            if (existeNombreDeMovimiento) {
                posicionBinomio = i;
                break;
            }
        }
        return posicionBinomio;
    }
    
    /**
     * Método para buscar un binomio por el número del movimiento
     * @param numeroDeLista número del movimiento a buscar
     * @return posición dento de la lista de binomios, del binomio buscado
     */
    public static int buscarEnListaDeBinomios(int numeroDeLista) {
        boolean existeNumeroDeLista;
        int posicionBinomio = -1;
        for (int i = 0; i < FrmPrincipal.listaBinomios.size(); i++) {
            existeNumeroDeLista = FrmPrincipal.listaBinomios.get(i).getMovimientoPolitico().getNumeroDeLista() == numeroDeLista;
            if ( existeNumeroDeLista) {
                posicionBinomio = i;
                break;
            }
        }
        return posicionBinomio;
    }

    /**
     * Método para buscar un votante dentro de la lista mediante el número de
     * cédula
     * @param numeroCedula número de cédula del votante a buscar
     * @return posición del votante buscado dentro de la lista
     */
    public static int buscarEnListaDeVotantes(String numeroCedula) {
        boolean votanteEncontrado;
        int posicionVotante = -1;
        for (int i = 0; i < FrmPrincipal.listaVotantes.size(); i++) {
            votanteEncontrado = FrmPrincipal.listaVotantes.get(i).getNumeroCedula().equals(numeroCedula);
            if (votanteEncontrado) {
                posicionVotante = i;
                break;
            }
        }
        return posicionVotante;
    }

    /**
     * Método para buscar un administrador dentro de la lista mediante el nombre
     * de usuario
     * @param nombreDeUsuario nombre de usuario del administrador a buscar
     * @return posición del administrador buscado dentro de la lista de administradores
     */
    public static int buscarEnListaDeAdministradores(String nombreDeUsuario) {
        boolean adminEncontrado;
        int posicionAdmin = -1;
        for (int i = 0; i < FrmPrincipal.listaAdministradores.size(); i++) {
            adminEncontrado = FrmPrincipal.listaAdministradores.get(i).getUsuario().equals(nombreDeUsuario);
            if (adminEncontrado) {
                posicionAdmin = i;
                break;
            }
        }
        return posicionAdmin;
    }
}
