package employees.dao.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@Embeddable
public class Dept_empId implements Serializable {

    @ManyToOne
    @JoinColumn(name="emp_no")
    private EmployeesEntity id;


    @ManyToOne
    @JoinColumn(name="dept_no")
    private DepartmentsEntity dept_no;
}
