package Polymorphismus.Ejercicio;

public class Triangulo extends Poligono {

    private double lado1, lado2, lado3;

    public Triangulo(int numeroLados, double lado1, double lado2) {
        super(numeroLados);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado1;
    }

    
    public double getLado1() {
        return lado1;
    }


    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }


    public double getLado2() {
        return lado2;
    }


    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }


    public double getLado3() {
        return lado3;
    }


    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }


    @Override
    public double area() {
        
        double altura = Math.sqrt((lado1*2)-((lado2*2)/4));

       
        return (lado2*altura)/2;
    }

    @Override
    public String toString() {
        return "Triangulo"+ super.toString()+ "\nLado 1: " + lado1 + "\nLado 2: " + lado2 + "\nLado 3: " + lado3 +"\nArea: "+area();
    }

    
}
