package factory;

import beans.PhoneProduct;
import beans.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maksim on 7/27/2017.
 */
public class ProductFactory {

    public static Product getProduct(int id, String name, double price, double camera) {
        return new PhoneProduct(id, price, name, camera);
    }
}
