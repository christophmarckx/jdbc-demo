package com.example.controllers.dtomappers;

import com.example.controllers.dtos.EmployeeDTO;
import com.example.domain.entitites.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDTOMapper implements DTOMapper<Employee, EmployeeDTO> {

    @Override
    public EmployeeDTO map(Employee entity) {
        return new EmployeeDTO(entity.getId(),
                               entity.getFirst_name(),
                               entity.getLast_name(),
                               entity.getEmail(),
                               entity.getPhone_number(),
                               entity.getHire_date(),
                               entity.getDepartment());
    }
}
