package herramientas;

public class Validador {

    public static boolean esNombreCorrecto(String nombre) {
        return nombre.matches("^[A-Z][a-z]+$");
    }

    public static boolean esApellidoCorrecto(String apellido) {
        return apellido.matches("^[A-Z][a-z]+$");
    }

    //Este metodo es unicamente necesario para el metodo de validacion de cedula
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
    
    public static boolean esNumeroDeCedulaCorrecto (String cedula) {
        boolean retorno;
        
        if (cedula.matches("^(0[1-9]|1\\d|2[0-4]|30)\\d{7}[0-9]$") &&
                validarUltimoDigitoCedula(cedula)) {
            retorno = true;
        } else {
            retorno = false;
        }
        
        return retorno;
    }
    
    public static boolean esNombreUsuarioCorrecto (String usuario) {
        /*Se valida unicamente nombres de usuario con mas de 3 digitos y 
        con menos de 20, puede tener Mayusculas, Minusculas, numeros y guiones*/
        return usuario.matches("^[a-zA-Z0-9_-]{3,20}$");
    }
    
    public static boolean esContrasenaCorrecta (String contrasena) {
        /*Se valida contraseñas con almenos 8 digitos, debería tener por lo
        menos una mayuscula, una minuscula y un numero, para estas condiciones
        se usa un lookahead*/
        return contrasena.matches(
                "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d]{8,}$");
    }
    
    public static boolean esNumeroNaturalCorrecto (String numero) {
        return numero.matches("^[0-9]+$ ");
    }

}
