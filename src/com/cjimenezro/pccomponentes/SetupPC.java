package com.cjimenezro.pccomponentes;

public class SetupPC {
    private Integer id;

    private Procesador procesador;

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }

    public Procesador getProcesador(){
        return procesador;
    }
    public void setProcesador(Procesador procesador){
        this.procesador = procesador;
    }

}