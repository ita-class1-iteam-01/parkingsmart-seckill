package com.oocl.parkingsmart.seckill.model;

import java.io.Serializable;
import java.util.Date;

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
    private Integer rentId;
    private Integer userId;
    private String latitude;
    private String longitude;
    private String reservationStartTime;
    private String reservationEndTime;

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

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getReservationStartTime() {
        return reservationStartTime;
    }

    public void setReservationStartTime(String reservationStartTime) {
        this.reservationStartTime = reservationStartTime;
    }

    public String getReservationEndTime() {
        return reservationEndTime;
    }

    public void setReservationEndTime(String reservationEndTime) {
        this.reservationEndTime = reservationEndTime;
    }
}
