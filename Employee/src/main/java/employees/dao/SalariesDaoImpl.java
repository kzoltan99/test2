package employees.dao;

import employees.model.Employees;
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
public class SalariesDaoImpl implements SalariesDao {

    private final SalariesRepository salariesRepository;

    @Override
    public Collection<Salaries> readAll() {
        return StreamSupport.stream(salariesRepository.findAll().spliterator(),false)
                .map(entity -> new Salaries(
                        entity.getId().getId().getId(),
                        entity.getSalary(),
                        entity.getId().getFrom_date(),
                        entity.getTo_date()

                ))
                .collect(Collectors.toList());
    }
}
