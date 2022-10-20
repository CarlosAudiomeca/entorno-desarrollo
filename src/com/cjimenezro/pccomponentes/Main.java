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
        amd.setMarca("Ryzen 6400");
        amd.setFabricante("AMD");

        System.out.println(amd.getMarca());
        System.out.println(amd.getFabricante());

        PlacaBase asus = new PlacaBase();

        asus.setId(1);
        asus.setMarca("Asus");
        asus.setModelo("Tuf Gaming B450 Plus ");
        asus.setChipset("B450");

        System.out.println(asus.getId());
        System.out.println(asus.getMarca());
        System.out.println(asus.getModelo());
        System.out.println(asus.getChipset());

        RAM corsair = new RAM();

        corsair.setId(1);
        corsair.setMarca("Corsair");
        corsair.setModelo("Vengance RGB");
        corsair.setVelocidad("3200 MHz");

        System.out.println(corsair.getId());
        System.out.println(corsair.getMarca());
        System.out.println(corsair.getModelo());
        System.out.println(corsair.getVelocidad());

        Torre nfortec = new Torre();

        nfortec.setId(1);
        nfortec.setMarca("Nfortec");
        nfortec.setModelo("Draco V2");
        nfortec.setConexiones("3 puertos USB 3.0, 2 puertos USB 2.0, 1 DysplayPort");

        System.out.println(nfortec.getId());
        System.out.println(nfortec.getMarca());
        System.out.println(nfortec.getModelo());
        System.out.println(nfortec.getConexiones());

        Ventilador cooler = new Ventilador();

        cooler.setId(1);
        cooler.setMarca("Cooler Master");
        cooler.setModelo("Hyper 212");
        cooler.setTipo("Por aire");

        System.out.println(cooler.getId());
        System.out.println(cooler.getMarca());
        System.out.println(cooler.getModelo());
        System.out.println(cooler.getTipo());

        Disco kingston = new Disco();

        kingston.setId(1);
        kingston.setMarca("Kingston");
        kingston.setModelo("A400");
        kingston.setCapacidad("240 GB");

        System.out.println(kingston.getId());
        System.out.println(kingston.getMarca());
        System.out.println(kingston.getModelo());
        System.out.println(kingston.getCapacidad());

        SetupPC setupPC = new SetupPC();

        setupPC.setId(1);
        setupPC.setProcesador(amd);

        System.out.println(setupPC.getId());
        System.out.println(setupPC.getProcesador().getMarca());

    }



}
