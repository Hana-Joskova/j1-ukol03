package cz.czechitas.ukol3.model;
//rzchlost v Hz
public class Procesor {
    private String vyrobce;
    private long rychlost;

    public String getVyrobce() {
        return vyrobce;
    }

    public void setVyrobce(String vyrobce) {
        this.vyrobce = vyrobce;
    }

    public long getRychlost() {
        return rychlost;
    }

    public void setRychlost(long rychlost) {
        this.rychlost = rychlost;
    }

    public String toString() {
        return "Vyrobce procesoru je: " + vyrobce + ", rychlost procesoru je: " + rychlost + " Hz. \n";
    }
}


