package Polymorphismus.Vorlesung;

public class test {
    public static void main(String[] args) {
        Mitarbeiter mi = new Manager();
        Manager ma = new Geschaeftsfuehrer();

        System.out.println("Ist mi eine Instanz von Mitarbeiter? " + (mi instanceof Mitarbeiter));
        System.out.println("Ist mi eine Instanz von Manager? " + (mi instanceof Manager));
        System.out.println("Ist mi eine Instanz von Geschäftsführer? "+(mi instanceof Geschaeftsfuehrer));
        System.out.println("Ist null eine Instanz von Mitarbeiter? "+ (null instanceof Mitarbeiter));
        ma=(Manager) mi;
        mi =ma;
    }

}
