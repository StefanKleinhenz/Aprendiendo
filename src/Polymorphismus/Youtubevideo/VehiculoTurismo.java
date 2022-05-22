package Polymorphismus.Youtubevideo;

public class VehiculoTurismo extends Vehiculo {

    private int numeroPuertas;

    public VehiculoTurismo(String matriluca, String marca, String modelo, int numeroPuertas) {
        super(matriluca, marca, modelo);
        this.numeroPuertas = numeroPuertas;

    }

    @Override
    public String toString() {
        return super.toString() + " \nNumero de Puertas=" + numeroPuertas;
    }

}
