import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "KhachHangServlet",urlPatterns = {"","/khach_hang"})
public class KhachHangServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<KhachHang> khachHangServlets = new ArrayList<>();
        khachHangServlets.add(new KhachHang("Mai Văn Hoàng","1983-08-20","Hà Nội", "anh-cr7.jpg"));
        khachHangServlets.add(new KhachHang("Nguyễn Văn Nam","1983-08-27","Hà Giang", "anh1.jpg"));
        khachHangServlets.add(new KhachHang("Nguyễn Thái Hòa","1983-08-12","Gia Lai", "6ebacece4263adfe998cda3d6ed2ef80-1580920989871846349400.jpg"));
        khachHangServlets.add(new KhachHang("Trần Đăng Khoa","1983-08-25","Hà Nội", "download.jpg"));
        khachHangServlets.add(new KhachHang("Nguyễn Đình Thi","1983-08-10","Hà Tây", "download (1).jpg"));
        request.setAttribute("danhsach",khachHangServlets);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

}
