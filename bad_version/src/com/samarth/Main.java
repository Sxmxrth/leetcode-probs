package com.samarth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter a number=");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter the bad version=");
        int n=sc.nextInt();
        System.out.println(firstBadVersion(n));
    }
    static boolean isBadVersion(int mid, int n){
        if(mid>=n){
            return true;
        }
        return false;
    }
    static int firstBadVersion(int n){
        int start=1;
        int end=n;
        int mid=0;
        while(end>=start){
            mid= start+(end-start)/2;
            if(isBadVersion(mid, n)){
                end=mid-1;
            }
            if(!isBadVersion(mid, n)){
                start=mid+1;
            }
        }
        return start;
    }
}
