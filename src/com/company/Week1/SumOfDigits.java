package com.company.Week1;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int n = sc.nextInt();
        int ans = 0;
        while(n > 0){
            int rem = n%10;
            ans += rem;
            n /= 10;
        }
        System.out.println(ans);
    }
}
