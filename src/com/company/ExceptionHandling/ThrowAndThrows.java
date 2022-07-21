package com.company.ExceptionHandling;

import java.util.Scanner;

class NegativeDimensionsException extends Exception{
    public String toString(){
        return "Dimensions Should be Positive";
    }
}

public class ThrowAndThrows {
    public static void area(int a, int b) throws NegativeDimensionsException {
        if(a < 0 || b < 0){
            throw new NegativeDimensionsException();
        }
        System.out.println(a*b);
    }
    public static void rectangle(int a, int b){
        try {
            area(a, b);
        }catch (NegativeDimensionsException e){
            System.out.println(e.toString());
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        rectangle(a, b);
    }
}
