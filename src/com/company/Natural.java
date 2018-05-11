package com.company;

public class Natural {
    public static void main(String[] args) {
        System.out.println(isNormal(16));
    }
    static int isNormal(int n){
//        int x=1;
        if(n%3==0 || n%5==0 || n%7==0)

            return 0;
        return 1;
    }

}
