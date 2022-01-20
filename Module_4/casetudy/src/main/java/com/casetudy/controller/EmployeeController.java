package com.casetudy.controller;

import com.casetudy.model.customer.Customer;
import com.casetudy.model.employee.Employee;
import com.casetudy.service.employee.IDivisionService;
import com.casetudy.service.employee.IEducationDegreeService;
import com.casetudy.service.employee.IEmployeeService;
import com.casetudy.service.employee.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;
    @Autowired
    private IEducationDegreeService educationDegreeService;
    @Autowired
    private IDivisionService divisionService;
    @Autowired
    private IPositionService positionService;

    @GetMapping
    public String showList(Model model) {
        List<Employee> employeeList = employeeService.findAll();
        model.addAttribute("employeeList", employeeList);
        return "employee/list";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("employee",new Employee());
        model.addAttribute("divisionList",divisionService.findAll());
        model.addAttribute("educationDegreeList",educationDegreeService.findAll());
        model.addAttribute("positionList",positionService.findAll());
        return "employee/create";
    }
    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult, RedirectAttributes redirectAttributes,Model model){
        if(bindingResult.hasErrors()){
            String[]genderList={"Male", "Female"};
            model.addAttribute("genderList", genderList);
            model.addAttribute("divisionList", divisionService.findAll());
            model.addAttribute("educationDegreeList", educationDegreeService.findAll());
            model.addAttribute("positionList", positionService.findAll());
            return "employee/create";
        }
        redirectAttributes.addFlashAttribute("message","create success");
        employeeService.save(employee);
        return "redirect:/employee";
    }
    @GetMapping("{id}/view")
    public String view(@PathVariable("id")Integer id,Model model){
        Employee employee = employeeService.findById(id);
        model.addAttribute("employee",employee);
        return "employee/view";
    }
    @GetMapping("{id}/delete")
    public String showDelete(@PathVariable(name = "id") Integer id, Model model) {
        model.addAttribute("employee", employeeService.findById(id));
        return "employee/delete";
    }
    @PostMapping("/delete")
    public String delete(@ModelAttribute("employee") Employee employee, RedirectAttributes redirectAttributes) {
        employeeService.remove(employee.getEmployeeId());
        redirectAttributes.addFlashAttribute("message", "Removed  successfully!");
        return "redirect:/employee";
    }

    @GetMapping("/edit_param")
    public String showEditParam(@RequestParam(name = "id") Integer id, Model model) {
        model.addAttribute("employee", employeeService.findById(id));
        model.addAttribute("divisionList",divisionService.findAll());
        model.addAttribute("educationDegreeList",educationDegreeService.findAll());
        model.addAttribute("positionList",positionService.findAll());

        return "employee/edit";
    }

    @PostMapping("/edit")
    public String edit(@Valid @ModelAttribute("employee") Employee employee,BindingResult bindingResult, RedirectAttributes redirectAttributes,Model model) {
        if(bindingResult.hasErrors()){
            String[]genderList={"Male", "Female"};
            model.addAttribute("genderList", genderList);
            model.addAttribute("divisionList", divisionService.findAll());
            model.addAttribute("educationDegreeList", educationDegreeService.findAll());
            model.addAttribute("positionList", positionService.findAll());
            return "employee/edit";
        }
        employeeService.save(employee);
        redirectAttributes.addFlashAttribute("message", "Edit success");
        return "redirect:/employee";
    }
    @GetMapping("/search")
    public String search(@RequestParam(name = "search") String name, Model model){
        List<Employee> employeeList = employeeService.findByName(name);
        model.addAttribute("employeeList",employeeList);
        return "employee/search";
    }
}
