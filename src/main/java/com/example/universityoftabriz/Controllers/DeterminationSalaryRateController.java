package com.example.universityoftabriz.Controllers;

import com.example.universityoftabriz.Objects.Employee;
import com.example.universityoftabriz.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class DeterminationSalaryRateController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/Employee/Finance/DeterminationSalary")
    public String DeterminationSalary(Model model){
        Optional<Employee> employee = employeeService.getEmployeeByID(LoginController.uid);
        Employee employee1 = employee.get();
        String ImageUrl = employee1.getPhoto();
        model.addAttribute("ImageURL" , ImageUrl);
        return "DeterminationSalaryRate";
    }

    @GetMapping("/EmployeePanel/Finance/DeterminationSalary/getInfo")
    @ResponseBody
    public Optional<Employee> getEmployeeInfo(){
        Optional<Employee> employee = employeeService.getEmployeeByID(LoginController.uid);
        return Optional.of(employee.get());
    }
}