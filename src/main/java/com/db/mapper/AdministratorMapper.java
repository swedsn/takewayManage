package com.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.db.entity.Administrator;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author swedsn
 * @version 1.0
 * @date 2023-05-24 10:22
 */

@Repository
@Mapper
public interface AdministratorMapper extends BaseMapper<Administrator> {

    @Select("select * from administrator where username=#{username} and passwd=#{passwd}")
    Administrator login(Administrator administrator);
}
