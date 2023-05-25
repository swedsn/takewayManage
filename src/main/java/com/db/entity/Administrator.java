package com.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author swedsn
 * @version 1.0
 * @date 2023-05-24 10:23
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("Administrator")
public class Administrator {
    private String username;
    private String passwd;
    private String role;
}
