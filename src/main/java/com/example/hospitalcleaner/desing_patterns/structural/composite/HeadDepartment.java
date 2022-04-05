package com.example.hospitalcleaner.desing_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department{
    private Integer id;
    private String name;
    int total=30;

    private List<Department> childDepartments;

    public HeadDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    public int printDepartmentName() {

        for (Department d:childDepartments) {
            total=total+d.printDepartmentName();
        }
        return total;
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }
}
