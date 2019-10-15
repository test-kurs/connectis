package interfejsy;

import interfejsy.enumy.GATUNEK_ZWIERZĘCIA;
import interfejsy.enumy.RODZAJ_SIERŚCI;
import interfejsy.enumy.SPOSÓB_ŻYWIENIA;

public class Słoń implements Zwierzę {

    double cena;
    String nazwa;
    double wiek;
    boolean czyŻyje;

    public Słoń(double cena, String nazwa, double wiek, boolean czyŻyje) {
        this.cena = cena;
        this.nazwa = nazwa;
        this.wiek = wiek;
        this.czyŻyje = czyŻyje;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getWiek() {
        return wiek;
    }

    public void setWiek(double wiek) {
        this.wiek = wiek;
    }

    @Override
    public double cena() {
        return cena;
    }

    @Override
    public SPOSÓB_ŻYWIENIA sposóbŻywienia() {
        return SPOSÓB_ŻYWIENIA.ROŚLINOŻERNE;
    }

    @Override
    public GATUNEK_ZWIERZĘCIA gatunekZwierzęcia() {
        return GATUNEK_ZWIERZĘCIA.SSAK;
    }

    @Override
    public String nazwa() {
        return nazwa;
    }

    @Override
    public boolean jestJadowity() {
        return false;
    }

    @Override
    public int skalaJadowitości() {
        return 0;
    }

    @Override
    public double wiek() {
        return wiek;
    }

    @Override
    public boolean czyŻyje() {
        return czyŻyje;
    }

    @Override
    public int ilośćNóg() {
        return 4;
    }

    @Override
    public boolean posiadaFutro() {
        return false;
    }

    @Override
    public String toString() {
        return "Słoń{" +
                "nazwa='" + nazwa + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    @Override
    public RODZAJ_SIERŚCI rodzajSierści() {
        return RODZAJ_SIERŚCI.SKÓRA;
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }
        Zwierzę zwierzę = (Zwierzę) o;

        return this.nazwa.compareTo(zwierzę.nazwa());
    }
}
