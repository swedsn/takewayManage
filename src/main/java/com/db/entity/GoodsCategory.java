package com.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author swedsn
 * @version 1.0
 * @date 2022-12-08 21:32
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("goodsCategory")
public class GoodsCategory {
    @TableId(value = "categoryID", type = IdType.AUTO)
    private int categoryID;
    private String categoryName;
}
