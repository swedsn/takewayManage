package com.db.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.db.entity.Administrator;
import com.db.util.JwtUtils;

/**
 * @author swedsn
 * @version 1.0
 * @date 2023-05-24 10:23
 */

public interface AdministratorService extends IService<Administrator> {
    Administrator login(Administrator administrator);

    boolean veifyAdministrator(String token);
}
