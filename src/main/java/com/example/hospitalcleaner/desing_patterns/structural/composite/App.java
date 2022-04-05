package com.example.hospitalcleaner.desing_patterns.structural.composite;

public class App {

    public static void main(String args[]) {


        SalesDepartment salesDepartment = new SalesDepartment(1, "Sales department first");
        FinancialDepartment financialDepartment = new FinancialDepartment(
                2, "Financial department first");

        HeadDepartment headDepartment = new HeadDepartment(
                3, "Head department first");


       FinancialDepartment financialDepartment2 = new FinancialDepartment(
                5, "Financial department2");
        SalesDepartment salesDepartment2 = new SalesDepartment(7, "Sales department2");

        HeadDepartment headDepartment1 = new HeadDepartment(4,"Mini Head department");
        headDepartment1.addDepartment(financialDepartment2);
        headDepartment1.addDepartment(salesDepartment2);

        headDepartment.addDepartment(headDepartment1);
        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        //headDepartment.removeDepartment(headDepartment1);

        System.out.println(headDepartment.printDepartmentName());
        headDepartment.printDepartmentName();
    }

}
