package com.company.Week1;

import java.util.Scanner;

public class Functions {
    public static void fun(){
        System.out.println("I Just got Executed");
    }

    public static void func(String name){
        System.out.println(name + "  is a Java Student");
    }
    public static void multiPara(String name, int age){
        System.out.println(name + " is of " + age + " years Old.");
    }
    public static int add(int a, int b){
        return a+b;
    }
    // Method Overloading
    public static float add(float a, float b){
        Scanner sc = new Scanner(System.in);
        int c =  sc.nextInt();
        System.out.println(c);
        return a+b;
    }
    // Recursion
    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n+factorial(n-1);
    }
    // fibonacci Number
    public static int fib(int n){
        if(n <= 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(add(2.6f, 4.9f));
    }
}
