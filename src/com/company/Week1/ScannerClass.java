package com.company.Week1;
import java.util.Scanner;
public class ScannerClass {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        // take Name and age from the user
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        System.out.println("Your Name is " + name + "  Your Age is " + age);
    }
}
