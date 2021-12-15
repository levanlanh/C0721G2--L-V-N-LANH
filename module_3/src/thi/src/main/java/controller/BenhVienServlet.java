package controller;

import model.BenhVien;
import service.BenhVienService;
import service.BenhVienServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "MatBangServlet", urlPatterns = "/benhVien")
public class BenhVienServlet extends HttpServlet {
    BenhVienServiceImpl benhVienService = new BenhVienService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "delete" :
                delete(request,response);
                break;
            default:
                benhVienList(request, response);
                break;
        }

    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        this.benhVienService.remove(name);
        try {
            response.sendRedirect("/benhVien");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void benhVienList(HttpServletRequest request, HttpServletResponse response) {
        List<BenhVien> benhVienList = this.benhVienService.findAll();
        request.setAttribute("benhVienList", benhVienList);
        try {
            request.getRequestDispatcher("benhVien/list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {

            default:
                break;
        }
    }


}


