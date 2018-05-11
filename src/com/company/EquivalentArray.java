package com.company;

public class EquivalentArray {
    public static void main(String[] args) {
        int arr1[]={1,0,1};
        int arr2[]={0,1,1};
        System.out.println(equivalentArray(arr1,arr2));
    }

    static int equivalentArray(int array1[],int array2[]){
        int count=0, count2=0;
        if((array1.length==0) || (array2.length==0))
            return 0;
        if(array1.length!=array2.length)
            return 0;
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array1.length;j++){
                if (array1[i] == array1[j]) {
                    count++;
                }

                if (array1[i] == array2[j]) {
                    count2++;
                }

            }
            if(count!=count2)
                return 0;
        }

        return 1;
    }
}
