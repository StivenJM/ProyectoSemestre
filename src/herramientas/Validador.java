package herramientas;

public class Validador {

    /**
     * Método para comprobar si los nombres están correctamente ingresados
     *
     * @param nombre cadena de texto a validar
     * @return
     */
    public static boolean esNombreCorrecto(String nombre) {
        return nombre.matches("^[A-Z][a-z]+\\ [A-Z][a-z]+$");
    }

    /**
     * Método para comprobar si los apellidos están correctamente ingresados
     *
     * @param apellido cadena de texto a validar
     * @return
     */
    public static boolean esApellidoCorrecto(String apellido) {
        return apellido.matches("^[A-Z][a-z]+\\ [A-Z][a-z]+$");
    }

    /**
     * Método para validar el número de cédula según el algoritmo del dígito
     * verificador
     *
     * @param cedula cadena de caracteres a validar
     * @return
     */
    private static boolean validarUltimoDigitoCedula(String cedula) {

        // algoritmo de validación módulo 10
        int suma = 0;
        int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};
        int ultimoDigito = Integer.parseInt(cedula.substring(9));
        for (int i = 0; i < 9; i++) {
            int digito = Integer.parseInt(cedula.substring(i, i + 1));
            int producto = digito * coeficientes[i];
            suma += (producto >= 10) ? producto - 9 : producto;
        }
        int digitoVerificador = 10 - (suma % 10);
        if (digitoVerificador == 10) {
            digitoVerificador = 0;
        }

        return (digitoVerificador == ultimoDigito);
    }

    /**
     * Validar número de cédula por completo
     *
     * @param cedula cadena de caracteres a evaluar
     * @return true si es una cédula correcta
     */
    public static boolean esNumeroDeCedulaCorrecto(String cedula) {
        boolean retorno;

        retorno = cedula.matches("^(0[1-9]|1\\d|2[0-4]|30)\\d{7}[0-9]$")
                && validarUltimoDigitoCedula(cedula);

        return retorno;
    }

    /**
     * Método para comprobar si un nombre de usuario de administrador es válido
     * El nombre de usuario puede tener entre 3 a 20 caracteres y puede contener
     * mayúsculas, minúsculas, números y guiones
     *
     * @param usuario cadena de caracteres a validar
     * @return true si es correcto el nombre de usuario
     */
    public static boolean esNombreUsuarioCorrecto(String usuario) {
        return usuario.matches("^[a-zA-Z0-9_-]{3,20}$");
    }

    /**
     * Método para validar una contraseña de administrador Solo se aceptan
     * contraseñas con mínimo 8 caracteres que contenga por lo menos una
     * mayúscula, una minúscula y un número
     *
     * @param contrasena
     * @return
     */
    public static boolean esContrasenaCorrecta(String contrasena) {
        return contrasena.matches(
                "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d]{8,}$");
    }

    /**
     * Método para determinar si una cadena de caracteres es un número natural
     * @param numero cadena a validar
     * @return true si es un número natural
     */
    public static boolean esNumeroNaturalCorrecto(String numero) {
        return numero.matches("[0-9]+");
    }

    /**
     * Método para determinar si la ruta de una imagen es correcta
     * @param ruta la cadena de caracteres a evaluar
     * @return
     */
    public static boolean esRutaDeArchivoImagenCorrecto(String ruta) {
        return ruta.matches("^.+\\.(png|jpe?g)$");
    }

}
