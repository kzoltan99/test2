package employees.service;

import employees.dao.Dept_empDao;
import employees.dao.Dept_managerDao;
import employees.model.Dept_emp;
import employees.model.Dept_manager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Slf4j
@Service
@RequiredArgsConstructor
public class Dept_empServiceImpl implements Dept_empService {

    private final Dept_empDao dept_empDao;

    @Override
    public Collection<Dept_emp> getAllDept_emp() {
        return dept_empDao.readAll();
    }
}
