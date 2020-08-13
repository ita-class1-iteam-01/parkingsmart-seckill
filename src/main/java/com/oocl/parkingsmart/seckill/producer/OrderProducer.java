package com.oocl.parkingsmart.seckill.producer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.oocl.parkingsmart.seckill.model.Order;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class OrderProducer {

    private final JmsMessagingTemplate template;
    private final static String QUEUENAME = "SECKILL_QUEUE";
    private final static Gson gson = new GsonBuilder().create();
    public OrderProducer(JmsMessagingTemplate template) {
        this.template = template;
    }

    public void send(Order order) {
        template.convertAndSend(QUEUENAME,order);
    }
}
