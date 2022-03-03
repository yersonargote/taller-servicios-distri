/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.distribuidos.core.models;

/**
 *
 * @author davinchi
 */
public class Hamburguesa {
    private TipoHamburguesa tipo;
    private Double precio;
    private Integer cantidadIgredientesExtra;
    private Integer id;
    private String nombre;

    public Hamburguesa(TipoHamburguesa tipo, Double precio, Integer cantidadIgredientesExtra, Integer id, String nombre) {
        this.tipo = tipo;
        this.precio = precio;
        this.cantidadIgredientesExtra = cantidadIgredientesExtra;
        this.id = id;
        this.nombre = nombre;
    }

    public TipoHamburguesa getTipo() {
        return tipo;
    }

    public void setTipo(TipoHamburguesa tipo) {
        this.tipo = tipo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidadIgredientesExtra() {
        return cantidadIgredientesExtra;
    }

    public void setCantidadIgredientesExtra(Integer cantidadIgredientesExtra) {
        this.cantidadIgredientesExtra = cantidadIgredientesExtra;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
