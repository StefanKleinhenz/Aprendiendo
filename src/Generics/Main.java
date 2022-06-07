package Generics;

public class Main {
    public static void main(String[] args) {

        Printer<Cat> printer = new Printer<>(new Cat());
        printer.print();
        

        Printer<Dog> printerString = new Printer<>(new Dog());
        printerString.print();
    }
    
}
