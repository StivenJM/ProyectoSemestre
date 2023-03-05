package clases;

import java.io.Serializable;

public class Persona implements Serializable, Comparable<Persona> {
    
    private static final long serialVersionUID = 1L;
    protected String nombres;
    protected String apellidos;
    protected int [] fechaNacimiento; // dia, mes, año
    protected String numeroCedula;
    protected String provincia;

    public Persona(String nombres, String apellidos, int[] fechaNacimiento, String numeroCedula) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroCedula = numeroCedula;
    }
    
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

    public int[] getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int[] fechaNacimiento) {
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
