package employees.dao;

import employees.dao.entity.EmployeesEntity;
import employees.dao.entity.TitlesEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import employees.model.Employees;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@Service
@Slf4j
@RequiredArgsConstructor
public class EmployeesDaoImpl implements EmployeesDao {

    private final EmployeesRepository employeesRepository;


    @Override
    public void createEmployee(Employees employees) {

        EmployeesEntity employeesEntity;

        employeesEntity = EmployeesEntity.builder()
                .birth_date(employees.getBirth_date())
                .first_name(employees.getFirst_name())
                .last_name(employees.getLast_name())
                .gender(employees.getGender())
                .hire_date(employees.getHire_date())
                .build();
        log.info("EmployeesEntity: {}", employeesEntity);
        try {
            employeesRepository.save(employeesEntity);
        }
        catch(Exception e){
            log.error(e.getMessage());
        }

    }

    @Override
    public Collection<Employees> readAll() {
        return StreamSupport.stream(employeesRepository.findByGender("M", PageRequest.of(0, 9)).getContent().spliterator(),false)
                .map(entity -> new Employees(
                        entity.getBirth_date(),
                        entity.getFirst_name(),
                        entity.getLast_name(),
                        entity.getGender(),
                        entity.getHire_date()

                ))
                .collect(Collectors.toList());
    }
}
