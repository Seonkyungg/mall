package mall.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="SearchProduct_table")
@Data
public class SearchProduct {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}
