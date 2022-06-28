package Polymorphismus.Ejercicio;

public class Rechteck extends Polygon {

    private double seite1;
    private double seite2;

    public Rechteck(int anzahlSeiten, int Seite1, int Seite2) {
        super(anzahlSeiten);
        this.seite1 = Seite1;
        this.seite2 = Seite2;
    }

    public double getSeite1() {
        return seite1;
    }

    public void setSeite1(double Seite1) {
        this.seite1 = Seite1;
    }

    public double getSeite2() {
        return seite2;
    }

    public void setSeite2(double Seite2) {
        this.seite2 = Seite2;
    }

    @Override
    public double flächeninhalt() {

        return seite1 * seite2;
    }

    @Override
    public String toString() {
        return "Rechteck " + super.toString() + "\nSeite 1: " + seite1 + "\nSeite 2: " + seite2 + "\nflächeninhalt: " + flächeninhalt();
    }

}
