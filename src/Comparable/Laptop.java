package Comparable;

public class Laptop implements Comparable<Laptop>{

    private String brand;
    private int RAM;
    private int price;

    public Laptop(String brand, int rAM, int price) {
        this.brand = brand;
        RAM = rAM;
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getRAM() {
        return RAM;
    }
    public void setRAM(int rAM) {
        RAM = rAM;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    


    @Override
    public int compareTo(Laptop o) {
        int orden = (this.getBrand().compareTo(o.getBrand()))*-1;
        if (orden == 0) {
            orden = (this.getRAM() - (o.getRAM()))*-1;
        }
       
        return orden;
    }
    @Override
    public String toString() {


        return "Laptop [RAM=" + RAM + ", brand=" + brand + ", price=" + price + "]";
    }

    
    
}
