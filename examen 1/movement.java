/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso2;

/**
 *
 * @author Byron
 */
public class movement {
    private String descripcion;
    private friends[] participantes;
    private friends quienPago;
    private double montoTotal;
    private String moneda;

    public movement(String descripcion, friends[] participantes, friends quienPago, int montoTotal, String moneda) {
        this.descripcion = descripcion;
        this.participantes = participantes;
        this.quienPago = quienPago;
        this.montoTotal = montoTotal;
        this.moneda = moneda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public friends[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(friends[] participantes) {
        this.participantes = participantes;
    }

    public friends getQuienPago() {
        return quienPago;
    }

    public void setQuienPago(friends quienPago) {
        this.quienPago = quienPago;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
}

    