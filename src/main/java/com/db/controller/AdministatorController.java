package com.db.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.db.entity.Administrator;
import com.db.service.AdministratorService;
import com.db.util.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author swedsn
 * @version 1.0
 * @date 2023-05-24 10:23
 */

@RestController
@CrossOrigin
public class AdministatorController {

    @Autowired
    private AdministratorService administratorService;

    @GetMapping("/login")
    public JSON login(Administrator administrator){
        Administrator administrator1 = administratorService.login(administrator);
        JSONObject str = new JSONObject();
        if (administrator1 != null) {
            String token = JwtUtils.generateToken(administrator1);
            str.put("status", true);
            str.put("username", administrator.getUsername());
            str.put("token", token);
        }
        else {
            str.put("status", false);
        }
        return str;
    }
}
