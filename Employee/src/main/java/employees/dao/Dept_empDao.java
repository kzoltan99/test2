package employees.dao;

import employees.model.Dept_emp;

import java.util.Collection;

public interface Dept_empDao {

    Collection<Dept_emp> readAll();
}
