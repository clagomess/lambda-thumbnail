package com.github.clagomess.lambdaThumbnail.util;

import lombok.extern.slf4j.Slf4j;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Slf4j
public class FormatUtil {
    public static String formatMd5(byte[] str){
        String toReturn = null;

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            toReturn = String.format("%032x", new BigInteger(1, md.digest(str)));
        } catch (NoSuchAlgorithmException e) {
            log.warn(FormatUtil.class.getName(), e);
        }

        return toReturn;
    }

    public static String formatMd5(String str) {
        return formatMd5(str.getBytes());
    }
}
