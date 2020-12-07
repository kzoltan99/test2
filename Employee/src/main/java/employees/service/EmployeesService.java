package employees.service;

import employees.model.Employees;

import java.util.Collection;

public interface EmployeesService {

    Collection<Employees> getAllEmployees();

    void recordEmployees(Employees employees);

}
