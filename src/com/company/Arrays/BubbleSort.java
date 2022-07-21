package com.company.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    private static void bubbleSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            boolean isSorted = true;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    swap(arr, i, j);
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
            }
        }
    }

    private static void swap(int []arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of the Array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter " + n + " Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);
        System.out.println("Array After Sorting: " + Arrays.toString(arr));
    }

}
