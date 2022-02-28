package com.samarth;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] arr={5,0,0,2,1,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }

    static int removeDuplicates(int[] nums) {
        int index = 0;
        for(int itr = 1; itr < nums.length; itr++) {
            if(nums[itr] != nums[index]) {
                index++;
                nums[index] = nums[itr];
            }
        }
        return (index + 1);
    }
}
