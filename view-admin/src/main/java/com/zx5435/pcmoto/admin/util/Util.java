package com.zx5435.pcmoto.admin.util;

import org.springframework.util.DigestUtils;

public class Util {

    public static String calcPwd(String password, String salt) {
        String a = DigestUtils.md5DigestAsHex(password.getBytes());

        return DigestUtils.md5DigestAsHex((a + salt).getBytes());
    }

}
