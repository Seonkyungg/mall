package mall.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import mall.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import mall.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired DeliveryRepository deliveryRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCancelled'")
    public void wheneverOrderCancelled_CancellDelivery(@Payload OrderCancelled orderCancelled){

        OrderCancelled event = orderCancelled;
        System.out.println("\n\n##### listener CancellDelivery : " + orderCancelled + "\n\n");


        

        // Sample Logic //
        Delivery.cancellDelivery(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Ordered'")
    public void wheneverOrdered_PrepareDelivery(@Payload Ordered ordered){

        Ordered event = ordered;
        System.out.println("\n\n##### listener PrepareDelivery : " + ordered + "\n\n");


        

        // Sample Logic //
        Delivery.prepareDelivery(event);
        

        

    }

}


