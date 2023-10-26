/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1;

/**
 *
 * @author sebas
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        class Factura {
    String nombreCliente;
    String cedulaCliente;
    String numeroFactura;
    double montoFactura;
    int mesFactura;
    int anioFactura;
    int estadoFactura;

    public Factura(String nombreCliente, String cedulaCliente, String numeroFactura, double montoFactura, int mesFactura, int anioFactura, int estadoFactura) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.numeroFactura = numeroFactura;
        this.montoFactura = montoFactura;
        this.mesFactura = mesFactura;
        this.anioFactura = anioFactura;
        this.estadoFactura = estadoFactura;
    }
}
class Cliente {
    String nombreCliente;
    String cedulaCliente;
    double montoTotalPagado;
    int totalFacturas;
    }
}
}


        
    
    

