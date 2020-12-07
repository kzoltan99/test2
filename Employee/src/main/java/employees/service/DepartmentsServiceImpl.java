package employees.service;

import employees.dao.DepartmentsDao;
import employees.model.Departments;
import employees.model.Employees;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Slf4j
@Service
@RequiredArgsConstructor
public class DepartmentsServiceImpl implements DepartmentsService {

    private final DepartmentsDao departmentsDao;

    @Override
    public Collection<Departments> getAllDepartments() {
        return departmentsDao.readAll();
    }


    @Override
    public void recordDepartments(Departments departments) {
        departmentsDao.createDepartments(departments);

    }
}
