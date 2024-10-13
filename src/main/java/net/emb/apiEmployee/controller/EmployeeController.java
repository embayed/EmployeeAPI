package net.emb.apiEmployee.controller;

import net.emb.apiEmployee.model.Employee;
import net.emb.apiEmployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public Iterable<Employee> getEmployees(){
        return employeeService.getEmployees();
    }
}
