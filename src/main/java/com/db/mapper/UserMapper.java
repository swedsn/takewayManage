package com.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.db.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @author swedsn
 * @version 1.0
 * @date 2023-05-24 11:17
 */

@Repository
public interface UserMapper extends BaseMapper<User> {
    @Select("select * from user limit #{numStart},10")
    List<User> selectUsersByPage(int numStart);

}
