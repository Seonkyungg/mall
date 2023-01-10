package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Ordered extends AbstractEvent {

    private Long id;
    private String customerid;
    private String productid;
    private String productname;
    private Integer qty;
    private String orderDate;

    public Ordered(Order aggregate){
        super(aggregate);
    }
    public Ordered(){
        super();
    }
}
