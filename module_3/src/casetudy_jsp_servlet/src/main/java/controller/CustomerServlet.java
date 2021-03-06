package controller;

import model.Customer;
import service.ICustomerService;
import service.impl.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    ICustomerService customerService = new CustomerService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createCustomer(request, response);
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

    private void search(HttpServletRequest request, HttpServletResponse response) {
        try {
            String name = request.getParameter("searchName");
            int id = Integer.parseInt(request.getParameter("searchId"));
            String address = request.getParameter("searchAddress");
            List<Customer> customerList = this.customerService.search(name, id, address);
            request.setAttribute("customerList",customerList);
            request.getRequestDispatcher("customer/customerList.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void edit(HttpServletRequest request, HttpServletResponse response) {
        int customerId = Integer.parseInt(request.getParameter("customerId"));
        int customerTypeId = Integer.parseInt(request.getParameter("customerTypeId"));
        String customerName = request.getParameter("customerName");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String idCard = request.getParameter("idCard");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = new Customer(customerId, customerTypeId, customerName, birthday, gender, idCard, phone, email, address);
        customerService.update(customer);
        try {
            request.getRequestDispatcher("customer/edit.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
        int customerId = Integer.parseInt(request.getParameter("customerId"));
        int customerTypeId = Integer.parseInt(request.getParameter("customerTypeId"));
        String customerName = request.getParameter("customerName");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String idCard = request.getParameter("idCard");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");

        Customer customer = new Customer();

        customer.setCustomerId(customerId);
        customer.setCustomerTypeId(customerTypeId);
        customer.setCustomerName(customerName);
        customer.setBirthday(birthday);
        customer.setGender(gender);
        customer.setIdCard(idCard);
        customer.setPhone(phone);
        customer.setEmail(email);
        customer.setAddress(address);

        customerService.save(customer);
        if (customer == null) {
            request.setAttribute("message", "th??m m???i th???t b???i");
        } else {
            try {
                request.getRequestDispatcher("customer/create.jsp").forward(request, response);
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
                showCreate(request, response);
                break;
            case "delete":
                delete(request, response);
                break;
            case "edit":
                ShowEdit(request, response);
                break;
            case "sort":
                sort(request, response);
                break;

            default:
                customerList(request, response);
                break;
        }
    }

    private void sort(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = this.customerService.orderByName();
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("customer/customerList.jsp").forward(request, response);
    }

    private void ShowEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.customerService.findById(id);
        request.setAttribute("customer", customer);
        try {
            request.getRequestDispatcher("customer/edit.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        this.customerService.remove(id);
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("customer/create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void customerList(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = customerService.findAll();
        request.setAttribute("customerList", customerList);
        try {
            request.getRequestDispatcher("customer/customerList.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
