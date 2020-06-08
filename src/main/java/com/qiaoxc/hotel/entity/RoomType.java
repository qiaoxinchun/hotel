package com.qiaoxc.hotel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 客房类型
 * </p>
 *
 * @author zzg
 * @since 2020-06-08
 */
public class RoomType implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "room_type_id", type = IdType.AUTO)
    private Integer roomTypeId;

    private String typeName;

    private String remark;


    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "RoomType{" +
        "roomTypeId=" + roomTypeId +
        ", typeName=" + typeName +
        ", remark=" + remark +
        "}";
    }
}
