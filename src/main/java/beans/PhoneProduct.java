package beans;

/**
 * Created by Maksim on 7/25/2017.
 */
public class PhoneProduct extends Product {
    public double camera;

    @Override
    public String toString() {
        return "PhoneProduct{" +
                "camera=" + camera +
                "} " + super.toString();
    }

    public PhoneProduct(int id , double price, String name, double camera) {
        super(id,price, name);
        this.camera = camera;
    }
}
