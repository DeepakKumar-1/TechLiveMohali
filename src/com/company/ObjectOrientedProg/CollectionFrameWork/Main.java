package com.company.ObjectOrientedProg.CollectionFrameWork;

import java.util.*;

public class Main {
    public static void main(String [] args){
        List <Integer> list1 = new ArrayList<>();
        List <Integer> list = new LinkedList<>();
        list.add(12);
        list.add(17);
        list.add(14);
        System.out.println(list);

        List <Integer> vector = new Vector<>();
        vector.add(74);
        vector.add(55);
        vector.add(34);
        System.out.println(vector);
    }
}
