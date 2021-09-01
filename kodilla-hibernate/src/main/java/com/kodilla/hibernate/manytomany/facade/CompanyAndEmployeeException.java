package com.kodilla.hibernate.manytomany.facade;

public class CompanyAndEmployeeException extends Exception {
    public static String ERR_COMPANY_NOT_FOUND = "Company cannot be found";
    public static String ERR_EMPLOYEE_NOT_FOUND = "Employee cannot be found";

    public CompanyAndEmployeeException(String message){
        super(message);
    }
}
