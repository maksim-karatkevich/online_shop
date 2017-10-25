package servlet;

import beans.PhoneProduct;
import beans.Product;
import dao.PhoneDaoImpl;
import dao.ProductDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Maksim on 7/21/2017.
 */
@WebServlet("/index")
public class MainServlet extends HttpServlet{

    public void init() throws ServletException {
        // Do required initialization
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProductDao d = new PhoneDaoImpl();
        try {
            List<Product> list = d.getAll();
            request.setAttribute("products", list);
            request.getRequestDispatcher("index.jsp").forward(request, response);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void destroy() {
        // do nothing.
    }
}
