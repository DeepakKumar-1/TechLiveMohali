package com.company.Arrays;

import java.util.Scanner;

public class OneDimensionArray {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // Array Traversal
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
}
