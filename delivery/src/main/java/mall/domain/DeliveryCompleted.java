package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryCompleted extends AbstractEvent {

    private Long id;
    private String customerid;
    private String customerAdress;
    private String productNumber;
    private Integer qty;
    private Date orderid;
    private String productid;

    public DeliveryCompleted(Delivery aggregate){
        super(aggregate);
    }
    public DeliveryCompleted(){
        super();
    }
}
