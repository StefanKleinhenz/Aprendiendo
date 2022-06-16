package Herencia.Ejercicio;


public class ProductoRefrigerado extends Producto {

    private int codigoSupervisionAlimentaria;

    public ProductoRefrigerado(String fechaCaducidad, int numeroLote, int codigoSupervisionAlimentaria) {
        super(fechaCaducidad, numeroLote);
        this.codigoSupervisionAlimentaria = codigoSupervisionAlimentaria;
    }

    public int getCodigoSupervisionAlimentaria() {
        return codigoSupervisionAlimentaria;
    }

    public void setCodigoSupervisionAlimentaria(int codigoSupervisionAlimentaria) {
        this.codigoSupervisionAlimentaria = codigoSupervisionAlimentaria;
    }

    @Override
    public String toString() {
        return "ProductoRefrigerado [codigoSupervisionAlimentaria=" + codigoSupervisionAlimentaria + "]"
                + super.toString();
    }

    
}
