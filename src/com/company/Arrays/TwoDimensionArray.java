package com.company.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionArray {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int r = sc.nextInt();
        System.out.print("Enter Number of Columns: ");
        int c = sc.nextInt();
        int [][]matrix = new int[r][c];
        // Taking Elements Row Wise
        for(int row=0; row < matrix.length; row++){
            for(int col=0; col < matrix[0].length; col++){
                System.out.print("Enter " + matrix[0].length + " Elements: ");
                matrix[row][col] = sc.nextInt();
            }
        }

        // Traversal
        for(int []row : matrix){
            System.out.print(Arrays.toString(row));
        }
    }
}
