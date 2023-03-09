package clases;

public class Administrador extends Persona{
    
    private String usuario;
    private String contrasenia;

    /**
     * Constructor con parámetros completos
     * @param usuario nombre de usuario del administrador que se va a registrar
     * @param contrasenia contraseña del administrador que se va a registrar
     * @param nombres nombres del administrador que se va a registrar
     * @param apellidos apellidos del administrador que se va a registrar
     */
    public Administrador(String usuario, String contrasenia, String nombres,
            String apellidos) {
        super(nombres, apellidos);
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    /**
     * Constructor para crear un administrador por defecto
     * @param usuario
     * @param contrasenia 
     */
    public Administrador(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
}
