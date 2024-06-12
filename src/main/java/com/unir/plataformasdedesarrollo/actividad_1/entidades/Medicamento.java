/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unir.plataformasdedesarrollo.actividad_1.entidades;

/**
 *
 * @author julia
 */
public class Medicamento {
    
    private String nombre;
    private String tipo;
    
    public Medicamento(String nombre, String tipo){
        this.nombre=nombre;
        this.tipo = tipo;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    
}
