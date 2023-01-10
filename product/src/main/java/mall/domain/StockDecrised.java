package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class StockDecrised extends AbstractEvent {

    private Long id;

    public StockDecrised(Inventory aggregate){
        super(aggregate);
    }
    public StockDecrised(){
        super();
    }
}
