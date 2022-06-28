package Polymorphismus.Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Polygon> polygon = new ArrayList<>();
        polygon.add(new Rechteck(2, 4, 2));
        polygon.add(new Dreieck(3, 3, 6));

        polygon.stream().forEach(System.out::println);

    }
}
