package com.samarth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("enter a number= ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(mySqrt(a));
    }

    static int mySqrt(int a) {
        if(a==0 || a==1){
            return a;
        }
       long start=0;
       long end=a/2;
       long mid=0;
       while(end>=start){
           mid= start+ (end-start)/2;
           if(mid*mid>a){
               end=mid-1;

           }
           if(mid*mid<a){
               start=mid+1;
           }
           if(mid*mid==a){
               return (int)mid;
           }
       }
        return (mid * mid > a) ? (int)mid-1 : (int)mid;

    }
}
