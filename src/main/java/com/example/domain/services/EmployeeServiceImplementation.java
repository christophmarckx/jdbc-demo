package com.example.domain.services;

import com.example.domain.entitites.Employee;
import com.example.repositories.EmployeeRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.naming.ConfigurationException;
import java.sql.SQLException;
import java.util.List;

@Service
public class EmployeeServiceImplementation implements EmployeeService{

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImplementation(EmployeeRepository employeeRepository){

        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAll() throws SQLException, ConfigurationException {
        return employeeRepository.getAll();
    }
}
