package com.cjimenezro.pccomponentes;

/**
 * Clase Procesador
 */

public class Procesador {
    /**
     * Atributos, propiedades, variables
     */
    private Integer id;
    private String marca;
    protected String fabricante;
    /**
     * Metodos, funciones, comportamientos
     */
    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }
    public String getMarca(){

        return marca;
    }
    public void setMarca(String marca){

        this.marca = marca;
    }
    public String getFabricante(){

        return fabricante;
    }
    public void setFabricante(String fabricante){

        this.fabricante = fabricante;
    }
}
