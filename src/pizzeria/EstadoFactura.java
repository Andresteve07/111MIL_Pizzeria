/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author facu-
 */
public class EstadoFactura {
    
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
    
    public static byte esGenerada(){
        return 0;
    }
    
    public static byte esPteFacturacion(){
        return 0;
    }

    @Override
    public String toString() {
        return "EstadoFactura{" + "nombre=" + nombre + ", codigo=" + codigo + '}';
    }
    
}
