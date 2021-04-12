package com.example.domain.entitites;

public class Department {
    private int id;
    private String department_name;

    public Department(int department_id, String department_name) {
        this.id = department_id;
        this.department_name = department_name;
    }

    public Department() {

    }

    //region Getters/setters
    public int getId() {
        return id;
    }

    public String getName() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }
    //endregion
}
