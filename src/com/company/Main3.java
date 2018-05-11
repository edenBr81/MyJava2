package com.company;

public class Main3{

    public static void main(String[] args) {
        System.out.println(f(23,5));
    }

   static int f(int n,int count){

        if((isPrime(n)==false)|| (n==0))
             return 0;
    else
        for(int i=n+1; i<=n+count; i++){
        if(isComposite(i)==false)
            return 0;
        }
        return 1;

    }
   static boolean isPrime(int number){

        for(int i=2;i<number;i++) {
            if (number % i == 0)

                return false;
        }
                return true;
            }

            public static boolean isComposite(int number){
                for (int i = 2; i<number; i++) {

                    if (number % i == 0)

                        return true;
                }
                return false;
            }
        }
