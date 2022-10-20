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

        FuenteAlimentacion corsairFuente = new FuenteAlimentacion();

        corsairFuente.setId(1);
        corsairFuente.setMarca("Corsair");
        corsairFuente.setModelo("RM750 80 Plus Gold ");
        corsairFuente.setVoltaje("100-240 V");

        System.out.println(corsairFuente.getId());
        System.out.println(corsairFuente.getMarca());
        System.out.println(corsairFuente.getModelo());
        System.out.println(corsairFuente.getVoltaje());

        TarjetaGrafica nvidiaRtx3060Ti = new TarjetaGrafica();

        nvidiaRtx3060Ti.setId(1);
        nvidiaRtx3060Ti.setMarca("Nvidia");
        nvidiaRtx3060Ti.setModelo("RTX 3060 Ti ");
        nvidiaRtx3060Ti.setVram("8 GB");

        System.out.println(nvidiaRtx3060Ti.getId());
        System.out.println(nvidiaRtx3060Ti.getMarca());
        System.out.println(nvidiaRtx3060Ti.getModelo());
        System.out.println(nvidiaRtx3060Ti.getVram());

        TarjetaSonido creativeSound = new TarjetaSonido();

        creativeSound.setId(1);
        creativeSound.setMarca("Creative Sound");
        creativeSound.setModelo("Blaster Audigy ");
        creativeSound.setConexion("PCI Express");

        System.out.println(creativeSound.getId());
        System.out.println(creativeSound.getMarca());
        System.out.println(creativeSound.getModelo());
        System.out.println(creativeSound.getConexion());

        DVD lg = new DVD();

        lg.setId(1);
        lg.setMarca("LG");
        lg.setModelo("Grabadora Ultra Slim Externa ");
        lg.setVelocidad("24x");

        System.out.println(lg.getId());
        System.out.println(lg.getMarca());
        System.out.println(lg.getModelo());
        System.out.println(lg.getVelocidad());

        Monitor msi = new Monitor();

        msi.setId(1);
        msi.setMarca("MSI");
        msi.setModelo("Optix g24c4 ");
        msi.setResolucion("1920 x 1080");

        System.out.println(msi.getId());
        System.out.println(msi.getMarca());
        System.out.println(msi.getModelo());
        System.out.println(msi.getResolucion());

        Teclado aukey = new Teclado();

        aukey.setId(1);
        aukey.setMarca("Aukey");
        aukey.setModelo("KM-G14 ");
        aukey.setTipo("Mecanico");

        System.out.println(aukey.getId());
        System.out.println(aukey.getMarca());
        System.out.println(aukey.getModelo());
        System.out.println(aukey.getTipo());

        Raton logitech = new Raton();

        logitech.setId(1);
        logitech.setMarca("Logitech");
        logitech.setModelo("G403 Hero ");
        logitech.setDpi("25600 dpi");

        System.out.println(logitech.getId());
        System.out.println(logitech.getMarca());
        System.out.println(logitech.getModelo());
        System.out.println(logitech.getDpi());

        Altavoces tempest = new Altavoces();

        tempest.setId(1);
        tempest.setMarca("Tempest");
        tempest.setModelo("M10 Hero 2.0 ");
        tempest.setConectividad("USB");

        System.out.println(tempest.getId());
        System.out.println(tempest.getMarca());
        System.out.println(tempest.getModelo());
        System.out.println(tempest.getConectividad());

        /**
        SetupPC setupPC = new SetupPC();

        setupPC.setId(1);
        setupPC.setProcesador(amd);
        setupPC.setPlacaBase(asus);
        setupPC.setRam(corsair);
        setupPC.setTorre(nfortec);
        setupPC.setVentilador(cooler);
        setupPC.setDisco(kingston);
        setupPC.setFuenteAlimentacion(corsairFuente);
        setupPC.setTarjetaGrafica(nvidiaRtx3060Ti);
        setupPC.setTarjetaSonido(creativeSound);
        setupPC.setDvd(lg);
        setupPC.setMonitor(msi);
        setupPC.setTeclado(aukey);
        setupPC.setRaton(logitech);
        setupPC.setAltavoces(tempest);

        System.out.println(setupPC.getId());
        System.out.println(setupPC.getProcesador().getMarca());
        System.out.println(setupPC.getPlacaBase().getMarca());
        System.out.println(setupPC.getRam().getMarca());
        System.out.println(setupPC.getTorre().getMarca());
        System.out.println(setupPC.getVentilador().getMarca());
        System.out.println(setupPC.getDisco().getMarca());
        System.out.println(setupPC.getFuenteAlimentacion().getMarca());
        System.out.println(setupPC.getTarjetaGrafica().getMarca());
        System.out.println(setupPC.getTarjetaSonido().getMarca());
        System.out.println(setupPC.getDvd().getMarca());
        System.out.println(setupPC.getMonitor().getMarca());
        System.out.println(setupPC.getTeclado().getMarca());
        System.out.println(setupPC.getRaton().getMarca());
        System.out.println(setupPC.getAltavoces().getMarca());
        **/
    }
}
