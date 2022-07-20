package com.company.ExceptionHandling;

import java.util.Scanner;

public class MultipleExceptionUsingNestedBlocks {
    public static void main(String []args){
        try{
            Scanner sc = new Scanner(System.in);
            try{
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a/b);
            }
            catch (ArithmeticException e){
                System.out.println("Divide By Zero");
            }
            int []arr  = {0, 1, 2, 3, 4, 5};
            System.out.println("Enter Any Number between 0 to 5");
            int i = sc.nextInt();
            System.out.println(arr[i]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please Enter Number Only Between 0 to 5");
        }
    }
}
