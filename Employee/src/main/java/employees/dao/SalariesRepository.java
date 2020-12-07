package employees.dao;

import employees.dao.entity.SalariesEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface SalariesRepository extends CrudRepository<SalariesEntity, Integer> {

}
