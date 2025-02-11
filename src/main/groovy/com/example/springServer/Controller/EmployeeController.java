package com.example.springServer.Controller;


import com.example.springServer.Model.Employee;
import com.example.springServer.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class EmployeeController{
    @Autowired
    private EmployeeService employeeService;


    //for getting an employee from the server
    @GetMapping("/employee/get-all")
    public List<Employee> getAllEmployees(){
       return employeeService.getAllEmployees();
    }


    //for adding an employee to the server
    @PostMapping("/employee/save")
    public Employee saveEmployee(@RequestBody Employee employee){
        return  employeeService.saveEmployee(employee);
    }


}
