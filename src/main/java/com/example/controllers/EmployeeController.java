package com.example.controllers;

import com.example.controllers.dtomappers.EmployeeDTOMapper;
import com.example.controllers.dtos.EmployeeDTO;
import com.example.domain.entitites.Employee;
import com.example.domain.services.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.ConfigurationException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<EmployeeDTO> getAll() throws Exception {

        var allEmployees = new ArrayList<EmployeeDTO>();

        try {
            for (Employee employee:employeeService.getAll()) {
                allEmployees.add(new EmployeeDTOMapper().map(employee));
            }
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        } catch (ConfigurationException e) {
            throw new Exception(e.getMessage());
        }

        return allEmployees;
    }
}
