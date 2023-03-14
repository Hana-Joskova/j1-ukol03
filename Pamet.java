package cz.czechitas.ukol3.model;
//v bajtech
public class Pamet {
    private long kapacita;

    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public String toString() {
        return "Kapacita pameti je: " + kapacita + " bajtu. \n";
    }

}
