package employees.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.sql.Date;

@AllArgsConstructor
@ToString
@Getter
@EqualsAndHashCode
public class Salaries {

    private long emp_no;
    private int salary;
    private Date from_date;
    private Date to_date;
}
