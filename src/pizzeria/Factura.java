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


    /**
     * CONSTRUCTORES
     */
    public Factura() {
        estado = new EstadoFactura();
    }

    public Factura(Date fechaHoraEmision, int numero,EstadoFactura estado) {
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
    
}
