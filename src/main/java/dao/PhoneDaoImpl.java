package dao;

import beans.Product;
import beans.ProductBuilder;
import factory.ProductFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Maksim on 7/27/2017.
 */
public class PhoneDaoImpl extends ProductConnection implements ProductDao {

    public List<Product> getAll() throws SQLException {
        try {
            preparedStatement = getPrepareStatement("SELECT * FROM phone ORDER BY id");
            return ProductBuilder.getProducts(preparedStatement.executeQuery());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            getConnection().close();
        }
        return null;
    }

    public Product getProductByColumn(String column) throws SQLException {
        try {
            preparedStatement = getPrepareStatement("SELECT * FROM phone WHERE id = " + column);
            return ProductBuilder.getProduct(preparedStatement.executeQuery());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            getConnection().close();
        }
        return null;
    }


    public int update(Product Product) {
        return 0;
    }
    public int delete(String id) {
        return 0;
    }


}
