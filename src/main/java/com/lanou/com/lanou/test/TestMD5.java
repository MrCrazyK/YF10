package com.lanou.com.lanou.test;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class TestMD5 {

    public static void main(String[] args) {

        try {
            String a = "我是周杰伦";
            MessageDigest  md = MessageDigest.getInstance("MD5");
            md.update(a.getBytes());
            byte[] bytes = md.digest();
//            BigInteger bigInteger = new BigInteger(1, bytes);
//            System.out.println(bigInteger.toString());
            char[] shiliu = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
//            char[] b = new char[]{'0','2'};
//            char[] c = new char[3];
            char mima[] = new char[bytes.length * 2];
            int k = 0;
            for (int i = 0; i < bytes.length;i ++){
                byte byte0 = bytes[i];
                System.out.println(byte0);
                mima[k++] = shiliu[byte0 >>> 4 & 0xf];
                mima[k++] = shiliu[byte0 & 0xf];
            }

            System.out.println(new String(shiliu));
            System.out.println(new String(mima));

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

    }

}
