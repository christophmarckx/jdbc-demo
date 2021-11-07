package com.example.repositories;

import com.example.domain.entitites.Employee;
import com.example.repositories.resultsetmappers.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

import javax.naming.ConfigurationException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepositoryNativeJDBCImplementation implements EmployeeRepository{

    @Autowired
    private SQLExecutor sqlExecutor;
    private Connection hrConnection;


    public EmployeeRepositoryNativeJDBCImplementation(SQLExecutor executor, Environment environment) throws SQLException {

        this.sqlExecutor = executor;
        this.hrConnection = DriverManager.getConnection(environment.getProperty("spring.datasource.url"),
                environment.getProperty("spring.datasource.username"),
                environment.getProperty("spring.datasource.password"));
        sqlExecutor.setConnection(hrConnection);
    }

    @Override
    public List<Employee> getAll() throws SQLException, ConfigurationException {

        ResultSet resultSet = sqlExecutor.ExecuteQuery("SELECT * FROM employees JOIN departments ON departments.department_id = employees.department_id");

        EmployeeMapper employeeMapper = new EmployeeMapper();
        ArrayList<Employee> allEmployees = new ArrayList<>();

        while(resultSet.next()){
            allEmployees.add(employeeMapper.map(resultSet));
        }

        return allEmployees;
    }
}
