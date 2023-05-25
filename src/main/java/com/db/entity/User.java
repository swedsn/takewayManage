package com.db.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author swedsn
 * @version 1.0
 * @date 2023-05-24 11:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("User")
public class User {
    @TableId
    private String telephone;//电话号码
    private String passwd;//密码
    private String username;// 名称
    private String address;// 派送地址
    private String role;// 角色
}
