package Herencia.Ejercicio;

public class ProductoFreco extends ProductoRefrigerado {

    private String fechaEnvasado;
    private String paisOrigen;

    public ProductoFreco(String fechaCaducidad, int numeroLote, int codigoSupervisionAlimentaria, String fechaEnvasado,
            String paisOrigen) {
        super(fechaCaducidad, numeroLote, codigoSupervisionAlimentaria);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "ProductoFreco [fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen + "]" + super.toString();
    }

}
