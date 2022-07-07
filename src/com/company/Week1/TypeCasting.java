package com.company.Week1;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // It is of Two types Widening and Narrow
        int a = 9;
        double b = a; // Automatic Type Casting
        System.out.println(a + " " + b);

        double c = 8;
        int d = (int)c; // Manual Type casting
        System.out.println(d);
    }
}
