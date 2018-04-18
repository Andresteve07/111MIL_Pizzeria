/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 * Esta clase modela el estsdo de un pedido
 * 
 * Los estados pasiblews se codifican de la siguiente manera
 * 0 - espendiente
 * 1 - enporroceso
 * 2 - cancela
 * @author facu-
 */
public class EstadoPedido {
    
    private String nombre;
    private byte codigo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getCodigo() {
        return codigo;
    }

    public void setCodigo(byte codigo) {
        this.codigo = codigo;
    }
    
    public static void esFacturada(){
        
    }
    
    public static void esPteFacturacion(){
        
    }

    @Override
    public String toString() {
        return "EstadoPedido{" + "nombre=" + nombre + ", codigo=" + codigo + '}';
    }
    
}
