package employees.dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@Embeddable
public class SalariesId implements Serializable {

    @ManyToOne
    @JoinColumn(name="emp_no")
    private EmployeesEntity id;

    @Column
    private Date from_date;
}