package com.cjimenezro.pccomponentes;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import javax.swing.*;

public class RAM {

    private Integer id;

    private String marca;

    private String modelo;

    private String velocidad;

    /**
     * Funciones
     */

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getVelocidad(){
        return velocidad;
    }
    public void setVelocidad(String velocidad){
        this.velocidad=velocidad;
    }



}
