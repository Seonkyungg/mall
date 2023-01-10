package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Ordered extends AbstractEvent {

    private Long id;
    private String customerid;
    private String productid;
    private String productname;
    private Integer qty;
    private String orderDate;
}


