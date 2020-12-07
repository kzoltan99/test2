package employees.dao;

import employees.dao.entity.DepartmentsEntity;
import employees.dao.entity.EmployeesEntity;
import employees.model.Departments;
import employees.model.Employees;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Slf4j
@RequiredArgsConstructor
public class DepartmentsDaoImpl implements DepartmentsDao {

    private final DepartmentsRepository departmentsRepository;

    @Override
    public void createDepartments(Departments departments) {

        DepartmentsEntity departmentsEntity;

        departmentsEntity = DepartmentsEntity.builder()
                .dept_no(departments.getDept_no())
                .dept_name(departments.getDept_name())
                .build();
        log.info("DepartmentsEntity: {}", departmentsEntity);
        try {
            departmentsRepository.save(departmentsEntity);
        }
        catch(Exception e){
            log.error(e.getMessage());
        }

    }

    @Override
    public Collection<Departments> readAll() {
        return StreamSupport.stream(departmentsRepository.findAll().spliterator(),false)
                .map(entity -> new Departments(
                        entity.getDept_no(),
                        entity.getDept_name()


                ))
                .collect(Collectors.toList());
    }
}
