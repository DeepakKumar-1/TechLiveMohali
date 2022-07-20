package com.company.ExceptionHandling;

import java.util.Scanner;

public class Division {
    public static void main(String []args){
        int a, b, res;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        try {
            res = a/b;
            System.out.println("Result: " + res);
        }
        catch (ArithmeticException e){
            System.out.println("Divide by Zero");
//            System.out.println(e.getMessage());
        }
    }
}
