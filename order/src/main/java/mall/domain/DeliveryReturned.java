package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class DeliveryReturned extends AbstractEvent {

    private Long id;
    private String customerid;
    private String customerAdress;
    private String productNumber;
    private Integer qty;
    private Date orderid;
    private String productid;
}


