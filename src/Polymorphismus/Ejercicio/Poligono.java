package Polymorphismus.Ejercicio;

public abstract class Poligono {
    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }
    public abstract double area();

    @Override
    public String toString() {
        return "\nNumero de Lados:" + numeroLados;
    }
    
}
