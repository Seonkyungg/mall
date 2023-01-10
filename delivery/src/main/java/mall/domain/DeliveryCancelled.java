package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryCancelled extends AbstractEvent {

    private Long id;
    private String customerid;
    private String customerAdress;
    private String productNumber;
    private Integer qty;
    private Date orderid;
    private String productid;

    public DeliveryCancelled(Delivery aggregate){
        super(aggregate);
    }
    public DeliveryCancelled(){
        super();
    }
}
