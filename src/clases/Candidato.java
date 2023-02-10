/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author stive
 */
public class Candidato extends Persona{
    
    private String cargoPublicoPostulado;
    private MovimientoPolitico movimientoPolitico;

    public Candidato(String cargoPublicoPostulado,
            MovimientoPolitico movimientoPolitico, String nombres, 
            String apellidos) {
        super(nombres, apellidos);
        this.cargoPublicoPostulado = cargoPublicoPostulado;
        this.movimientoPolitico = movimientoPolitico;
    }

    public String getCargoPublicoPostulado() {
        return cargoPublicoPostulado;
    }

    public void setCargoPublicoPostulado(String cargoPublicoPostulado) {
        this.cargoPublicoPostulado = cargoPublicoPostulado;
    }

    public MovimientoPolitico getMovimientoPolitico() {
        return movimientoPolitico;
    }

    public void setMovimientoPolitico(MovimientoPolitico movimientoPolitico) {
        this.movimientoPolitico = movimientoPolitico;
    }
    
}
