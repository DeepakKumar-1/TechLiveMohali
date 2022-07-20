package com.company.ExceptionHandling;

import java.util.Scanner;

public class FinallyBlock {
    public static void main(String []args){
        try{
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = a/b;
            System.out.println(ans);
        }
        catch (ArithmeticException e){
            System.out.println("Divide By Zero");
        }
        finally {
            System.out.println("THANK YOU !! BYE");
        }
    }
}
