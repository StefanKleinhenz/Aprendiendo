package Polymorphismus.Ejercicio;

public class Dreieck extends Polygon {

    private double seite1, seite2, seite3;

    public Dreieck(int anzahlSeiten, double seite1, double seite2) {
        super(anzahlSeiten);
        this.seite1 = seite1;
        this.seite2 = seite2;
        this.seite3 = seite1;
    }

    public double getSeite1() {
        return seite1;
    }

    public void setSeite1(double seite1) {
        this.seite1 = seite1;
    }

    public double getSeite2() {
        return seite2;
    }

    public void setSeite2(double seite2) {
        this.seite2 = seite2;
    }

    public double getSeite3() {
        return seite3;
    }

    public void setSeite3(double seite3) {
        this.seite3 = seite3;
    }

    @Override
    public double flächeninhalt() {

        double altura = Math.sqrt((seite1 * 2) - ((seite2 * 2) / 4));

        return (seite2 * altura) / 2;
    }

    @Override
    public String toString() {
        return "Dreieck" + super.toString() + "\nSeite 1: " + seite1 + "\nSeite 2: " + seite2 + "\nSeite 3: " + seite3
                + "\nflächeninhalt: " + flächeninhalt();
    }

}
