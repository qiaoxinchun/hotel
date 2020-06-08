package com.qiaoxc.hotel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zzg
 * @since 2020-06-08
 */
public class SysUser implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    private String name;

    private String password;

    private String phone;

    private String post;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "SysUser{" +
        "userId=" + userId +
        ", name=" + name +
        ", password=" + password +
        ", phone=" + phone +
        ", post=" + post +
        "}";
    }
}
