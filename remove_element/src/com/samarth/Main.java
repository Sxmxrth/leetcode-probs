package com.samarth;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int[] nums={0,1,2,2,3,0,4,2};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number=");
        int val=sc.nextInt();
        System.out.println(removeElement(nums,val));
    }

    static int removeElement(int[] nums,int val){
        int[] arr=new int[nums.length];
        int j=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=val){
                arr[j]=nums[i];
                j++;
            }
        }
        if(j<nums.length){
            for (int i = j; i < nums.length ; i++) {
                arr[i]=0;

            }
        }
        System.out.println(Arrays.toString(arr));
        return j;

    }
}
