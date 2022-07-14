package Lambdas;

public class Berechnung implements Funktion {

    @Override
    public int apply(int a, int b) {
        // TODO Auto-generated method stub
        return a + b;
    }

}

/**
 * InnerBerechnung
 */
class echnung {
    public static void main(String[] args) {


        Funktion f = new Funktion() {

            @Override
            public int apply(int a, int b) {
                // TODO Auto-generated method stub
                return a+b;
            }
            
        };
        f.apply(2, 3);

        Funktion funktion = (a, b) -> a * b;
        
      
        System.out.println(funktion.apply(2, 5));
        
        

    }
}
