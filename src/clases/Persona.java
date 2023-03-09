package clases;

import java.io.Serializable;

public class Persona implements Serializable, Comparable<Persona> {
    
    private static final long serialVersionUID = 1L;
    protected String nombres;
    protected String apellidos;
    protected String fechaNacimiento; // dia, mes, año
    protected String numeroCedula;
    protected String provincia;

    /**
     * Constructor para crear una persona
     * @param nombres nombres de la persona
     * @param apellidos apellidos de la persona
     * @param fechaNacimiento fecha de nacimiento de la persona
     * @param numeroCedula cedula de la persona
     */
    public Persona(String nombres, String apellidos, String fechaNacimiento, String numeroCedula) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroCedula = numeroCedula;
    }
    
    /**
     * Constructor para crear una persona con menos parámetros
     * @param nombres nombres de la persona
     * @param apellidos apellidos de la persona
     */
    public Persona(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Persona() {
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }
    
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroCedula() {
        return numeroCedula;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public int compareTo(Persona o) {
        return (this.apellidos + this.nombres).compareTo(o.apellidos + o.nombres);
    }
    
}
