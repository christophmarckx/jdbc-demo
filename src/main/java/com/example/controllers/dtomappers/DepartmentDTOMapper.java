package com.example.controllers.dtomappers;

import com.example.controllers.dtos.DepartmentDTO;
import com.example.domain.entitites.Department;
import org.springframework.stereotype.Component;

@Component
public class DepartmentDTOMapper implements DTOMapper<Department,DepartmentDTO>{
    @Override
    public DepartmentDTO map(Department entity) {
       return new DepartmentDTO(entity.getId(), entity.getName());
    }
}
