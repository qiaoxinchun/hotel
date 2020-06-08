package com.qiaoxc.hotel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 酒店基本信息
 * </p>
 *
 * @author zzg
 * @since 2020-06-08
 */
public class HotelInfo implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "hotel_info_id", type = IdType.AUTO)
    private Integer hotelInfoId;

    private String hotelName;

    private String hotelPhone;

    private String hotelLocal;

    private Double avgRoomPrice;

    private String detailedAddress;

    private String hotelImg;


    public Integer getHotelInfoId() {
        return hotelInfoId;
    }

    public void setHotelInfoId(Integer hotelInfoId) {
        this.hotelInfoId = hotelInfoId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelPhone() {
        return hotelPhone;
    }

    public void setHotelPhone(String hotelPhone) {
        this.hotelPhone = hotelPhone;
    }

    public String getHotelLocal() {
        return hotelLocal;
    }

    public void setHotelLocal(String hotelLocal) {
        this.hotelLocal = hotelLocal;
    }

    public Double getAvgRoomPrice() {
        return avgRoomPrice;
    }

    public void setAvgRoomPrice(Double avgRoomPrice) {
        this.avgRoomPrice = avgRoomPrice;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getHotelImg() {
        return hotelImg;
    }

    public void setHotelImg(String hotelImg) {
        this.hotelImg = hotelImg;
    }

    @Override
    public String toString() {
        return "HotelInfo{" +
        "hotelInfoId=" + hotelInfoId +
        ", hotelName=" + hotelName +
        ", hotelPhone=" + hotelPhone +
        ", hotelLocal=" + hotelLocal +
        ", avgRoomPrice=" + avgRoomPrice +
        ", detailedAddress=" + detailedAddress +
        ", hotelImg=" + hotelImg +
        "}";
    }
}
