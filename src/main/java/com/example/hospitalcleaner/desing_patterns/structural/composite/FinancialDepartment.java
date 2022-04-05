package com.example.hospitalcleaner.desing_patterns.structural.composite;

public class FinancialDepartment implements Department{

    private Integer id;
    private String name;

    public FinancialDepartment() {
    }

    public FinancialDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public int printDepartmentName() {
       return 10;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
