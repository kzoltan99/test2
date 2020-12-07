package employees.service;

import employees.dao.SalariesDao;
import employees.dao.TitlesDao;
import employees.model.Salaries;
import employees.model.Titles;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Slf4j
@Service
@RequiredArgsConstructor
public class SalariesServiceImpl implements SalariesService {

    private final SalariesDao salariesDao;

    @Override
    public Collection<Salaries> getAllSalaries() {
        return salariesDao.readAll();
    }
}
