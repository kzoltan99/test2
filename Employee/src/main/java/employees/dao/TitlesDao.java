package employees.dao;

import employees.model.Employees;
import employees.model.Titles;

import java.util.Collection;

public interface TitlesDao {

    void createTitles(Titles titles);
    Collection<Titles> readAll();
}
