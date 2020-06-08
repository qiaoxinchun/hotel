package com.qiaoxc.hotel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 退款信息
 * </p>
 *
 * @author zzg
 * @since 2020-06-08
 */
public class CollectionInfo implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "refund_info _id", type = IdType.AUTO)
    private Integer refundInfoId;

    /**
     * 订单号
     */
    private String orderNum;

    /**
     * 客户姓名
     */
    private String guestName;

    /**
     * 客户电话
     */
    private String guestPhone;

    /**
     * 预订客房
     */
    private String roomId;

    /**
     * 支付金额
     */
    private Double payPrice;

    /**
     * 申请退款时间
     */
    private LocalDateTime applyTime;

    /**
     * 处理退款时间
     */
    private LocalDateTime refundTime;

    /**
     * 退款金额
     */
    private Double refundPrice;


    @Override
    public String toString() {
        return "CollectionInfo{" +
        "refundInfo Id=" + refundInfoId +
        ", orderNum=" + orderNum +
        ", guestName=" + guestName +
        ", guestPhone=" + guestPhone +
        ", roomId=" + roomId +
        ", payPrice=" + payPrice +
        ", applyTime=" + applyTime +
        ", refundTime=" + refundTime +
        ", refundPrice=" + refundPrice +
        "}";
    }
}
