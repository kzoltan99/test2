package employees.dao;

import employees.model.Salaries;

import java.util.Collection;

public interface SalariesDao {

    Collection<Salaries> readAll();
}
