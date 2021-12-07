package controller;

import model.User;
import service.IUserService;
import service.impl.UserSevice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "UserServlet", urlPatterns = {"", "/user"})
public class UserServlet extends HttpServlet {
    IUserService iUserService = new UserSevice();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String notice = request.getParameter("notice");
        if (notice == null) {
            notice = "";
        }
        switch (notice) {
            case "create":
                createUser(request, response);
                break;
            case "update" :
                upDateUser(request,response);
                break;
            case "sort":
                sortUser(request,response);
                break;
            case "search":
                searchUser(request,response);
                break;
            default:
                showListUser(request, response);
                break;
        }
    }

    private void searchUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String country = request.getParameter("countryName");
        List<User> userList = iUserService.selectByCountry(country);
        if(userList==null){
            request.getRequestDispatcher("error-404.jsp").forward(request,response);
        }else {
            request.setAttribute("userList",userList);
            request.getRequestDispatcher("list.jsp").forward(request,response);
        }
    }

    private void sortUser(HttpServletRequest request, HttpServletResponse response) {
        List<User> userList = iUserService.orderByName();
        request.setAttribute("userList",userList);
        try {
            request.getRequestDispatcher("sort.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void upDateUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id =Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(id,name,email,country);
        if(user == null){
            request.getRequestDispatcher("error-404.jsp");
        }else {
            iUserService.updateUser(user);
            request.getRequestDispatcher("edit.jsp").forward(request,response);
            request.setAttribute("massge","Thông tin người dùng đã được cập nhật");
        }
    }

    private void createUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(name,email,country);


        iUserService.insertUser(user);
        if (user == null) {
            request.setAttribute("message", "thêm mới thất bại");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else {
            try {
                request.getRequestDispatcher("create.jsp").forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String notice = request.getParameter("notice");
        if (notice == null) {
            notice = "";
        }
        switch (notice) {
            case "create":
                showCreate(request, response);
                break;
            case "update" :
                showUpdate(request,response);
                break;
            case "delete":
                deleteUser(request,response);
                break;
            default:
                showListUser(request, response);
                break;
        }
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response) {
     int id = Integer.parseInt(request.getParameter("id"));
     this.iUserService.deleteUser(id);
        try {
            response.sendRedirect("/user");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = iUserService.selectUser(id);
        request.setAttribute("useredit",user);
        request.getRequestDispatcher("edit.jsp").forward(request,response);
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

    private void showListUser(HttpServletRequest request, HttpServletResponse response) {
        List<User> userList = iUserService.selectAllUser();
        request.setAttribute("userList", userList);
        try {
            request.getRequestDispatcher("list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
