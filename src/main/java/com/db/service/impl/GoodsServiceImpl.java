package com.db.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.db.entity.Goods;
import com.db.mapper.GoodsMapper;
import com.db.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author swedsn
 * @version 1.0
 * @date 2023-05-25 08:15
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {

    @Autowired
    GoodsMapper goodsMapper;


    @Override
    public List<Goods> selectGoodsByPage(Integer pageNum) {
        int numStart = (pageNum-1)*10;
        return goodsMapper.selectGoodsListByPage(numStart);
    }
}
