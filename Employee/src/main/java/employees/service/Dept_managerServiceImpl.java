package employees.service;

import employees.dao.DepartmentsDao;
import employees.dao.Dept_managerDao;
import employees.model.Departments;
import employees.model.Dept_manager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Slf4j
@Service
@RequiredArgsConstructor
public class Dept_managerServiceImpl implements Dept_managerService{

    private final Dept_managerDao dept_managerDao;

    @Override
    public Collection<Dept_manager> getAllDept_manager() {
        return dept_managerDao.readAll();
    }


}
