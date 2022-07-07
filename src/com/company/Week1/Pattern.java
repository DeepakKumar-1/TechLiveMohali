package com.company.Week1;

import java.util.Scanner;

public class Pattern {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int n = sc.nextInt();
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
