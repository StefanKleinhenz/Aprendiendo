package Polymorphismus.Youtubevideo;

public class VehiculoDeportivo extends Vehiculo {
    private int cilindrada;

    public VehiculoDeportivo(String matriluca, String marca, String modelo, int cilindrada) {
        super(matriluca, marca, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCilindrada=" + cilindrada;
    }

}
