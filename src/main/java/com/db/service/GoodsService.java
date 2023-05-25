package com.db.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.db.entity.Goods;

import java.util.List;

/**
 * @author swedsn
 * @version 1.0
 * @date 2023-05-25 08:15
 */
public interface GoodsService extends IService<Goods> {

    //// 查询所有商品
    //List<Goods> list();
    //
    //// 分页查询商品
    List<Goods> selectGoodsByPage(Integer pageNum);

    //// 获取到商品的数量
    //int getGoodsNum();
    //
    //// 按照条件查询商品
    //List<Goods> selectGoodsByCondition(String goodsName, String goodsCategory);





}
