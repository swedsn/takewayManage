package com.db.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author swedsn
 * @version 1.0
 * @date 2023-05-24 23:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("Rider")
public class Rider {
    @TableId
    private String telephone;
    private String passwd;
    private String username;
    private String orderItem;
}
