package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleFunction;

public class Main {
    public static void main(String[] args) {


        DoubleFunction sinus = (x) -> Math.sin(x);


        
        System.out.println(sinus.apply(4));

        List<Laptop> listLaptops = new ArrayList<>();
        listLaptops.add(new Laptop("Dell", 16, 800));
        listLaptops.add(new Laptop("Acer", 8, 1200));
        listLaptops.add(new Laptop("Acer", 12, 700));

        Collections.sort(listLaptops);

        // Collections.sort(listLaptops, new Comparator<Laptop>() {

        // @Override
        // public int compare(Laptop o1, Laptop o2) {
        // int orden = (o1.getBrand().compareTo(o2.getBrand())) * -1;
        // if (orden == 0) {
        // orden = (o1.getRAM() - (o2.getRAM())) * -1;
        // }

        // return orden;
        // }

        // });
        Collections.sort(listLaptops, (o1, o2) -> {
            int orden = (o1.getBrand().compareTo(o2.getBrand())) * -1;
            if (orden == 0) {
                orden = (o1.getRAM() - (o2.getRAM())) * -1;
            }

            return orden;
        });

        listLaptops.stream().forEach(e -> System.out.println(e + " "));

    }

}
