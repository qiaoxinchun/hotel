package com.qiaoxc.hotel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 客房信息
 * </p>
 *
 * @author zzg
 * @since 2020-06-08
 */
public class RoomInfo implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "room_info_id", type = IdType.AUTO)
    private Integer roomInfoId;

    /**
     * 房间号
     */
    private String roomNum;

    /**
     * 房间名字
     */
    private String roomName;

    /**
     * 房间类型
     */
    private Integer roomTypeId;

    /**
     * 平米数
     */
    private String squareMeters;

    /**
     * 基本价格
     */
    private Double basicPrice;

    /**
     * 床位数
     */
    private Integer bedNum;

    /**
     * 是否有空调1是0否
     */
    private Integer airCondition;

    /**
     * 是否有电视1是0否
     */
    private Integer tv;

    /**
     * 是否入住（0是1否2预定3需要打扫）
     */
    private Integer status;


    public Integer getRoomInfoId() {
        return roomInfoId;
    }

    public void setRoomInfoId(Integer roomInfoId) {
        this.roomInfoId = roomInfoId;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(String squareMeters) {
        this.squareMeters = squareMeters;
    }

    public Double getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(Double basicPrice) {
        this.basicPrice = basicPrice;
    }

    public Integer getBedNum() {
        return bedNum;
    }

    public void setBedNum(Integer bedNum) {
        this.bedNum = bedNum;
    }

    public Integer getAirCondition() {
        return airCondition;
    }

    public void setAirCondition(Integer airCondition) {
        this.airCondition = airCondition;
    }

    public Integer getTv() {
        return tv;
    }

    public void setTv(Integer tv) {
        this.tv = tv;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RoomInfo{" +
        "roomInfoId=" + roomInfoId +
        ", roomNum=" + roomNum +
        ", roomName=" + roomName +
        ", roomTypeId=" + roomTypeId +
        ", squareMeters=" + squareMeters +
        ", basicPrice=" + basicPrice +
        ", bedNum=" + bedNum +
        ", airCondition=" + airCondition +
        ", tv=" + tv +
        ", status=" + status +
        "}";
    }
}
