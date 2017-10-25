package beans;

/**
 * Created by Maksim on 7/25/2017.
 */
public class LaptopProduct extends Product {
    public double RAM;

    public LaptopProduct(int id ,double price, String name, double RAM) {
        super(id, price, name);
        this.RAM = RAM;
    }
}
