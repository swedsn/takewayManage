package com.db;

import com.db.entity.Administrator;
import com.db.entity.User;
import com.db.mapper.AdministratorMapper;
import com.db.mapper.UserMapper;
import com.db.service.GoodsService;
import com.db.service.UserService;
import com.db.util.MD5Utils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;

@SpringBootTest
class TakewayManageApplicationTests {
    //@Autowired(required = false)
    //private AdministratorMapper administratorMapper;
    //@Test
    //void contextLoads() {
    //    // 参数是一个wrapper,条件构造器，不用未null
    //    List<Administrator> administrators = administratorMapper.selectList(null);
    //    administrators.forEach(System.out::println);
    //}

    //@Autowired
    //private UserMapper userMapper;
    //
    //@Autowired
    //private UserService userService;
    //@Test
    //void contexLogin(){
    //    HashMap<String, Object> map = new HashMap<>();
    //    map.put("telephone", "15722013706");
    //    List<User> users = userMapper.selectByMap(map);
    //    users.forEach(System.out::println);
    //}

    //@Test
    //void md5Test(){
        //System.out.println(MD5Utils.MD5Encode("zhangsan"));
        //System.out.println(MD5Utils.MD5Encode("lisi"));
        //System.out.println(MD5Utils.MD5Encode("wangwu"));
        //System.out.println(MD5Utils.MD5Encode("zhaoliu"));
        //System.out.println(MD5Utils.MD5Encode("sunqi"));
        //System.out.println(MD5Utils.MD5Encode("zhouba"));
        //System.out.println(MD5Utils.MD5Encode("wujiu"));
        //System.out.println(MD5Utils.MD5Encode("zhengshi"));
        //System.out.println(MD5Utils.MD5Encode("swedsn"));
        //System.out.println(MD5Utils.MD5Encode("admin"));
        //System.out.println(MD5Utils.MD5Encode("test"));
    //}


    //@Autowired
    //GoodsService goodsService;
    //@Test
    //void IDTest(){
    //    //System.out.println(goodsService.deleteGoods(1));
    //}

}
