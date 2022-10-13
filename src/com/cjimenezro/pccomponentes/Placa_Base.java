package com.cjimenezro.pccomponentes;

public class Placa_Base {

    private Integer id;

    private String marca;

    private String modelo;

    private String chipset;

    /**
     *funciones
     */

    public Integer getId(){

        return  id;
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

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getChipset(){
        return chipset;
    }
    public void setChipset(String chipset){
        this.chipset = chipset;
    }
}
