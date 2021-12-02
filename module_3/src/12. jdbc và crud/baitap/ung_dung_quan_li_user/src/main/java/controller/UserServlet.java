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
import java.util.List;

@WebServlet(name = "UserServlet",urlPatterns = {"","/user"})
public class UserServlet extends HttpServlet {
    IUserService iUserService = new UserSevice();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String notice = request.getParameter("notice");
        if(notice == null){
            notice = "";
        }
        switch (notice){
            case "create" :
                createUser(request,response);
            default:
                showListUser(request,response);
                break;
        }
    }

    private void createUser(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(name,email,country);
        iUserService.insertUser(user);
        request.setAttribute("message","thêm mới thất bại");
        try {
            request.getRequestDispatcher("create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String notice = request.getParameter("notice");
     if(notice == null){
         notice = "";
     }
     switch (notice){
         case "create" :
             showCreate(request,response);
         default:
             showListUser(request,response);
     }
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("create.jsp").forward(request,response);
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
            request.getRequestDispatcher("list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
