package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String customerid;
    private String productid;
    private String productname;
    private Integer qty;
    private String orderDate;

    public OrderCancelled(Order aggregate){
        super(aggregate);
    }
    public OrderCancelled(){
        super();
    }
}
