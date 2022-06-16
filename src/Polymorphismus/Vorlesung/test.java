package Polymorphismus.Vorlesung;

public class test {
    public static void main(String[] args) {
        
        Mitarbeiter m1 = new Mitarbeiter();


        Mitarbeiter mi = new Manager();
        Manager ma = new Geschaeftsfuehrer();

        Geschaeftsfuehrer gf = new Geschaeftsfuehrer();
        gf.gehalt = 100;
        

        // InstaceOf checks if its a class, subclass or interface
        System.out.println("Ist mi eine Instanz von Mitarbeiter? " + (mi instanceof Mitarbeiter));
        System.out.println("Ist mi eine Instanz von Manager? " + (mi instanceof Manager));
        System.out.println("Ist mi eine Instanz von Geschäftsführer? " + (mi instanceof Geschaeftsfuehrer));
        System.out.println("Ist ma eine Instanz von Geschäftsführer? " + (ma instanceof Geschaeftsfuehrer));
        System.out.println("Ist null eine Instanz von Mitarbeiter? "+ (null instanceof Mitarbeiter));
        ma=(Manager) mi;
        mi =ma;
    }

}
