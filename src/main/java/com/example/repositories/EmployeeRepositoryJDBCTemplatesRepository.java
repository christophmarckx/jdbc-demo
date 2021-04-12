package com.example.repositories;

import com.example.domain.entitites.Employee;
import com.example.repositories.resultsetmappers.EmployeeMapper;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.naming.ConfigurationException;
import java.sql.SQLException;
import java.util.List;

@Repository
@Primary
public class EmployeeRepositoryJDBCTemplatesRepository implements EmployeeRepository{

    private JdbcTemplate template;

    public EmployeeRepositoryJDBCTemplatesRepository(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public List<Employee> getAll() throws SQLException, ConfigurationException {

        EmployeeMapper mapper = new EmployeeMapper();

        return template.query("SELECT * FROM employees JOIN departments ON departments.department_id = employees.department_id",
                (resultset, rownumber)  -> mapper.map(resultset));
    }
}
