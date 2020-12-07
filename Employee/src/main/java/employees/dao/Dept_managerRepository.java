package employees.dao;

import employees.dao.entity.Dept_managerEntity;
import org.springframework.data.repository.CrudRepository;

public interface Dept_managerRepository extends CrudRepository<Dept_managerEntity, Integer> {
}
