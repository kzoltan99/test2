package employees.service;

import employees.model.Departments;


import java.util.Collection;

public interface DepartmentsService {

    Collection<Departments> getAllDepartments();

    void recordDepartments(Departments departments);
}
