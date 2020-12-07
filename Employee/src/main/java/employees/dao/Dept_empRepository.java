package employees.dao;

import employees.dao.entity.Dept_empEntity;
import org.springframework.data.repository.CrudRepository;

public interface Dept_empRepository extends CrudRepository<Dept_empEntity, Integer>{
}
