package com.company;

public class Sorted {

    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{1, 2, 5, 8}));
    }

    static int isSorted(int a[]) {
      int asc=0;
      int des=0;

      for (int i=0;i<a.length-1;i++){
          if(a[i]<a[i+1]){
              asc++;
          }else if(a[i]>a[i+1]){
              des++;
          }
      }
      if((asc==(a.length-1)) || (des==(a.length-1))){
          return 1;
      }
      return 0;
    }
}