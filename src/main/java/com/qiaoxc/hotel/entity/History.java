package com.qiaoxc.hotel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 入住历史记录表
 * </p>
 *
 * @author zzg
 * @since 2020-06-08
 */
public class History implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "history_id", type = IdType.AUTO)
    private Integer historyId;

    /**
     * 入住房间id
     */
    private Integer roomId;

    /**
     * 入住时间
     */
    private LocalDateTime startTime;

    /**
     * 离开时间
     */
    private LocalDateTime endTime;

    /**
     * 共计消费
     */
    private Double totalPrice;

    /**
     * 顾客id
     */
    private Integer guestId;

    /**
     *  备注
     */
    private String remark;


    public Integer getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Integer historyId) {
        this.historyId = historyId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
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

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getGuestId() {
        return guestId;
    }

    public void setGuestId(Integer guestId) {
        this.guestId = guestId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "History{" +
        "historyId=" + historyId +
        ", roomId=" + roomId +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", totalPrice=" + totalPrice +
        ", guestId=" + guestId +
        ", remark=" + remark +
        "}";
    }
}
