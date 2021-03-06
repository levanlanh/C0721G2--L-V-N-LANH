package controller;

import model.Employee;
import service.IEmployeeService;
import service.impl.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet",urlPatterns = "/employee")
public class EmployeeServlet extends HttpServlet {
    IEmployeeService employeeService = new EmployeeService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createEmpoyee(request, response);
                break;
            case "edit":
                edit(request, response);
                break;
            case "search":
                search(request, response);
                break;
            default:
                break;
        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String name = request.getParameter("searchName");
    List<Employee> employeeList = this.employeeService.search(name);
    request.setAttribute("employeeList",employeeList);
    request.getRequestDispatcher("employee/list.jsp").forward(request,response);
    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {
        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        String employeeName = request.getParameter("employeeName");
        int positionId = Integer.parseInt(request.getParameter("positionId"));
        int degreeId = Integer.parseInt(request.getParameter("degreeId"));
        int divisionId = Integer.parseInt(request.getParameter("divisionId"));
        String birthday = request.getParameter("birthday");
        String idCard = request.getParameter("idCard");
        String salary = request.getParameter("salary");
        String phone = request.getParameter("employeeName");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Employee employee = new Employee(employeeId,employeeName,positionId,degreeId,divisionId,birthday,idCard,salary,phone,email,address);
        employeeService.update(employee);
        try {
            request.getRequestDispatcher("employee/edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createEmpoyee(HttpServletRequest request, HttpServletResponse response) {
        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        String employeeName = request.getParameter("employeeName");
        int positionId = Integer.parseInt(request.getParameter("positionId"));
        int degreeId = Integer.parseInt(request.getParameter("degreeId"));
        int divisionId = Integer.parseInt(request.getParameter("divisionId"));
        String birthday = request.getParameter("birthday");
        String idCard = request.getParameter("idCard");
        String salary = request.getParameter("salary");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");

        Employee employee = new Employee();

        employee.setEmployeeId(employeeId);
        employee.setEmployeeName(employeeName);
        employee.setPositionId(positionId);
        employee.setDegreeId(degreeId);
        employee.setDivisionId(divisionId);
        employee.setBirthday(birthday);
        employee.setIdCard(idCard);
        employee.setSalary(salary);
        employee.setPhone(phone);
        employee.setEmail(email);
        employee.setAddress(address);

        employeeService.save(employee);

        if(employee == null){
            request.setAttribute("message","th??m m???i th???t b???i");
        }else {
            try {
                request.getRequestDispatcher("employee/create.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                ShowCreateEmployee(request, response);
                break;
            case "edit":
                ShowEdit(request, response);
                break;
            case "delete" :
                deleteEmployee(request,response);
                break;
            case "sort":
                sort(request,response);
                break;
            default:
                employeeList(request,response);
                break;
        }
    }

    private void sort(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employeeList = this.employeeService.orderByName();
        request.setAttribute("employeeList",employeeList);
        try {
            request.getRequestDispatcher("employee/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void ShowEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Employee employee = this.employeeService.findById(id);
        request.setAttribute("employee",employee);
        try {
            request.getRequestDispatcher("employee/edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void ShowCreateEmployee(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("employee/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        this.employeeService.remove(id);
        try {
            response.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void employeeList(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employeeList = employeeService.findAll();
        request.setAttribute("employeeList",employeeList);
        try {
            request.getRequestDispatcher("employee/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
