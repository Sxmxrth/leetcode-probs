package com.samarth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        Scanner sc= new Scanner(System.in);
        int target= 2;
        System.out.println(searchInsert(arr,target));
    }
    static int searchInsert(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(end>=start){
            int mid= start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
            if(arr[mid]<target){
                start=mid+1;
            }
        }
        return start;

    }
}
