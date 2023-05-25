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
 * @date 2023-05-24 23:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("Goods")
public class Goods {
    @TableId(value = "goodsID", type = IdType.AUTO) //value：指定主键对应的数据库表的列名
    private Integer goodsID; // 商品ID
    private String goodsName; //商品名称
    private double goodsPrice; //商品价格
    private String goodsCategoryID; // 商品类别
    private String goodsLogo; //商品logo
    private boolean goodsExist; //商品是否上线
    private String goodsDescription; //商品描述
    private int goodsSale; //商品销售量
}
