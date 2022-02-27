package com.samarth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter a number=");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(reverse(n));
    }
    static int reverse(int n){
        int k=0;
        if(n<0){
            n=n*-1;
            k=k+1;
        }
        int s=0, a;

        while(n>0){
            a=n%10;
            n=n/10;
            if(s> (Integer.MAX_VALUE-1)/10){
                return 0;
            }
            s=(s*10)+a;
        }
        if(k==1){
            return -1*s;
        }
        return s;
    }
}
