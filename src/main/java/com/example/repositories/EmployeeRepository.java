package com.example.repositories;

import com.example.domain.entitites.Employee;

import javax.naming.ConfigurationException;
import java.sql.SQLException;
import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAll() throws SQLException, ConfigurationException;
}
