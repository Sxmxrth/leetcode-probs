package com.samarth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter a number=");
        Scanner sc = new Scanner(System.in);
        int nums= sc.nextInt();;
        System.out.println(isPerfectSquare(nums));
    }

    static boolean isPerfectSquare(int nums) {
        long start=0;
        long end=nums/2;
        if(nums==0 || nums==1){
            return true;
        }
        while(start<=end){
            long mid=start+(end-start)/2;
            if(mid*mid==nums){
                return true;
            }
            if(mid*mid>nums){
                end=mid-1;
            }
            if(mid*mid<nums){
                start=mid+1;
            }
        }
        return false;
    }
}
