package Polymorphismus.Youtubevideo;

public class Vehiculo {
    protected String matricula;
    protected String marca;
    protected String modelo;

    
    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }


    public String getmatricula() {
        return matricula;
    }


    public void setmatricula(String matricula) {
        this.matricula = matricula;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    @Override
    public String toString() {
        return "Vehiculo \nMarca=" + marca + "\nmatricula=" + matricula + "\nModelo=" + modelo ;
    }

    
}
