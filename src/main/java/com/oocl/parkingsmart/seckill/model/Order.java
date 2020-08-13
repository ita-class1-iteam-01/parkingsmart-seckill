package com.oocl.parkingsmart.seckill.model;

import java.io.Serializable;

/**
 * @ProjectName: seckill
 * @Package: com.oocl.parkingsmart.seckill.model
 * @ClassName: Order
 * @Author: carrymaniac
 * @Description:
 * @Date: 2020/8/13 11:00 上午
 * @Version:
 */

public class Order implements Serializable {
    Integer rentId;
    Integer userId;

    public Order(Integer rentId, Integer userId) {
        this.rentId = rentId;
        this.userId = userId;
    }

    public Integer getRentId() {
        return rentId;
    }

    public void setRentId(Integer rentId) {
        this.rentId = rentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
