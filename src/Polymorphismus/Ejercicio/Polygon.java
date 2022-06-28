package Polymorphismus.Ejercicio;

public abstract class Polygon {
    protected int anzahlSeiten;

    public Polygon(int anzahlSeiten) {
        this.anzahlSeiten = anzahlSeiten;
    }

    public int getanzahlSeiten() {
        return anzahlSeiten;
    }

    public void setanzahlSeiten(int anzahlSeiten) {
        this.anzahlSeiten = anzahlSeiten;
    }
    public abstract double flächeninhalt();

    @Override
    public String toString() {
        return "\nAnzahl der Seiten:" + anzahlSeiten;
    }
    
}
