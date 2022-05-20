package Streams;

import java.util.ArrayList;

public class Main {
 

    public static void main(String[] args) {
      
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Katze"));
        animals.add(new Animal("Hund"));
        animals.add(new Animal("Pferd"));

        animals.stream().forEach(a-> System.out.println(a.getTyp()));
    }
}
