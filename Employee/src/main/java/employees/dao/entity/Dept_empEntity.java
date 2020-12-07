package employees.dao.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "dept_emp", schema = "employees")

public class Dept_empEntity {

    @EmbeddedId
    private Dept_empId id;

    @Column
    private Date from_date;

    @Column
    private Date to_date;
}
