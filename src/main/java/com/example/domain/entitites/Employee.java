package com.example.domain.entitites;

import java.util.Date;

public class Employee {
    private int id;
    private String first_name;
    private String last_name;
    private String  email;
    private String phone_number;
    private Date hire_date;
    private Department department;

    public Employee(int id,
                    String first_name,
                    String last_name,
                    String email,
                    String phone_number,
                    java.sql.Date hire_date,
                    Department department) {

        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone_number = phone_number;
        this.hire_date = hire_date;
        this.department = department;
    }

    public Employee() {

    }

    //region Getters/setters
   public int getId() {
        return this.id;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    //endregion
}
