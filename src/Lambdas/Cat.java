package Lambdas;

public class Cat implements Printable {

    String name;

    public Cat() {
    }

    @Override
    public int print(int a, int b) {
        // TODO Auto-generated method stub
        return 0;
    }

}

class main2 {
    public static void main(String[] args) {

        Cat c = new Cat(){
            public int print(int a, int b) {
                return a+b;
            }
        };
        System.out.println(c.print(5, 10));

        // -----------------------------------------
        Printable p = (a, b) -> a + b;
        System.out.println(p.print(2, 3)); 
    }

}
