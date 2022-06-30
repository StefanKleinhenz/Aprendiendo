package Bäume;

import java.util.Scanner;

public class UI {

    Scanner sc = new Scanner(System.in);
    Baum baum = new Baum();

    public UI() {

        menu();
    }

    public void menu() {

        System.out.println("Binaer Baum!!!!!!!!!");
        System.out.println();

        int option;

        do {

            System.out.println("1. Knoten einfügen");
            System.out.println("2. Baumdurchlauf preOrder");
            System.out.println("3. Baumdurchlauf inOrder");
            System.out.println("4. Baumdurchlauf postOrder");
            System.out.println("5. Knoten loeschen");
            System.out.print("Ihre Option: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    datenBaumEingeben();

                    break;

                case 2:
                    baum.preOrder(baum.wurzel);

                    break;
                case 3:

                    break;

                case 4:

                    break;
                case 5:
                    knotenLoschen();

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
            }

        } while (option != 9);

    }

    public void datenBaumEingeben() {

        System.out.println("Geben Sie einen Wert  ein.");
        System.out.print("Wert: ");
        int wert = Integer.parseInt(sc.nextLine());

        baum.einfuegen(wert);

        System.out.println("Sie haben einen Knoten erfolgreich eingefuegt");
    }

    public void knotenLoschen() {

        System.out.println("Geben Sie einen Wert  ein.");
        int wert = Integer.parseInt(sc.nextLine());

        baum.knotenLoeschen(wert);
    }

}
