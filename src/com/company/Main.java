package com.company;
import java.util.*;
class Main{

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any String: ");
        String str = sc.nextLine();
        String ans = "";
        for(int i=0; i<str.length(); ){
            char ch = str.charAt(i);
            if(i==0 && ch != ' ' || str.charAt(i-1) == ' '){
                if(ch >='A' && ch <='Z'){
                    ans += ch;
                } else{
                    ans += (char)(ch-32);
                }
            } else if(ch != ' '){
                if(ch >='a' && ch <='z'){
                    ans += ch;
                } else{
                    ans += (char)(ch+32);
                }
            }else{
                ans += ch;
            }
            i++;
        }
        System.out.println(ans);
    }
}