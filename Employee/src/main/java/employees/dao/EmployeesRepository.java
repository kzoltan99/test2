package employees.dao;

import employees.dao.entity.EmployeesEntity;
import employees.dao.entity.TitlesEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface EmployeesRepository extends CrudRepository<EmployeesEntity, Integer> {


    //List<EmployeesEntity> findTop10ById_Gender(String gender);
    Page<EmployeesEntity> findByGender(String gender, Pageable pageable);
}
