package beans;

import factory.ProductFactory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maksim on 7/27/2017.
 */
public class ProductBuilder {

    public static List<Product> getProducts(ResultSet resultSet) throws SQLException {
        List<Product> products = new ArrayList<>();
        while (resultSet.next()) {
            products.add(getProduct(resultSet));
        }
        return products;
    }

    public static Product getProduct(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        double price = resultSet.getDouble("price");
        double camera = resultSet.getDouble("camera");
        return ProductFactory.getProduct(id, name, price, camera);
    }
}
