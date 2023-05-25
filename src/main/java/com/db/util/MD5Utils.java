package com.db.util;

import org.springframework.util.DigestUtils;

/**
 * @author swedsn
 * @version 1.0
 * @date 2023-05-24 22:18
 */
public class MD5Utils {

    //MD5加密
    public static String MD5Encode(String passwd) {
        String salt = "kjfcsddkjfdsajfdiusf8743urf";
        return DigestUtils.md5DigestAsHex((salt+ passwd).getBytes());
    }
}
