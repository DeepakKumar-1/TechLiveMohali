package com.company.Week1;

public class PerfectNumbers {
    public static void main(String[] args) {
        // perfect number between 1 to 500
        for(int i=1; i<=500; i++){
            int sum = 0;
            for(int j=1; j<i; j++){
                if(i%j == 0){
                    sum+=j;
                }
            }
            if(sum == i){
                System.out.println(i);
            }
        }
    }
}
