/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.util.ArrayList;
/**
 *
 * @author utku29
 */
public class Pedido {
    
    private final ArrayList<DetallePedido> detalles;
    private String nombreCliente;
    private int numero;
    private String fechaHoraCreacion;
    private String fechaHoraEntrega;
    private Factura factura;
    private EstadoPedido estadoPedido;
    private DetallePedido detallePedido;

    public Pedido(String nombreCliente, int numero, String fechaHoraCreacion, String fechaHoraEntrega, Factura factura, EstadoPedido estadoPedido, DetallePedido detallePedido) {
        this.nombreCliente = nombreCliente;
        this.numero = numero;
        this.fechaHoraCreacion = fechaHoraCreacion;
        this.fechaHoraEntrega = fechaHoraEntrega;
        this.factura = factura;
        this.estadoPedido = estadoPedido;
        this.detallePedido = detallePedido;
        this.detalles = new ArrayList<>();
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    public void setFechaHoraCreacion(String fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }

    public String getFechaHoraEntrega() {
        return fechaHoraEntrega;
    }

    public void setFechaHoraEntrega(String fechaHoraEntrega) {
        this.fechaHoraEntrega = fechaHoraEntrega;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public EstadoPedido getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public DetallePedido getDetallePedido() {
        return detallePedido;
    }

    public void setDetallePedido(DetallePedido detallePedido) {
        this.detallePedido = detallePedido;
    }
    
    public void agregarDetalleDePedido(){
        
        detalles.add(detallePedido);
        
    }
    

    public float calcTotalPedido(){
        
        
        
        
        return 0;
    }
    
    public void cancelar(){
        
        this.detalles.clear();
        
    }
    
    public void confirmar(EstadoPedido estadodelpedido){
        
        this.estadoPedido = estadodelpedido;
        
    }
    public void facturar(){
        
        if(EstadoPedido.esFacturada()==true){
            
            new Factura();
            
        }
        
    }
    public void terminar(){
        
        
        
    }   
}
