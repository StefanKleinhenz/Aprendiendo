package Polymorphismus.Vorlesung;

import java.util.ArrayList;

public class Personalverwaltung {
    public static void main(String[] args) {
        
        Mitarbeiter m1 = new Manager();
        m1.gehalt =350.5;

        Mitarbeiter m2 = new Manager();
        m2.gehalt =270.5;
    
        
        
        ArrayList<Mitarbeiter> mitListe = new ArrayList<>();
        mitListe.add(m1);
        mitListe.add(m2);


        for (Mitarbeiter mitarbeiter : mitListe) {
            System.out.println(mitarbeiter.gehalt);
        }
    }
}
