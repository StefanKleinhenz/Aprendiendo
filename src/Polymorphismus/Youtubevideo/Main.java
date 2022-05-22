package Polymorphismus.Youtubevideo;

public class Main {

    public static void main(String[] args) {
        
        Vehiculo v1 = new Vehiculo("123" , "BMW", "M1");
        Vehiculo v2 = new VehiculoTurismo("345", "Benz", "CGL", 4);
        Vehiculo v3 = new VehiculoDeportivo("567", "Dacia", "Sandero", 300);
        VehiculoFurgoneta v4 = new VehiculoFurgoneta("789", "Codia", "lo", 500);
        

    }
    
}
