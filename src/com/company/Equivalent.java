package com.company;

public class Equivalent {

    public static void main(String[] args) {
       int arr1[]={1,0,0};
       int arr2[]={0,1,0};
        System.out.println(equivalentArrays(arr1,arr2));

}
static int equivalentArrays(int a1[],int a2[]){

        if((a1.length==0) || (a2.length==0))
            return 0;
        if(a1.length!=a2.length)
            return 0;
        for(int i=0;i<a1.length;i++){
          if(count(a1,a1[i])!= count(a2, a1[i]))
              return 0;
        }
    return 1;
}

static int count(int a[], int x){
        int count=0;
        for(int y:a){
            if(y==x)
                count++;
        }

     /*   for(int y=0; y< a.length; y++){
            if(a[y] == x)
                count++;
        }*/

        return count;
}

}
