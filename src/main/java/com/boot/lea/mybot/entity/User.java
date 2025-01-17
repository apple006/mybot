package com.boot.lea.mybot.entity;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author LiJing
 * @ClassName: User
 * @Description: 用户基本实体对象
 * @date 2019/7/30 16:05
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 用户名
     */
    private String username;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 性别
     */
    private String sex;
    /**
     * 密码
     */
    private String password;
    /**
     * 创建时间
     */
    private Date createTime;


}
