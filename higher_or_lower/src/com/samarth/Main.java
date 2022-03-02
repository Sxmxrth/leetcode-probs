package com.samarth;

public class Main {

    public static void main(String[] args) {
	    int n=100;
        int a=68;
        System.out.println(guessNumber(n));
    }
    static int guess(int num){
        if(num==68){
            return 0;
        }
        if(num>68){
            return -1;
        }
        return 1;
    }

    static int guessNumber(int n) {
        int start=1;
        int end=n;
        int num=0;
        while(end>=start){
            num=start+(end-start)/2;
            if(guess(num)==0){
                return num;
            }
            if(guess(num)==1){
                start=num+1;
            }
            if(guess(num)==-1){
                end=num-1;
            }
        }
        return num;
    }
}
