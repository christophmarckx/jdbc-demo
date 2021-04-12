package com.example.repositories.resultsetmappers;

import com.example.domain.entitites.Employee;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class EmployeeMapper implements ResultSetMapper<Employee> {

    @Override
    public Employee map(ResultSet resultset) throws SQLException {

        return new Employee(resultset.getInt("employee_id"),
                            resultset.getString("first_name"),
                            resultset.getString("last_name"),
                            resultset.getString("email"),
                            resultset.getString("phone_number"),
                            resultset.getDate("hire_date"),
                            new DepartmentMapper().map(resultset));
    }
}
