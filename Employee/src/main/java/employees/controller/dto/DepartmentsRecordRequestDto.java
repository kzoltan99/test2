package employees.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentsRecordRequestDto extends DepartmentsDto {

    private String dept_no;
    private String dept_name;
}
