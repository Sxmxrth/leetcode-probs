package com.samarth;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] nums1={1};
        int[] nums2={0};
        int m=1;
        int n=0;
        merge(nums1, m, nums2, n);
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0;
        for (int i = m; i <m+n ; i++) {
            nums1[i]=nums2[k];
            k++;
        }
        boolean swapped;
        for (int i = nums1.length-1; i >0 ; i--) {
            swapped=false;
            for (int j = 0; j <i ; j++) {
                if(nums1[j]>nums1[j+1]){
                    nums1[j]=nums1[j]+nums1[j+1];
                    nums1[j+1]=nums1[j]-nums1[j+1];
                    nums1[j]=nums1[j]-nums1[j+1];
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
