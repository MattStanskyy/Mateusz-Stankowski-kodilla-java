package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.CompanyAndEmployeeException;
import com.kodilla.hibernate.manytomany.facade.CompanyAndEmployeeFacade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CompanyAndEmployeeTestSuite {

    @Autowired
    private CompanyAndEmployeeFacade companyAndEmployeeFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testCompanyFacade() {

        //Given
        Company company1 = new Company("HSBC");
        Company company2 = new Company("Comarch");
        Company company3 = new Company("Assecco");
        Company company4 = new Company("company 4");
        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);
        companyDao.save(company4);
        try {
            companyAndEmployeeFacade.companyFinder("com");
        } catch (CompanyAndEmployeeException e) {

        } finally {
            companyDao.delete(company1);
            companyDao.delete(company2);
            companyDao.delete(company3);
            companyDao.delete(company4);
        }
    }

    @Test
    public void testEmployeeFacade() {

        //Given
        Employee employee1 = new Employee("Janusz", "Bób");
        Employee employee2 = new Employee("Michał", "Bobek");
        Employee employee3 = new Employee("Przemysłąw", "Kamil");
        Employee employee4 = new Employee("Henryk", "Waza");
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);
        employeeDao.save(employee4);
        try {
            companyAndEmployeeFacade.EmployeeFinder("aza");
        } catch (CompanyAndEmployeeException e) {

        } finally {
            employeeDao.delete(employee1);
            employeeDao.delete(employee2);
            employeeDao.delete(employee3);
            employeeDao.delete(employee4);
        }
    }
}
