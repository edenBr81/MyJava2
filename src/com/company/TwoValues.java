package com.company;

import static com.company.Equivalent.count;

public class TwoValues {
    public static void main(String[] args) {
        System.out.println(TwoValues(new int []{1,1,1,1,1,2,2}));
    }
    static int TwoValues(int a[]){
        int n1=0,n2=0;
        int c1=0,c2=0;
        n1=a[0];
        if (a.length==0)
            return 0;

        for(int x:a) {

            if (n1 != x)
                n2 = x;
        }
            c1=count(a,n1);
            c2=count(a,n2);

            if(c1==0)
                return 0;
            if(a.length==c1+c2)
                return 1;

        else
            return 0;
        }

       static int count(int a[],int x){
            int count=0;
            for(int y:a){
                if(y==x)
                    count++;
            }
          return count;

        }
    }


