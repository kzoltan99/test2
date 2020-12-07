package employees.dao;

import employees.model.Departments;
import employees.model.Employees;

import java.util.Collection;

public interface DepartmentsDao {

    void createDepartments(Departments departments);
    Collection<Departments> readAll();
}
