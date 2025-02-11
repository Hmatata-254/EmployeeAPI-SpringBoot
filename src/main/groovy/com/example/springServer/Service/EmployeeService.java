package com.example.springServer.Service;


import com.example.springServer.Model.Employee;
import com.example.springServer.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;



    //creating new employee
    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }


    //deleting an employee
    public Employee deleteEmployee(int id){
        employeeRepository.deleteById(id);
        return null;
    }


    //reading all employees
    public List<Employee> getAllEmployees(){

        List<Employee> employee = new ArrayList<>();
        Streamable.of(employeeRepository.findAll())
                .forEach(employee::add);
        return employee;
    }


}
