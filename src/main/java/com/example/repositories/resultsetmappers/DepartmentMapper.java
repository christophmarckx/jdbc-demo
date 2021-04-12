package com.example.repositories.resultsetmappers;

import com.example.domain.entitites.Department;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class DepartmentMapper implements ResultSetMapper<Department> {
    @Override
    public Department map(ResultSet resultset) throws SQLException {
        return new Department(resultset.getInt("department_id"),
                              resultset.getString("department_name"));
    }
}
