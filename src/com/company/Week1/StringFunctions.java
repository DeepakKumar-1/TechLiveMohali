package com.company.Week1;
import java.lang.*;


public class StringFunctions {
    public static void main(String[] args) {
        String  str= "Deepak";
        StringBuilder builder = new StringBuilder();
        builder.append(str);
        // String Buffer
        StringBuffer buffer = new StringBuffer();
        buffer.append(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(builder.reverse());
        System.out.println(buffer.reverse());
        System.out.println(str.replace("eepak", "ivyansh"));
        System.out.println(str.lastIndexOf("e"));
        System.out.println(str.indexOf("e"));
        System.out.println(str.charAt(1));
        System.out.println(str.length());
        System.out.println(str.substring(4, 6));
        System.out.println(str.concat("Kumar"));
        System.out.println(str.trim());
//        System.out.println(str.contains("p"));
    }
}
