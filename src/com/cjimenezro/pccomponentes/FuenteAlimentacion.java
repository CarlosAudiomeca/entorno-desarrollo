package com.cjimenezro.pccomponentes;

public class FuenteAlimentacion {
    private Integer id;

    private String marca;

    private String modelo;

    private String voltaje;

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

    public String getVoltaje(){
        return voltaje;
    }
    public void setVoltaje(String voltaje){
        this.voltaje = voltaje;
    }
}
