package interfejsy;

import interfejsy.enumy.GATUNEK_ZWIERZĘCIA;
import interfejsy.enumy.RODZAJ_SIERŚCI;
import interfejsy.enumy.SPOSÓB_ŻYWIENIA;

public class Wąż implements Zwierzę {

    double cena;
    String nazwa;
    double wiek;
    boolean czyŻyje;
    int skalaJadowitości;

    public int getSkalaJadowitości() {
        return skalaJadowitości;
    }

    public void setSkalaJadowitości(int skalaJadowitości) {
        this.skalaJadowitości = skalaJadowitości;
    }

    public Wąż(double cena, String nazwa, double wiek, boolean czyŻyje, int skalaJadowitości) {
        this.cena = cena;
        this.nazwa = nazwa;
        this.wiek = wiek;
        this.czyŻyje = czyŻyje;
        this.skalaJadowitości = skalaJadowitości;
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

    public boolean isCzyŻyje() {
        return czyŻyje;
    }

    public void setCzyŻyje(boolean czyŻyje) {
        this.czyŻyje = czyŻyje;
    }

    @Override
    public double cena() {
        return cena;
    }

    @Override
    public SPOSÓB_ŻYWIENIA sposóbŻywienia() {
        return SPOSÓB_ŻYWIENIA.MIĘSOŻERNE;
    }

    @Override
    public GATUNEK_ZWIERZĘCIA gatunekZwierzęcia() {
        return GATUNEK_ZWIERZĘCIA.GAD;
    }

    @Override
    public String nazwa() {
        return nazwa;
    }

    @Override
    public boolean jestJadowity() {
        return true;
    }

    @Override
    public int skalaJadowitości() {
        return skalaJadowitości;
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
        return 0;
    }

    @Override
    public boolean posiadaFutro() {
        return false;
    }

    @Override
    public String toString() {
        return "Wąż{" +
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
