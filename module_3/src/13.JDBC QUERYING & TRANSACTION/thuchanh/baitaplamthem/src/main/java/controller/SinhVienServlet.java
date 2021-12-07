package controller;

import model.SinhVien;
import service.ISinhVienService;
import service.impl.SinhVienService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SinhVienServlet", urlPatterns = {"", "/sinhvien"})
public class SinhVienServlet extends HttpServlet {
    ISinhVienService iSinhVienService = new SinhVienService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String notice = request.getParameter("notice");
        if (notice == null) {
            notice = "";
        }
        switch (notice) {
            case "create":
                createSinhVien(request, response);
                break;
            default:
                showList(request, response);
                break;
        }
    }

    private void createSinhVien(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String hoTen = request.getParameter("hoTen");
        String gioiTinh = request.getParameter("gioiTinh");
        int tuoi = Integer.parseInt(request.getParameter("tuoi"));
        float diemTrungBinh = Float.parseFloat(request.getParameter("diemTrungBinh"));
        SinhVien sinhVien = new SinhVien(id,hoTen, gioiTinh, tuoi, diemTrungBinh);

        iSinhVienService.save(sinhVien);
        if (sinhVien == null) {
            request.setAttribute("message", "thêm mới thất bại");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("create.jsp").forward(request, response);
        }
    }


    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<SinhVien> vienList = iSinhVienService.finedAll();
        request.setAttribute("sinhVienList", vienList);
        try {
            request.getRequestDispatcher("list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // -------------------------------------------------------------------------------
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String notice = request.getParameter("notice");
        if (notice == null) {
            notice = "";
        }
        switch (notice) {
            case "create":
                showCreate(request, response);
                break;
            default:
                showList(request, response);
                break;
        }
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
