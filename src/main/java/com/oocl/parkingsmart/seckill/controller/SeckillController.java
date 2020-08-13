package com.oocl.parkingsmart.seckill.controller;

import com.oocl.parkingsmart.seckill.model.Order;
import com.oocl.parkingsmart.seckill.producer.OrderProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/seckills")
@CrossOrigin
public class SeckillController {

    private final OrderProducer producer;

    public SeckillController(OrderProducer producer) {
        this.producer = producer;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    String order(@RequestBody Order order){
        producer.send(order);
        return "success";
    }
}
