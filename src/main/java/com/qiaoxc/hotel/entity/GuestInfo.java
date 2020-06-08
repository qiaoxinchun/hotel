package com.qiaoxc.hotel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 宾客信息
 * </p>
 *
 * @author zzg
 * @since 2020-06-08
 */
public class GuestInfo implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "guest_info_id", type = IdType.AUTO)
    private Integer guestInfoId;

    /**
     * 旅客姓名
     */
    private String guestName;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 联系电话
     */
    private String guestPhone;

    /**
     * 备注（是否遗留物品）
     */
    private String remark;

    /**
     * 是否入住0是1否
     */
    private Integer status;


    public Integer getGuestInfoId() {
        return guestInfoId;
    }

    public void setGuestInfoId(Integer guestInfoId) {
        this.guestInfoId = guestInfoId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getGuestPhone() {
        return guestPhone;
    }

    public void setGuestPhone(String guestPhone) {
        this.guestPhone = guestPhone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "GuestInfo{" +
        "guestInfoId=" + guestInfoId +
        ", guestName=" + guestName +
        ", idCard=" + idCard +
        ", guestPhone=" + guestPhone +
        ", remark=" + remark +
        ", status=" + status +
        "}";
    }
}
