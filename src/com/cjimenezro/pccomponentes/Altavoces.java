package com.cjimenezro.pccomponentes;

public class Altavoces {
    private Integer id;

    private String marca;

    private String modelo;

    private String conectividad;

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

    public String getConectividad(){
        return conectividad;
    }
    public void setConectividad(String conectividad){
        this.conectividad = conectividad;
    }
}
