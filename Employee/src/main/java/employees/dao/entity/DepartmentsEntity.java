package employees.dao.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "departments", schema = "employees")

public class DepartmentsEntity {

    @Id
    /*@GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")*/
    @Column
    private String dept_no;


    @Column
    private String dept_name;


}
