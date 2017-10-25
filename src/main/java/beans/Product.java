package beans;

/**
 * Created by Maksim on 7/25/2017.
 */
public class Product {
    protected double price;
    protected String name;
    protected int id;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public Product(int id , double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }
}
