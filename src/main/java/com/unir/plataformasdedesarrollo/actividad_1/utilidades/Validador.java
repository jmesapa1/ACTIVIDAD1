/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unir.plataformasdedesarrollo.actividad_1.utilidades;

import java.util.regex.Pattern;

/**
 *
 * @author julia
 */
public class Validador {
    
    public Validador(){   
    }
    
    public String validarPedido(String nombre,String cantidad,String tipo,String sucursal,String provedor){
        if(nombre.isBlank()){
            return "Existe un error en el campo Nombre, debe ingresar un valor";
        }else if(!Pattern.matches("^[a-zA-Z]*[0-9]*$", nombre)){
            return "Existe un error en el campo NOMBRE, no se permiten caracteres especiales";
        }
        if(cantidad.isBlank()){
            return "Existe un error en el campo CANTIDAD, debe ingresar un valor";
        }else if(!Pattern.matches("^[0-9]*$", cantidad)){
            return "Existe un error en el campo CANTIDAD, debe ser mayor a 0 y solo contener numeros";
        }
        if(tipo.isBlank()){
            return "Debe elegir un valor de TIPO";
        }
        if(sucursal.isBlank()){
            return "Debe elegir un valor de SUCURSAL";
        }
        if(provedor.isBlank()){
            return "Debe elegir un valor de PROVEDOR";
        }
        return "";
    }
    
    
    
    
}
