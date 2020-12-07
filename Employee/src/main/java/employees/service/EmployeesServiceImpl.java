package employees.service;

import employees.dao.EmployeesDao;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import employees.model.Employees;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmployeesServiceImpl implements EmployeesService {

    private final EmployeesDao employeesDao;

    @Override
    public Collection<Employees> getAllEmployees() {
        return employeesDao.readAll();
    }

    @Override
    public void recordEmployees(Employees employees) {
        employeesDao.createEmployee(employees);

    }


}
