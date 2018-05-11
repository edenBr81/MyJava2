package com.company;

public class Dual {

    public static void main(String[] args) {
        System.out.println(f(new int[]{1, 2, 3, 0}));
    }

    static int f(int a[]) {

        int count = 0;
        if (a.length % 2 != 0)
            return 0;
        if (a.length > 0)
            count = a[0] + a[1];
        for (int i = 0; i < a.length - 1; i+=2) {

            if (a[i] % 2 == 0)
            if(a[i + 1] % 2 == 0)
                return 0;
            if (a[i] % 2 != 0)
            if(a[i + 1] % 2 != 0)
                return 0;
            if (count != a[i] + a[i + 1])
                return 0;
        }
            return 1;
        }
    }
