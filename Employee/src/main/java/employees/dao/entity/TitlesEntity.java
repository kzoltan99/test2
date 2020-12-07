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
@Table(name = "titles", schema = "employees")


public class TitlesEntity {

   @EmbeddedId
   private TitlesId id;

    @Column
    private Date to_date;
}
