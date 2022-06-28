package Bäume;

public class Baum {

    Knoten wurzel;
    int größeBaum;

    public Baum() {
        wurzel = null;
        größeBaum = 0;
    }

    public static void main(String[] args) {

        Baum baum = new Baum();

        baum.einfügen(10);
        baum.einfügen(5);
        baum.einfügen(18);
        baum.einfügen(2);
        baum.einfügen(7);
        baum.einfügen(9);
        baum.einfügen(15);
        baum.einfügen(24);

        System.out.println("Preorder");
        baum.preOrder(baum.wurzel);

        System.out.println("Inorder");
        baum.inOrder(baum.wurzel);

        System.out.println("Postorder");
        baum.postOrder(baum.wurzel);

        // System.out.println(baum.wurzel.toString());
    }

    public void preOrder(Knoten k) {
        System.out.println(k.wert);
        if (k.links != null)
            preOrder(k.links);
        if (k.rechts != null)
            preOrder(k.rechts);
    }

    public void inOrder(Knoten k) {
        if (k.links != null)
            inOrder(k.links);
        System.out.println(k.wert);
        if (k.rechts != null)
            inOrder(k.rechts);
    }

    public void postOrder(Knoten k) {
        if (k.links != null)
            postOrder(k.links);
        if (k.rechts != null)
            postOrder(k.rechts);
       System.out.println(k.wert);
    }

    public void einfügen(int wert) {

        Knoten neuerKnoten = new Knoten(wert);

        if (wurzel == null) {

            wurzel = neuerKnoten;

        } else {
            Knoten aux = wurzel;
            Knoten vater = null;

            while (aux != null) {
                vater = aux;
                if (wert < aux.wert) {
                    aux = aux.links;
                } else {
                    aux = aux.rechts;
                }

            }
            if (wert < vater.wert) {
                vater.links = neuerKnoten;
            } else {
                vater.rechts = neuerKnoten;
            }
        }

    }

    public class Knoten {

        private int wert;
        private Knoten links;
        private Knoten rechts;

        public Knoten(int wert) {

            this.wert = wert;
            links = null;
            rechts = null;

        }

        public int getWert() {
            return wert;
        }

        public Knoten getLinks() {
            return links;
        }

        public Knoten getRechts() {
            return rechts;
        }

        public void setWert(int wert) {
            this.wert = wert;
        }

        @Override
        public String toString() {
            return "Knoten [wert=" + wert + ", links=" + links + ", rechts=" + rechts + "]";
        }

    }
}
