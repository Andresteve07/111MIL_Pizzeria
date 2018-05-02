/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author: Agustin y Jose.
 */
public class Factura {
    /**
     * ATRIBUTOS
     */
    private Date fechaHoraEmision;
    private int numero;
    private EstadoFactura estado;
    private ArrayList<DetallePedido> pedidos;
    private float TotalAPagar;

    /**
     * CONSTRUCTORES
     */
    public Factura() {
        estado = new EstadoFactura();
    }

    public Factura(Date fechaHoraEmision, int numero) {
        this.fechaHoraEmision = fechaHoraEmision;
        this.numero = numero;
        estado = new EstadoFactura();
    }

    /**
     * METODOS GET 
     */
    public int getNumero() {
        return this.numero;
    }
 
    public Date getFechaHoraEmision() {
        return this.fechaHoraEmision;
    }

    public EstadoFactura getEstado() {
        return estado;
    }

    public ArrayList<DetallePedido> getPedidos() {
        return pedidos;
    }

    public float getTotalAPagar() {
        for (DetallePedido pedido : pedidos) {
            TotalAPagar += pedido.calcTotalItem();
        }
        return TotalAPagar;
    }
    
    public ArrayList<String> getDetalleFactura() {
        ArrayList<String> detallesDePedido = new ArrayList<>();
        for (DetallePedido detalle : pedidos) {
            detallesDePedido.add(detalle.toString());
        }
        return detallesDePedido;
    }
    
    /**
     * METODOS SET
     */
    public void setEstado(EstadoFactura estado) {
        this.estado= estado;
    }

    public void setFechaHoraEmision(Date fechaHoraEmision) {
        this.fechaHoraEmision = fechaHoraEmision;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setDetalle(ArrayList<DetallePedido> detallePedido) {
        for(DetallePedido pedido : detallePedido) {
            pedidos.add(pedido);
        }
    }

    public void setTotalAPagar(float TotalAPagar) {
        this.TotalAPagar = TotalAPagar;
    }
    
    /**
     * OTROS METODOS
     */
    public void imprimirDetalleFactura () {
        for (DetallePedido pedido : pedidos) {
            System.out.println(pedido.toString());
        }
    }
    
}
