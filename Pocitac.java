package cz.czechitas.ukol3.model;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    public String toString() {
        return "" + cpu + ram + pevnyDisk + "";
    }

    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (cpu != null && ram != null && pevnyDisk != null) {
            System.err.println("Pocitac nelze zapnout. \n");
        }
        if (!jeZapnuty) {
            System.out.println("Pocitac se zapnul. \n");
            jeZapnuty = true;
        } else {
            System.err.println("Pocitac je jiz zapnuty. \n");
        }
    }

    public void vypniSe() {
        if (jeZapnuty) {
            System.out.println("Pocitac se vypnul. \n");
            jeZapnuty = false;
        }
    }

    public void vytvorSouborOVelikosti(long velikost) {
        if (jeZapnuty) {
            var noveMisto = pevnyDisk.getVyuziteMisto() + velikost;
            if (noveMisto > pevnyDisk.getKapacita()) {
                System.err.println("Soubor prekrocil kapacitu disku.");
            } else pevnyDisk.setVyuziteMisto(noveMisto);
        } else {
            System.err.println("Pocitac je vypnuty.");
        }
    }

    public void vymazSouboryOVelikosti(long velikost) {
        if (jeZapnuty) {
            var noveMisto = pevnyDisk.getVyuziteMisto() - velikost;
            if (noveMisto < 0) {
                System.err.println("Nelze smazat soubor.");
            } else pevnyDisk.setVyuziteMisto(noveMisto);
        } else {
            System.err.println("Pocitac je vypnuty.");
        }
    }
}



