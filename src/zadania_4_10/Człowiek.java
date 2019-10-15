package zadania_4_10;

public class Człowiek {
    private String name;
    private int wiek;
    private String miasto;
    private String płeć;

    @Override
    public String toString() {
        return "{" +
                "Imię i Nazwisko='" + name + '\'' +
                ", wiek=" + wiek +
                ", miasto='" + miasto + '\'' +
                ", płeć='" + płeć + '\'' +
                '}';
    }

    public Człowiek(String name, int wiek, String miasto, String płeć) {
        this.name = name;
        this.wiek = wiek;
        this.miasto = miasto;
        this.płeć = płeć;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getPłeć() {
        return płeć;
    }

    public void setPłeć(String płeć) {
        this.płeć = płeć;
    }
}
