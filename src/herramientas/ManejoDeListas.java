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

    public static Binomio buscarEnListaDeBinomios(String nombreDeLista) {
        boolean listaEncontrada;
        int posicionBinomio = -1;
        for (int i = 0; i < FrmPrincipal.listaBinomios.size(); i++) {
            listaEncontrada = FrmPrincipal.listaBinomios.get(i).getMovimientoPolitico().getNombre().equals(nombreDeLista);
            if (listaEncontrada) {
                posicionBinomio = i;
                break;
            }
        }
        return FrmPrincipal.listaBinomios.get(posicionBinomio);
    }

    public static Votante buscarEnListaDeVotantes(String numeroCedula) {
        boolean votanteEncontrado;
        int posicionVotante = -1;
        for (int i = 0; i < FrmPrincipal.listaVotantes.size(); i++) {
            votanteEncontrado = FrmPrincipal.listaVotantes.get(i).getNumeroCedula().equals(numeroCedula);
            if (votanteEncontrado) {
                posicionVotante = i;
                break;
            }
        }
        return FrmPrincipal.listaVotantes.get(posicionVotante);
    }

    public static Administrador buscarEnListaDeAdministradores(String nombreDeUsuario) {
        boolean adminEncontrado;
        int posicionAdmin = -1;
        for (int i = 0; i < FrmPrincipal.listaAdministradores.size(); i++) {
            adminEncontrado = FrmPrincipal.listaAdministradores.get(i).getUsuario().equals(nombreDeUsuario);
            if (adminEncontrado) {
                posicionAdmin = i;
                break;
            }
        }
        return FrmPrincipal.listaAdministradores.get(posicionAdmin);
    }
}
