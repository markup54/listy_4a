package pl.zabrze.zs10.listy4a;

public class Produkt {
    private String nazwa;
    private double cena;
    private int ile;

    public Produkt(String nazwa, double cena, int ile) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.ile = ile;
    }

    @Override
    public String toString() {
        return  nazwa + " ilość: " + String.valueOf(ile) + " cena: " + Double.toString(cena);
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public int getIle() {
        return ile;
    }
}
