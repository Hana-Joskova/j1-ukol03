package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        Pocitac mujPocitac;
        mujPocitac = new Pocitac();

        mujPocitac.zapniSe();
        Procesor mujProcesor = new Procesor();
        mujProcesor.setRychlost(2_100_000_000L);
        mujProcesor.setVyrobce("AMD");

        Pamet mojePamet = new Pamet();
        mojePamet.setKapacita(8_000_000_000L);

        Disk mujDisk = new Disk();
        mujDisk.setKapacita(510_770_802_688L);

        mujPocitac.setCpu(mujProcesor);
        mujPocitac.setRam(mojePamet);
        mujPocitac.setPevnyDisk(mujDisk);

        System.out.println(mujPocitac.toString());

        mujPocitac.zapniSe();
        mujPocitac.zapniSe();

        System.out.println(mujPocitac.toString());

        mujPocitac.vypniSe();
        mujPocitac.vypniSe();
        mujPocitac.vypniSe();

    }

}
