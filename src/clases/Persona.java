package clases;

public class Persona {
    protected String nombres;
    protected String apellidos;
    protected int [] fechaNacimiento; // dia, mes, año
    protected String numeroCedula;
    protected String ciudad;

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

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
