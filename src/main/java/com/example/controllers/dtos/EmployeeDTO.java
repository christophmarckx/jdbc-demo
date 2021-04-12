package com.example.controllers.dtos;

import com.example.controllers.dtomappers.DepartmentDTOMapper;
import com.example.domain.entitites.Department;

import java.util.Date;

public class EmployeeDTO {

        private int id;
        private String first_name;
        private String last_name;
        private String  email;
        private String phone_number;
        private Date hire_date;
        private int job_id;
        private DepartmentDTO department;

        public EmployeeDTO(int id,
                           String first_name,
                           String last_name,
                           String email,
                           String phone_number,
                           Date hire_date,
                           Department department) {

                this.id = id;
                this.first_name = first_name;
                this.last_name = last_name;
                this.email = email;
                this.phone_number = phone_number;
                this.hire_date = hire_date;
                this.department = new DepartmentDTOMapper().map(department);
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getFirst_name() {
                return first_name;
        }

        public void setFirst_name(String first_name) {
                this.first_name = first_name;
        }

        public String getLast_name() {
                return last_name;
        }

        public void setLast_name(String last_name) {
                this.last_name = last_name;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getPhone_number() {
                return phone_number;
        }

        public void setPhone_number(String phone_number) {
                this.phone_number = phone_number;
        }

        public Date getHire_date() {
                return hire_date;
        }

        public void setHire_date(Date hire_date) {
                this.hire_date = hire_date;
        }

        public int getJob_id() {
                return job_id;
        }

        public void setJob_id(int job_id) {
                this.job_id = job_id;
        }

        public DepartmentDTO getDepartment() {
                return department;
        }

        public void setDepartment(DepartmentDTO department) {
                this.department = department;
        }
}
