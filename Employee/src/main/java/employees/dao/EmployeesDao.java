package employees.dao;


import employees.model.Employees;

import java.util.Collection;

public interface EmployeesDao {

    void createEmployee(Employees employees);
    Collection<Employees> readAll();
}
