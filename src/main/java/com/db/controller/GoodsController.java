package com.db.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.db.entity.Goods;
import com.db.service.GoodsService;
import com.db.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author swedsn
 * @version 1.0
 * @date 2023-05-25 08:18
 */
@RestController
@CrossOrigin
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    @GetMapping("/selectGoodsByPage")
    public JSONObject selectGoodsByPage(int pageNum) {
        List<Goods> goods = goodsService.selectGoodsByPage(pageNum);
        int goodsNum = goods.size();
        JSONObject str = new JSONObject();
        str.put("total", goodsNum);
        str.put("goods", goods);
        return str;
    }

    @GetMapping("/addGoods")
    public JSONObject addGoods(Goods goods){
        boolean save = goodsService.save(goods);
        JSONObject str = new JSONObject();
        str.put("status", save);
        return str;
    }
    // 修改商品
    @GetMapping("/modifyGoods")
    public JSONObject modifyGoods(Goods goods) {
        boolean flag = goodsService.updateById(goods);
        JSONObject str = new JSONObject();
        str.put("status", flag);
        return str;
    }

    // 删除商品
    @GetMapping("/deleteGoods")
    public JSONObject deleteGoods(int goodsID) {
        boolean flag = goodsService.removeById(goodsID);
        JSONObject str = new JSONObject();
        str.put("status", flag);
        return str;
    }

    //@GetMapping("/selectGoodsByGoodsID")
    //public String selectGoodsByGoodsID(int goodsID) {
    //    goodsService.
    //    Goods goods = goodsService.selectGoodsByGoodsID(goodsID);
    //    return JSON.toJSONString(goods);
    //}

}
