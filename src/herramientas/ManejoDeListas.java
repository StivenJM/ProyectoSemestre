package herramientas;

import clases.*;
import clases.MovimientoPolitico;
import java.util.ArrayList;
import java.util.Collections;
import ventanas.FrmPrincipal;

public class ManejoDeListas {

    /*Esta clase se enfoca unicamente en las listas declaradas en la 
    ventana Principal FrmPrincipal*/
    public static void ordenarListaDeBinomios() {
        Collections.sort(FrmPrincipal.listaBinomios);
    }

    public static void ordenarListaDeVotantes() {
        Collections.sort(FrmPrincipal.listaVotantes);
    }

    public static void ordenarListaDeAdministradores() {
        Collections.sort(FrmPrincipal.listaAdministradores);
    }

    public static ArrayList<Binomio> obtenerListaBinomiosOrdenadaPorVotos() {
        ArrayList<Binomio> listaBinomios = new ArrayList<>();
        OrdenarBinomiosPorNumeroVotos o = new OrdenarBinomiosPorNumeroVotos();

        listaBinomios.addAll(FrmPrincipal.listaBinomios);

        Collections.sort(listaBinomios, o);
        return listaBinomios;
    }

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

    
    /*El metodo retorna -1 cuando no encuentra coincidencias y retorna otro valor
    positivi cuando si lo encuentra, este valor corresponde con la posicion de 
    la lista*/
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
