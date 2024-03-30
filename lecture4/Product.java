package lecture4;

public abstract class Product {
    private String name;
    private double price;

    //ctor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //getters
    public String getName(){return name;}
    public double getPrice(){return price;}
}


