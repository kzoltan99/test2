package employees.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeesDto {

    private String first_name;
    private String last_name;
    private String gender;
    private Date birth_date;
    private Date hire_date;

}
