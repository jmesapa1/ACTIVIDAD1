/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unir.plataformasdedesarrollo.actividad_1.entidades;

/**
 *
 * @author julia
 */
public class Sucursal {
    
    private String nombre;
    private String direccion;
    
    public Sucursal(String nombre, String direccion){
        this.nombre=nombre;
        this.direccion = direccion;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public void setDireccion(String tipo){
        this.direccion = tipo;
    }
    
    
}
