package employees.dao;

import employees.model.Dept_manager;
import employees.model.Salaries;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Slf4j
@RequiredArgsConstructor
public class Dept_managerDaoImpl implements Dept_managerDao {

    private final Dept_managerRepository dept_managerRepository;

    @Override
    public Collection<Dept_manager> readAll() {
        return StreamSupport.stream(dept_managerRepository.findAll().spliterator(),false)
                .map(entity -> new Dept_manager(
                        entity.getId().getId().getId(),
                        entity.getId().getDept_no(),
                        entity.getFrom_date(),
                        entity.getTo_date()

                ))
                .collect(Collectors.toList());
    }
}
