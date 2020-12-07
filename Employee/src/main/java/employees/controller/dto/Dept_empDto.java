package employees.controller.dto;

import employees.dao.entity.DepartmentsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.sql.Date;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Dept_empDto {

    private long emp_no;
    private DepartmentsEntity dept_no;
    private Date from_date;
    private Date to_date;
}
