package com.cjimenezro.pccomponentes;

public class TarjetaSonido {
    private Integer id;

    private String marca;

    private String modelo;

    private String conexion;

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

    public String getConexion(){
        return conexion;
    }
    public void setConexion(String conexion){
        this.conexion = conexion;
    }
}
