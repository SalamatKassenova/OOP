package lecture4;

public class Electronics extends Product{
    private String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price); //calling ctor of base class
        this.brand = brand;
    }

    //getter
    public String getBrand() {
        return brand;
    }
}
