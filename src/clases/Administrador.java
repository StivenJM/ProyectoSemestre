package clases;

public class Administrador extends Persona{
    
    private String usuario;
    private String contrasenia;

    public Administrador(String usuario, String contrasenia, String nombres,
            String apellidos) {
        super(nombres, apellidos);
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }
    
    /* Este constructor se establece ùnicamente para el Administrador por 
    Defecto de la clase FrmPrincipal*/
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
