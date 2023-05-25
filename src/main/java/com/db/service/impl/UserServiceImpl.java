package com.db.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.db.entity.User;
import com.db.mapper.UserMapper;
import com.db.service.UserService;
import com.db.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author swedsn
 * @version 1.0
 * @date 2023-05-24 15:56
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUsersByPage(Integer pageNum) {
        int numStart = (pageNum-1)*10;
        return userMapper.selectUsersByPage(numStart);
    }

    @Override
    public List<User> selectUsersByCondition(String telephone, String username, String address) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if (telephone != null && !telephone.isEmpty()) {
            queryWrapper.like("telephone", telephone);
        }
        if (username != null && !username.isEmpty()) {
            queryWrapper.like("username", username);
        }
        if (address != null && !address.isEmpty()) {
            queryWrapper.like("address", address);
        }
        System.out.println(userMapper.selectList(queryWrapper));
        return userMapper.selectList(queryWrapper);
    }

    @Override
    public User selectUserByPhone(String telephone) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("telephone", telephone);
        //userMapper.
        List<User> users = userMapper.selectByMap(map);
        return users.get(0);
    }

    @Override
    public Boolean addUser(User user) {
        user.setRole("user");
        user.setPasswd(MD5Utils.MD5Encode(user.getPasswd()));
        return userMapper.insert(user) !=0;
    }

    @Override
    public Boolean deleteUser(String telephone) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("telephone", telephone);
        return userMapper.deleteByMap(map) != 0;
    }

    @Override
    public Boolean modifyUser(User user) {
        UpdateWrapper<User> userUpdateWrapper = new UpdateWrapper<>();
        userUpdateWrapper.eq("telephone", user.getTelephone());
        return userMapper.update(user, userUpdateWrapper) != 0;
    }
}
