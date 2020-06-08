package com.qiaoxc.hotel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 房间信息
 * </p>
 *
 * @author zzg
 * @since 2020-06-08
 */
public class RoomPrice implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "room_price_id", type = IdType.AUTO)
    private Integer roomPriceId;

    /**
     * 房间类型（0大床房1标间2套间）
     */
    private Integer roomTypeId;

    /**
     * 开始时间
     */
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    private LocalDateTime endTime;

    /**
     * 房间价格
     */
    private Double roomPrice;

    /**
     * 折扣
     */
    private String discount;

    /**
     * 折扣后价格
     */
    private Double discountPrice;


    public Integer getRoomPriceId() {
        return roomPriceId;
    }

    public void setRoomPriceId(Integer roomPriceId) {
        this.roomPriceId = roomPriceId;
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public Double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "RoomPrice{" +
        "roomPriceId=" + roomPriceId +
        ", roomTypeId=" + roomTypeId +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", roomPrice=" + roomPrice +
        ", discount=" + discount +
        ", discountPrice=" + discountPrice +
        "}";
    }
}
