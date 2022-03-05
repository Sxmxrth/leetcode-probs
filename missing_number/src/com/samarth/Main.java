package com.samarth;
//https://leetcode.com/problems/missing-number/
public class Main {

    public static void main(String[] args) {
	    int[] nums={3,0,1};
        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1))/2;
        for(int i:nums){
            sum-=i;
        }

        return sum;
    }
}
