package Generics;

public class Main {
    public static void main(String[] args) {

        Printer<Integer> printer = new Printer<>(23);
        printer.print();

        Printer<String> printerString = new Printer<>("hello");
        printerString.print();
    }
    
}
