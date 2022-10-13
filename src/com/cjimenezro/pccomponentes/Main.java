package com.cjimenezro.pccomponentes;

public class Main {

    public static void main(String[] args){
        System.out.println("Iniciando...");

        Procesador amd = new Procesador();
        /**
         * Codigo a ejecutar por un administrativo de la empresa
         * Codigo para introducir informacion de procesadores
         */

        amd.setId(1);
        amd.setMarca("Raizen 6400");
        amd.setFabricante("AMD");

        System.out.println(amd.getMarca());
        System.out.println(amd.getFabricante());

        Procesador pentium = new Procesador();
        pentium.setId(2);
        pentium.setMarca("i7");
        pentium.setFabricante("Intel");

        System.out.println(pentium.getMarca());
        System.out.println(pentium.getFabricante());

    }



}
