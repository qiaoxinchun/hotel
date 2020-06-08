package com.qiaoxc.hotel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 收款信息
 * </p>
 *
 * @author zzg
 * @since 2020-06-08
 */
@Data
public class RefundInfo implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "collection_management _id", type = IdType.AUTO)
    private Integer collectionManagementId;

    /**
     * 预订客房
     */
    private String roomId;

    /**
     * 客户姓名
     */
    private String guestId;

    /**
     * 订单号
     */
    private String orderNum;

    /**
     * 支付金额
     */
    private Double payPrice;

    /**
     * 支付时间
     */
    private LocalDateTime payTime;



    @Override
    public String toString() {
        return "RefundInfo{" +
        "collectionManagement Id=" + collectionManagementId +
        ", roomId=" + roomId +
        ", guestId=" + guestId +
        ", orderNum=" + orderNum +
        ", payPrice=" + payPrice +
        ", payTime=" + payTime +
        "}";
    }
}
