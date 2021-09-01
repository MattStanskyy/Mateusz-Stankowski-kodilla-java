package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyAndEmployeeFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyAndEmployeeFacade.class);
    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    @Autowired
    public CompanyAndEmployeeFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public void companyFinder(final String text) throws CompanyAndEmployeeException {
        LOGGER.info("Searching for companies by " + text + " fragment...");
        List<Company> companies = companyDao.retrieveCompanyByAnyFragmentOfCompanyName(text);
        if (companies.size() == 0) {
            throw new CompanyAndEmployeeException(CompanyAndEmployeeException.ERR_COMPANY_NOT_FOUND);
        } else {
            companies.forEach(company -> System.out.println(company.getName()));
        }
    }

    public void EmployeeFinder(final String text) throws CompanyAndEmployeeException {
        LOGGER.info("Searching for employees by " + text + " fragment...");
        List<Employee> employees = employeeDao.retrieveEmployeeByAnyFragmentOfEmployeeName(text);
        if (employees.size() == 0) {
            throw new CompanyAndEmployeeException(CompanyAndEmployeeException.ERR_COMPANY_NOT_FOUND);
        } else {
            employees.forEach(employee -> System.out.println(employee.getFirstname() + " " + employee.getLastname()));
        }
    }
}
