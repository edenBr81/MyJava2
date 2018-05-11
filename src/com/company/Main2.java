package com.company;

    public class Main2 {

        public static void main(String[] args) {
            System.out.println(f((new int[]{1,2,3}),8));
      }

      static int f(int a[], int n){

        int sum=0;
        if (a.length>=n){
        for(int i=0;i<n;i++) {
            sum += a[i];
        }
        }else{
        int times=n/a.length;
        int remainder=n%a.length;
        for (int j=0;j<a.length;j++)

            sum+=a[j];
            sum=sum*times;
            for(int x=0; x<remainder; x++)
                sum+=a[x];
            }
        return sum;

        }

    }

