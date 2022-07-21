package com.company.String;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class StringMethods {
    public static void main(String []args){
        String str = "  Deepak Kumar ";
        boolean contains = str.contains("e");
        int len = str.length();
        String subString = str.substring(3, 7);
       byte []bytes = str.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes));
        String str1 = str.toLowerCase(Locale.ROOT);
        String str2 = str.toUpperCase(Locale.ROOT);
        char []ch = str.toCharArray();
        boolean equals = str.equals("Raj");
        char ch1 = str.charAt(1);
        boolean isEmpty = str.isEmpty();
        String str3 = str.replaceAll("e", "f");
        boolean startsWith = str.startsWith("D");
        int compareTo = str.compareTo("raj");
        String str4 = str.concat("Yadav");
        String str5 = str.trim();
        String []arr = str.split("e", 7);
        System.out.println(Arrays.toString(arr));
        CharSequence ch4 = str.subSequence(0, 6);
        System.out.println(ch4);
    }
}
