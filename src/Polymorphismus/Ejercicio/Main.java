package Polymorphismus.Ejercicio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        

        ArrayList<Poligono> poligonos = new ArrayList<>();
        poligonos.add(new Rectangulo(2,4,2));
        poligonos.add(new Triangulo(3, 3, 6 ));
        

        for (Poligono poligono : poligonos) {
            System.out.println(poligono.toString());
            System.out.println();
        }
    }
}
