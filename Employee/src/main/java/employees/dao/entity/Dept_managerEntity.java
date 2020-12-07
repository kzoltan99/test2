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
@Table(name = "dept_manager", schema = "employees")

public class Dept_managerEntity {

    @EmbeddedId
    private Dept_managerId id;

    @Column
    private Date from_date;

    @Column
    private Date to_date;
}
