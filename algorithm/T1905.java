package com.org;

import java.util.*;

/**
 * @Author： wangdl
 * @Data： 2020/10/31 0031
 */
public class deleteString {

    public static void main(String[] args) throws Exception {
        String S1 = "They are students";
        String S2 = "aeiou";
        Long l1 = System.currentTimeMillis();
        System.out.println(delete(S1, S2));
        Long l2 = System.currentTimeMillis();
        System.out.println(delete2(S1, S2));
        Long l3 = System.currentTimeMillis();

        System.out.println(l2 - l1);
        System.out.println(l3 - l2);
    }

    private static String delete(String str, String sub) {
        for (int j = 0; j <= 100; j++) {
            StringBuffer stringBuilder = new StringBuffer();
            for (int i = 0; i < str.length(); i++) {
                //如果str2中不包含str1.charAt[i],就将这个字符添加到list中
                if (!sub.contains(String.valueOf(str.charAt(i)))) {
                    stringBuilder.append(str.charAt(i));
                }
            }
        }
        return null;
    }

    private static String delete2(String str, String sub) {
        for (int j = 0; j <= 100; j++) {
            int[] tmp = new int[256];
            for (int i = 0; i < sub.length(); i++) {
                tmp[sub.charAt(i)]++;
            }
            StringBuffer stringBuilder = new StringBuffer();
            for (int i = 0; i < str.length(); i++) {
                if (tmp[str.charAt(i)] == 0) {
                    stringBuilder.append(str.charAt(i));
                }
            }
        }
        return null;
    }
}
