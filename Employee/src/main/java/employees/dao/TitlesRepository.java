package employees.dao;

import employees.dao.entity.TitlesEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface TitlesRepository extends CrudRepository<TitlesEntity, Integer>{

    List<TitlesEntity> findTop10ById_Title(String title);  // :)
    Page<TitlesEntity> findById_Title(String title, Pageable pageable);
}
