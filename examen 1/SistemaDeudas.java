/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1;

import java.util.Date;

/**
 *
 * @author Rodrigo Rodriguez
 */
import javax.swing.JOptionPane;

public class SistemaDeudas {
    public static void main(String[] args) {
        
        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        String cedulaCliente = JOptionPane.showInputDialog("Ingrese la cédula del cliente:");

       
        Cliente cliente = new Cliente(nombreCliente, cedulaCliente);

        String codigoFactura1 = JOptionPane.showInputDialog("Ingrese el código de la factura 1:");
        double montoFactura1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la factura 1:"));
        int mesFactura1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de la factura 1:"));
        int anioFactura1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de la factura 1:"));

        String codigoFactura2 = JOptionPane.showInputDialog("Ingrese el código de la factura 2:");
        double montoFactura2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la factura 2:"));
        int mesFactura2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de la factura 2:"));
        int anioFactura2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de la factura 2:"));

        
        Factura factura1 = new Factura(nombreCliente, cedulaCliente, codigoFactura1, montoFactura1, mesFactura1, anioFactura1, 2);
        Factura factura2 = new Factura(nombreCliente, cedulaCliente, codigoFactura2, montoFactura2, mesFactura2, anioFactura2, 2);

        
        cliente.setMontoTotalPagado(0);
        cliente.setMontoTotalPagado(cliente.getMontoTotalPagado() + factura1.getMonto() + factura2.getMonto());

    
        double montoTotalDeudor = cliente.getMontoTotalPagado();

        
        mostrarInformacion(cliente, factura1, factura2, montoTotalDeudor);
    }

    public static void mostrarInformacion(Cliente cliente, Factura factura1, Factura factura2, double montoTotalDeudor) {
       
        StringBuilder info = new StringBuilder();
        info.append(cliente).append("\n\nFacturas:\n").append(factura1).append("\n").append(factura2);

     
        double interes = montoTotalDeudor * 0.15;
        double montoCuota = (interes + montoTotalDeudor) / 4;

        info.append("\n\nPlan de Cuotas:\n");
        for (int i = 1; i <= 4; i++) {
            info.append("Cuota ").append(i).append(": $").append(montoCuota).append(" - Fecha de Pago: marzo 2024\n");
        }

      
        info.append("\nMonto Total Pagado: $").append(cliente.getMontoTotalPagado());

        JOptionPane.showMessageDialog(null, info.toString(), "Información de Deudas", JOptionPane.INFORMATION_MESSAGE);
    }
}


