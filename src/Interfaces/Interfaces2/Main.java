package Interfaces.Interfaces2;

public class Main {

    public static void main(String[] args) {
        ByTwo two = new ByTwo();
        ByThree three = new ByThree();

        Series ob;

        for (int i = 0; i < 7; i++) {
            ob = two;
            System.out.println(ob.getNext());

            ob = three;
            System.out.println(ob.getNext());
        }
    }
    
}
