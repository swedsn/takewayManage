package com.db.service.impl;

import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.db.entity.Administrator;
import com.db.mapper.AdministratorMapper;
import com.db.mapper.UserMapper;
import com.db.service.AdministratorService;
import com.db.util.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author swedsn
 * @version 1.0
 * @date 2023-05-24 10:24
 */

@Service
public class AdministratorServiceImpl extends ServiceImpl<AdministratorMapper, Administrator> implements AdministratorService {

    @Autowired
    private AdministratorMapper administratorMapper;

    @Override
    public Administrator login(Administrator administrator) {
        return administratorMapper.login(administrator);
    }

    public boolean veifyAdministrator(String token){
        DecodedJWT decodedJWT = JwtUtils.getClaimsByToken(token);
        if (decodedJWT == null){
            return false;
        }
        String role = decodedJWT.getClaim("role").asString();
        return "administrator".equals(role);
    }

}
