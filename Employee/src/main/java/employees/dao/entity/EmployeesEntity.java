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
@Table(name = "employees", schema = "employees")

public class EmployeesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="emp_no")
    private long id;

    @Column
    private Date birth_date;

    @Column
    private String first_name;

    @Column
    private String last_name;

    @Column
    private String gender;

    @Column
    private Date hire_date;


}
