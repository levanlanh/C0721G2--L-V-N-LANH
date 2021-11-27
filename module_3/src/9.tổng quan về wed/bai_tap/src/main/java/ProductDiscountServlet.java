import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "ProductDiscountServlet", urlPatterns = "/index")
public class ProductDiscountServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        double list_price = Double.parseDouble(request.getParameter("price"));
        double discount_percent = Double.parseDouble(request.getParameter("discount"));

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        double Discount_Amount = list_price * discount_percent * 0.01;
        writer.println("Discount Amount : " + Discount_Amount);
        writer.println("<html>");

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
