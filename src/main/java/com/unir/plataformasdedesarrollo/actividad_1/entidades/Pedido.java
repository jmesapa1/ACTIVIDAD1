/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unir.plataformasdedesarrollo.actividad_1.entidades;

import com.unir.plataformasdedesarrollo.actividad_1.entidades.Sucursal;

/**
 *
 * @author julia
 */
public class Pedido {
    
    private Medicamento medicamento;
    private int cantidad;
    private String proovedor;
    private Sucursal sucursal;
    
    public Pedido(Medicamento medicamento, int cantidad, String proovedor, Sucursal sucursal){
        this.medicamento = medicamento;
        this.cantidad = cantidad;
        this.proovedor = proovedor;
        this.sucursal= sucursal;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProovedor() {
        return proovedor;
    }

    public void setProovedor(String proovedor) {
        this.proovedor = proovedor;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    
    
    
}
