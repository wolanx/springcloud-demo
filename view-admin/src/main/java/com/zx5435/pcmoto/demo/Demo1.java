package com.zx5435.pcmoto.demo;

import cn.hutool.crypto.digest.DigestUtil;

public class Demo1 {

    public static void main(String[] args) {

        String a = DigestUtil.md5Hex("12341234qwerqwer");

        String b = DigestUtil.md5Hex(a);
        System.out.println("b = " + b);

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);

    }

}

enum Status {

}
