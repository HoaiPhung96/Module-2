import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "DiscountServlet", urlPatterns = "/index")
public class DiscountServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float percent = Float.parseFloat(request.getParameter("percent"));
        float result = price * percent / 100;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");
        writer.println("<form>");
        writer.println("<h1>Description: " + description + "</h1>");
        writer.println("<h1>Price: " + price + "</h1>");
        writer.println("<h1>Percent: " + percent + "</h1>");
        writer.println("<h1>Product Discount Calculator: " + result + "</h1>");
        writer.println("</form>");
        writer.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
