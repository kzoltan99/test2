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
@Table(name = "salaries", schema = "employees")

public class SalariesEntity {


    @EmbeddedId
    private SalariesId id;

    @Column
    private int salary;

    @Column
    private Date to_date;
}
