package employees.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.sql.Date;


@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeesRecordRequestDto extends EmployeesDto {

    private String first_name;
    private String last_name;
    private String gender;
    private String birth_date;
    private String hire_date;
}
