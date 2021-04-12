package com.example.domain.services;

import com.example.domain.entitites.Employee;

import javax.naming.ConfigurationException;
import java.sql.SQLException;
import java.util.List;

public interface EmployeeService {
        List<Employee> getAll() throws SQLException, ConfigurationException;
}
