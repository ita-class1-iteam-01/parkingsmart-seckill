package com.oocl.parkingsmart.seckill.producer;

import com.oocl.parkingsmart.seckill.model.Order;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class OrderProducer {

    private final JmsMessagingTemplate template;
    private final static String QUEUENAME = "SECKILLQUEUE";

    public OrderProducer(JmsMessagingTemplate template) {
        this.template = template;
    }

    public void send(Order order) {
        template.convertAndSend(QUEUENAME, "");
    }
}
