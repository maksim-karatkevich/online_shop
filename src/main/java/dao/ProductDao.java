package dao;

import beans.Product;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Maksim on 7/27/2017.
 */
public interface ProductDao {

    int delete(String id) throws SQLException;

    List<Product> getAll() throws SQLException;

    Product getProductByColumn(String id) throws SQLException;

    int update(Product Product) throws SQLException;
}
