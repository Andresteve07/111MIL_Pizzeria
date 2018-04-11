/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author utku38
 */
public class Pizza extends Pizzeria {
    private String nombre;
    private float precio;
    private Pizza pizza;
    private TamanioPizza tamanio;
    private TipoPizza tipoPizza;
    private VariedadPizza variedad;

    public Pizza(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public Pizza getPizza() {
        return pizza;
    }
    
    public TamanioPizza getTamanioPizza() {
        return tamanio;
    }
    
    public TipoPizza getTipoPizza() {
        return tipoPizza;
    }
    
    public VariedadPizza getVariedad() {
        return variedad;
    }
}
