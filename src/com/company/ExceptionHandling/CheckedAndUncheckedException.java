package com.company.ExceptionHandling;
import java.io.*;
class LowBalanceException extends Exception{
    public String toString(){
        return "Balance Should Not be Less than 2000";
    }
}

public class CheckedAndUncheckedException {

    static  void fun(){
        try {
            throw new LowBalanceException();
        }
        catch (LowBalanceException e){
            System.out.println(e);
        }
    }
    static void fun1(){
        try {
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
        fun();
    }
    static void fun2(){
        fun1();
    }
    static void fun3(){
        fun2();
    }
    public static void main(String []args){
        fun3();
    }
}
