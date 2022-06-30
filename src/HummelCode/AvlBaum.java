package HummelCode;

import java.util.LinkedList;
import java.util.List;

public class AvlBaum { // bisher nur Binärbaum
    private Knoten wurzel = null;
    private List<Knoten> bsl = new LinkedList<>();

    public void insert(int n) {
        if (wurzel == null) {
            wurzel = new Knoten(n);
            return;
        }

        Knoten toBeBalanced = wurzel.insert(n);

        if (toBeBalanced != null) {
            wurzel = wurzel.wurzelBalance();
        }

    }

    public boolean contains(int n) {
        if (wurzel == null)
            return false;

        return wurzel.contains(n);
    }

    public void delete(int n) {
        if (wurzel != null)
            wurzel = wurzel.delete(n);
    }

    public void preorder() {
        System.out.print("preorder: ");
        if (wurzel == null) {
            System.out.println("leer");
            return;
        }

        wurzel.preorder();

        System.out.println();
    }

    // TODO inorder()

    // TODO postorder()

    public void breadthFirst() {
        System.out.print("breadthFirst:\n");
        if (wurzel == null) {
            System.out.println("leer");
            return;
        }

        bsl.add(wurzel);
        wurzel.breadthFirst(wurzel.höhe);

        System.out.println();
    }

    public int height() {
        if (wurzel == null)
            return 0;

        return wurzel.höhe;
    }

    // ----------------------

    class Knoten {
        private int wert;
        private int höhe = 1;
        private int höhenunterschied = 0;

        private Knoten links;
        private Knoten rechts;

        public Knoten(int n) {
            this.wert = n;
        }

        public Knoten insert(int n) {
            Knoten toBeBalanced = null;

            if (n < wert)
                if (links == null)
                    links = new Knoten(n);
                else
                    toBeBalanced = links.insert(n);

            else if (n > wert)
                if (rechts == null)
                    rechts = new Knoten(n);
                else
                    toBeBalanced = rechts.insert(n);
            else
                throw new IllegalArgumentException("Wert schon vorhanden");

            // eigentlicher AVL-Teil
            if (toBeBalanced != null) {
                balance();
            } else if (needsRebalancing())
                return this;

            return null;
        }

        // soll den neuen Nachfolger zurückgeben
        public Knoten delete(int n) {
            if (n == wert)
                if (links == null && rechts == null) // 1. Fall: ist ein Blatt
                    return null;
                else if (links == null) // Fall 2a: nur rechts ein Nachfolger
                    return rechts;
                else if (rechts == null) // Fall 2b: nur linker Nachfolger
                    return links;
                else { // 3. Fall zwei Nachfolger
                    Knoten neu = links.findLargest();
                    neu.rechts = rechts;

                    if (links != neu)
                        links = links.delete(neu.wert);

                    return neu;
                }
            else if (n < wert)
                links = links.delete(n);
            else if (n > wert)
                rechts = rechts.delete(n);

            // TODO: rebalance...

            measureHeight();
            return this;
        }

        public boolean contains(int n) {
            if (n == wert)
                return true;

            if (n < wert && links != null)
                return links.contains(n);

            if (n > wert && rechts != null)
                return rechts.contains(n);

            return false;
        }

        public void preorder() {
            System.out.print(wert + " ");

            if (links != null)
                links.preorder();

            if (rechts != null)
                rechts.preorder();
        }

        public void breadthFirst(int vorherigeHöhe) {
            if (links != null)
                bsl.add(links);
            if (rechts != null)
                bsl.add(rechts);

            if (höhe < vorherigeHöhe)
                System.out.println();
            System.out.print(wert + "(h:" + höhe + "d:" + höhenunterschied + "l:" + (links != null ? links.wert : "-")
                    + "r:" + (rechts != null ? rechts.wert : "-") + ") ");

            bsl.remove(this);

            if (bsl.size() > 0)
                bsl.get(0).breadthFirst(höhe);
        }

        private boolean needsRebalancing() {
            int[] lhrh = measureHeight();

            höhenunterschied = lhrh[1] - lhrh[0];
            if (Math.abs(höhenunterschied) > 1) {
                System.out.println("  AVL-Warnung bei Knoten " + wert + ", delta h = " + höhenunterschied);
                System.out.println("\trechts - links: " + lhrh[1] + " - " + lhrh[0]);

                return true;
            }

            return false;
        }

        private void balance() {
            System.out
                    .println("balance@" + wert + " " + rechts.höhenunterschied + " " + rechts.rechts.höhenunterschied);
            if (rechts.höhenunterschied == 2 && rechts.rechts.höhenunterschied == 1) { // rechts-rechts
                rechts.rechts.links = rechts;
                rechts = rechts.rechts;
                rechts.links.rechts = null;
                rechts.links.measureHeight();
                rechts.measureHeight();
            }

            // TODO: links-links, links-rechts & rechts links

            measureHeight();
        }

        private Knoten wurzelBalance() {
            System.out.println("balance@" + wert + " " + höhenunterschied + " " + rechts.höhenunterschied);

            Knoten neueWurzel = this;
            if (höhenunterschied == 2 && rechts.höhenunterschied == 1) { // rechts-rechts
                neueWurzel = rechts;
                rechts.links = this;
                rechts = null;
                measureHeight();
            }

            // TODO: links-links, links-rechts & rechts links

            neueWurzel.measureHeight();
            return neueWurzel;
        }

        private Knoten findLargest() {
            if (rechts == null)
                return this;

            return rechts.findLargest();
        }

        private int[] measureHeight() {
            int lh = 0, rh = 0;
            
            if (links != null)
                lh = links.höhe;
            if (rechts != null)
                rh = rechts.höhe;

            höhe = Math.max(lh, rh) + 1;

            return new int[] { lh, rh };
        }

    } // class Knoten

}