package employees.dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Embeddable
public class Dept_managerId implements Serializable {

    @ManyToOne
    @JoinColumn(name="emp_no")
    private EmployeesEntity id;


    @ManyToOne
    @JoinColumn(name="dept_no")
    private DepartmentsEntity dept_no;
}
