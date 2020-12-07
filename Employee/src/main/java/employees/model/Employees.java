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
public class Employees {

    //private String emp_no;
    private Date birth_date;
    private String first_name;
    private String last_name;
    private String gender;
    private Date hire_date;


}
