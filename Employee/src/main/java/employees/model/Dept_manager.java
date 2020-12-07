package employees.model;

import employees.dao.entity.DepartmentsEntity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.sql.Date;

@AllArgsConstructor
@ToString
@Getter
@EqualsAndHashCode
public class Dept_manager {

    private long emp_no;
    private DepartmentsEntity dept_no;
    private Date from_date;
    private Date to_date;
}
