package Polymorphismus.Youtubevideo;

public class VehiculoFurgoneta extends Vehiculo {

    private int carga;

    public VehiculoFurgoneta(String matriluca, String marca, String modelo, int carga) {
        super(matriluca, marca, modelo);
        this.carga = carga;

    }

    @Override
    public String toString() {
        return super.toString() + "\nCarga=" + carga;
    }

}
