package net.emb.apiEmployee.service;

import lombok.Data;
import net.emb.apiEmployee.model.Employee;
import net.emb.apiEmployee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> getEmployee(long id){
        return employeeRepository.findById(id);
    }

    public Iterable<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    public void saveEmployee (Employee employee){
        employeeRepository.save(employee);
    }

    public void deleteEmployee(long id){
        employeeRepository.deleteById(id);
    }
}
