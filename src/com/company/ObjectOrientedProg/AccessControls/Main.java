package com.company.ObjectOrientedProg.AccessControls;

import java.util.Arrays;

public class Main {
    public static void main(String [] args){
        A obj = new A(1, "Deepak Kumar", new int[]{1,2,3});
        System.out.println(Arrays.toString(obj.arr));
        // Need to do Few Things
        // 1. Access the Data Members
        // 2. Modify the data Members

//        System.out.println(obj.num);  // ERROR Because num is Private
        System.out.println(obj.getNum());
    }
}
