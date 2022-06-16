package Herencia.Ejercicio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Producto p = new Producto("20.4.2025", 123);
        ProductoFreco pf = new ProductoFreco("20.04.2025", 3,33, "20.2.199", "Costa Rica");
        ProductoRefrigerado pr = new ProductoRefrigerado("20.01.22", 123, 44);
        ProductoCongelado pc = new ProductoCongelado("12.2.3", 123, 30.5);

        
        List<Producto> lista = new ArrayList<>();
        lista.add(p);
        lista.add(pf);
        lista.add(pr);
        lista.add(pc);

        for (Producto producto : lista) {
            System.out.println(producto.toString());
        }

    }

}
