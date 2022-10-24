package com.cjimenezro.pccomponentes;

import java.util.ArrayList;
import java.util.List;

public class SetupPC {
    private Integer id;

    private Procesador procesador;

    private PlacaBase placaBase;

    private List <RAM> ram = new ArrayList<>();

    private Torre torre;

    private Ventilador ventilador;

    private Disco disco;

    private FuenteAlimentacion fuenteAlimentacion;

    private  TarjetaGrafica tarjetaGrafica;

    private TarjetaSonido tarjetaSonido;

    private DVD dvd;

    private Monitor monitor;

    private Teclado teclado;

    private Raton raton;

    private  Altavoces altavoces;

    /**
     * Funciones
     */

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

    public PlacaBase getPlacaBase (){
        return placaBase;
    }
    public void setPlacaBase(PlacaBase placaBase){
        this.placaBase = placaBase;
    }

    public void addRAM(RAM ram){
        this.ram.add(ram);
    }
    public List<RAM> getRam(){
        return this.ram;
    }

    public Torre getTorre(){
        return torre;
    }
    public void setTorre(Torre torre){
        this.torre = torre;
    }

    public Ventilador getVentilador() {
        return ventilador;
    }
    public void setVentilador (Ventilador ventilador){
        this.ventilador= ventilador;
    }

    public Disco getDisco (){
        return disco;
    }
    public void setDisco(Disco disco){
        this.disco = disco;
    }

    public FuenteAlimentacion getFuenteAlimentacion(){
        return fuenteAlimentacion;
    }
    public void setFuenteAlimentacion (FuenteAlimentacion fuenteAlimentacion){
        this.fuenteAlimentacion = fuenteAlimentacion;
    }

    public TarjetaGrafica getTarjetaGrafica(){
        return tarjetaGrafica;
    }
    public void setTarjetaGrafica(TarjetaGrafica tarjetaGrafica){
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public TarjetaSonido getTarjetaSonido() {
        return tarjetaSonido;
    }
    public void setTarjetaSonido(TarjetaSonido tarjetaSonido){
        this.tarjetaSonido = tarjetaSonido;
    }

    public DVD getDvd(){
        return dvd;
    }
    public void setDvd(DVD dvd){
        this.dvd=dvd;
    }

    public Monitor getMonitor() {
        return monitor;
    }
    public void setMonitor(Monitor monitor){
        this.monitor = monitor;
    }

    public Teclado getTeclado(){
        return teclado;
    }
    public void setTeclado(Teclado teclado){
        this.teclado=teclado;
    }

    public Raton getRaton (){
        return raton;
    }
    public void setRaton(Raton raton){
        this.raton = raton;
    }

    public Altavoces getAltavoces(){
        return altavoces;
    }
    public void setAltavoces(Altavoces altavoces){
        this.altavoces = altavoces;
    }
}
