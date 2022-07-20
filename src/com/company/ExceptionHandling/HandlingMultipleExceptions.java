package com.company.ExceptionHandling;

import java.util.Scanner;

public class HandlingMultipleExceptions {
    public static void main(String []args){
        try{
            int []arr = {1, 2, 3, 0, 6, 7, 8};
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Two Numbers Between 0 to 6: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int div = arr[a]/ arr[b];
            System.out.println(div);
        }
        catch (ArithmeticException e){
            System.out.println("Divide By Zero Exception");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please Enter Number Between 0 to 6");
        }
    }
}
