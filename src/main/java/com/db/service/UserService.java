package com.db.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.db.entity.User;

import java.util.List;

/**
 * @author swedsn
 * @version 1.0
 * @date 2023-05-24 15:56
 */
public interface UserService extends IService<User> {

    // 分页查询
    List<User> selectUsersByPage(Integer pageNum);

    // 按照条件查询
    List<User> selectUsersByCondition(String telephone, String username, String address);

    // 按照电话号码查询：手机号为唯一ID， 添加用户的手机号不能相同
    User selectUserByPhone(String telephone);

    // 查询所有用户
    //List<User> list();
    // 添加用户
    Boolean addUser(User user);

    Boolean deleteUser(String telephone);

    Boolean modifyUser(User user);
}
