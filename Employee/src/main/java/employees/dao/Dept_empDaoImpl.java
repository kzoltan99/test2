package employees.dao;

import employees.model.Dept_emp;
import employees.model.Dept_manager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Slf4j
@RequiredArgsConstructor
public class Dept_empDaoImpl implements Dept_empDao {

    private final Dept_empRepository dept_empRepository;

    @Override
    public Collection<Dept_emp> readAll() {
        return StreamSupport.stream(dept_empRepository.findAll().spliterator(),false)
                .map(entity -> new Dept_emp(
                        entity.getId().getId().getId(),
                        entity.getId().getDept_no(),
                        entity.getFrom_date(),
                        entity.getTo_date()

                ))
                .collect(Collectors.toList());
    }
}
