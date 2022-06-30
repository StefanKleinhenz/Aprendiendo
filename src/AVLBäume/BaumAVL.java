package AVLBäume;

import Polymorphismus.Vorlesung.A;

public class BaumAVL {

    private Knoten wurzel;

    public BaumAVL() {

        wurzel = null;
    }

    public Knoten knotenSuchen(Knoten knoten, int wert) {

        if (wurzel == null) {
            return null;

        } else if (knoten.wert == wert) {
            return knoten;

        } else if (wert < knoten.wert) {
            return knotenSuchen(knoten.links, wert);

        } else {
            return knotenSuchen(knoten.rechts, wert);
        }

    }

    public int getBF(Knoten knoten) {

        if (knoten == null) {
            return -1; // Wenn es kein Knoten gibt, dann ist der BF -1
        } else {    //Sonst ist es 0, ein Knoten hat immer den BF = 0
            return knoten.bf;
        }
    }

    public Knoten linksRotation(Knoten y) {
        Knoten x = y.rechts;
        Knoten z = x.links;
        x.links = y;
        y.rechts = z;

        y.bf = Math.max(getBF(y.links), getBF(y.rechts)) + 1;
        x.bf = Math.max(getBF(x.links), getBF(x.rechts))
                + 1;

        return x;

    }

    public Knoten rechtsRotation(Knoten knoten) {

        Knoten pointer = knoten.rechts;
        knoten.rechts = pointer.links;
        pointer.links = knoten;

        knoten.BF = Math.max(getBF(knoten.links), getBF(knoten.rechts)) + 1;
        pointer.BF = Math.max(getBF(pointer.links), getBF(pointer.rechts))
                + 1;

        return pointer;

    }

    public Knoten rotacionRechtsLinks(Knoten knoten) {

        Knoten pointer;
        knoten.links = rechtsRotation(knoten.links);
        pointer = linksRotation(knoten);

        return pointer;

    }

    public Knoten rotacionLinksRechts(Knoten knoten) {

        Knoten pointer;
        knoten.links = rechtsRotation(knoten.links);
        pointer = linksRotation(knoten);

        return pointer;

    }

    public Knoten rechtsLinksRotation(Knoten knoten) {
        Knoten pointer;
        knoten.rechts = linksRotation(knoten.rechts);
        pointer = rechtsRotation(knoten);

        return pointer;

    }

    public Knoten einfügen(Knoten neuerKnoten, Knoten subBaum) {

        return null;
    }

    public class Knoten {

        private int wert;
        private int bf;

        private Knoten links;
        private Knoten rechts;

        public Knoten(int wert) {

            this.wert = wert;
            this.bf = 0;
            this.links = null;
            this.rechts = null;

        }

    }

}
