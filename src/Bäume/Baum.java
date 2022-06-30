package Bäume;

public class Baum {

    Knoten wurzel;
    int größe;

    public Baum() {
        this.wurzel = null;
        this.größe = 0;
    }

    public boolean istLeer() {

        return wurzel == null;
    }

    public Knoten einfügenMitRekursion(Knoten wurzel,int wert) {
        
        if (wurzel == null) {
            wurzel = new Knoten(wert);
        }
        if (wert<wurzel.wert) {
            wurzel.links=einfügenMitRekursion(wurzel.links, wert);
        } else if (wert > wurzel.wert) {
            wurzel.rechts = einfügenMitRekursion(wurzel.rechts, wert);
        }
        return wurzel;

    }

    public void einfuegen(int wert) {

        Knoten neuerKnoten = new Knoten(wert);

        if (istLeer()) {
            wurzel = neuerKnoten;
        } else {
            Knoten pointer = wurzel;
            Knoten vater = null;

            while (pointer != null) {
                vater = pointer;

                if (wert < pointer.wert) {
                    pointer = pointer.links;
                } else {
                    pointer = pointer.rechts;
                }

            }
            if (wert < vater.wert) {
                vater.links = neuerKnoten;
            } else {
                vater.rechts = neuerKnoten;
            }

        }

    }

    public boolean knotenLöschen(int wert) {

        Knoten pointer = wurzel;
        Knoten vater = null;
        boolean isLinkesKind = true;

        while (wert != pointer.wert) {
            vater = pointer;

            if (wert < pointer.wert) {
                pointer = pointer.links;
                isLinkesKind = true;
            } else {
                pointer = pointer.rechts;
                isLinkesKind = false;
            }
            if (pointer == null) {
                return false;
            }

        }

        if (pointer.isBlatt()) {

            löschenKnotenBlatt(vater, pointer, isLinkesKind);

        } else if (pointer.links == null || pointer.rechts == null) {
            löschenKnotenMitEinemKind(vater, pointer, isLinkesKind);
        }

        return true;

    }

    private void löschenKnotenMitEinemKind(Knoten vater, Knoten pointer, boolean isLinkesKind) {

        //Wenn das rechte Kind null ist, wissen wir, dass wir nur ein linkes Kind haben
        if (pointer.rechts == null) {
            if (pointer == wurzel) {
                wurzel = pointer.links;

            } else if (isLinkesKind) {
                vater.links = pointer.links;
            } else {
                vater.rechts = pointer.links;
            }
        // Wenn das linke Kind null ist, wissen wir, dass wir ein rechtes Kind haben
        } else if (pointer.links == null) {

            if (pointer == wurzel) {
                wurzel = pointer.rechts;

            } else if (isLinkesKind) {
                vater.links = pointer.rechts;
            } else {
                vater.rechts = pointer.rechts;
            }
        }

    }

    private void löschenKnotenBlatt(Knoten vater, Knoten pointer, boolean isLinkesKind) {

        if (pointer == wurzel) {
            wurzel = null;
        } else if (isLinkesKind) {
            vater.links = null;
        } else {
            vater.rechts = null;
        }
    }

    @Deprecated
    public boolean knotenLoeschen(int wert) {

        Knoten pointer = wurzel;
        Knoten vater = null;
        boolean isLinkesKind = false;

        while (pointer.wert != wert) {
            vater = pointer;

            if (wert < pointer.wert) {
                isLinkesKind = true;
                pointer = pointer.links;

            } else {
                isLinkesKind = false;
                pointer = pointer.rechts;
            }
            if (pointer == null) {
                return false;
            }
        } // fin while

        if (pointer.isBlatt()) { // esto quiere decir que es una hoja
            if (pointer == wurzel) {
                wurzel = null;
            } else if (isLinkesKind) {
                vater.links = null;
            } else {
                vater.rechts = null;
            }

        } else if (pointer.rechts == null) {
            if (pointer == wurzel) {
                wurzel = pointer.links;
            } else if (isLinkesKind) {
                vater.links = pointer.links;
            } else {
                vater.rechts = pointer.links;
            }

        } else if (pointer.links == null) {

            if (pointer == wurzel) {
                wurzel = pointer.rechts;
            } else if (isLinkesKind) {
                vater.links = pointer.rechts;
            } else {
                vater.rechts = pointer.rechts;
            }

        } else {
            Knoten ersatz = getKnotenErsatz(pointer);

            if (pointer == wurzel) {
                wurzel = ersatz;

            } else if (isLinkesKind) {
                vater.links = ersatz;
            } else {
                vater.rechts = ersatz;
            }
            ersatz.links = pointer.links;
        }

        return true;

    }

    private Knoten getKnotenErsatz(Knoten ersatzKnoten) {

        Knoten vaterErsatz = ersatzKnoten;
        Knoten ersatz = ersatzKnoten;
        Knoten pointer = ersatzKnoten.rechts;

        while (pointer != null) {

            vaterErsatz = ersatzKnoten;
            ersatz = pointer;
            pointer = pointer.links;

        }
        if (ersatz != ersatzKnoten.rechts) {
            ersatzKnoten.links = ersatz.rechts;
            ersatz.rechts = ersatzKnoten.rechts;
        }

        System.out.println("Der Knoten erstatz ist: " + ersatz);
        return ersatz;
    }

    public boolean knotenFinden(int wert) {

        Knoten pointer = wurzel;
        Knoten vater = null;

        while (wert != pointer.wert) {
            vater = pointer;

            if (wert < pointer.wert) {
                pointer = pointer.links;
            } else {
                pointer = pointer.rechts;
            }
            if (wert != pointer.wert) {
                return false;
            }

        }

        return true;
    }

    public void preOrder(Knoten knoten) {

        if (istLeer()) {
            System.out.println("Der Baum ist leer, fuegen Sie erstmal ein paar Knoten ein.");
            System.out.println();
        } else {

            System.out.println(knoten.wert);

            if (knoten.links != null) {
                preOrder(knoten.links);
            }

            if (knoten.rechts != null) {
                preOrder(knoten.rechts);

            }
        }

    }

    public class Knoten {

        private int wert;
        private Knoten links;
        private Knoten rechts;

        public Knoten(int wert) {

            this.wert = wert;
            this.links = null;
            this.rechts = null;

        }

        public boolean isBlatt() {

            return (links == null && rechts == null);
        }

        @Override
        public String toString() {
            return "Knoten, Wert" + wert + ", links=" + links + ", rechts=" + rechts;
        }

    }

}
