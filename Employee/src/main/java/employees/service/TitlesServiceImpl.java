package employees.service;

import employees.dao.EmployeesDao;
import employees.dao.TitlesDao;
import employees.model.Employees;
import employees.model.Titles;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Slf4j
@Service
@RequiredArgsConstructor
public class TitlesServiceImpl implements TitlesService {

    private final TitlesDao titlesDao;

    @Override
    public Collection<Titles> getAllTitles() {
        return titlesDao.readAll();
    }

    @Override
    public void recordTitles(Titles titles) {


    }

}