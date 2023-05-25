package com.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.db.entity.Goods;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author swedsn
 * @version 1.0
 * @date 2023-05-24 23:33
 */
@Repository
public interface GoodsMapper extends BaseMapper<Goods> {
    @Select("select * from goods limit #{numStart},10")
    List<Goods> selectGoodsListByPage(int numStart);
}
