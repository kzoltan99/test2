package employees.dao;

import employees.dao.entity.DepartmentsEntity;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentsRepository extends CrudRepository<DepartmentsEntity, Integer> {
}
