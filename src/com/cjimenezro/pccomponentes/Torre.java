package com.cjimenezro.pccomponentes;

public class Torre {

    private Integer id;

    private String marca;

    private String modelo;

    private String conexiones;

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

    public String getConexiones(){
        return conexiones;
    }
    public void setConexiones(String conexiones){
        this.conexiones = conexiones;
    }
}
