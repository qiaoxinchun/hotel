package com.qiaoxc.hotel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 客房预订
 * </p>
 *
 * @author zzg
 * @since 2020-06-08
 */
public class RoomReservation implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 客房编号
     */
    private String roomNumber;

    /**
     * 客房类型(1标准间2大床房3套间)
     */
    private Integer roomType;

    /**
     * 预订客户
     */
    private String bookingCustomers;

    /**
     * 联系电话
     */
    private String contactNumber;

    /**
     * 入住日期
     */
    private LocalDateTime occupancyDate;

    /**
     * 离店日期
     */
    private LocalDateTime dateOfDeparture;

    /**
     * 单价
     */
    private Double unitPrice;

    /**
     * 总价
     */
    private Double totalPrice;

    /**
     * 入住人数
     */
    private Integer checkIn;

    /**
     * 退订（0是1否）
     */
    private Integer unsubscribe;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getRoomType() {
        return roomType;
    }

    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    public String getBookingCustomers() {
        return bookingCustomers;
    }

    public void setBookingCustomers(String bookingCustomers) {
        this.bookingCustomers = bookingCustomers;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public LocalDateTime getOccupancyDate() {
        return occupancyDate;
    }

    public void setOccupancyDate(LocalDateTime occupancyDate) {
        this.occupancyDate = occupancyDate;
    }

    public LocalDateTime getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(LocalDateTime dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Integer checkIn) {
        this.checkIn = checkIn;
    }

    public Integer getUnsubscribe() {
        return unsubscribe;
    }

    public void setUnsubscribe(Integer unsubscribe) {
        this.unsubscribe = unsubscribe;
    }

    @Override
    public String toString() {
        return "RoomReservation{" +
        "id=" + id +
        ", roomNumber=" + roomNumber +
        ", roomType=" + roomType +
        ", bookingCustomers=" + bookingCustomers +
        ", contactNumber=" + contactNumber +
        ", occupancyDate=" + occupancyDate +
        ", dateOfDeparture=" + dateOfDeparture +
        ", unitPrice=" + unitPrice +
        ", totalPrice=" + totalPrice +
        ", checkIn=" + checkIn +
        ", unsubscribe=" + unsubscribe +
        "}";
    }
}
