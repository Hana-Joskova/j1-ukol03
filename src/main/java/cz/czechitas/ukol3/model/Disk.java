package cz.czechitas.ukol3.model;

// promenne jsou v bajtech
public class Disk {
    private long kapacita;
    private long vyuziteMisto;


    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }

    public String toString() {
        return "Kapacita disku je: " + kapacita + " bajtu, vyuzite misto je: " + vyuziteMisto + " bajtu. \n";
    }

}


