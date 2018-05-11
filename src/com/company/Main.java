package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isCummulative(new int[]{1, 1, 2,}));
        System.out.println(isCummulative(new int[]{}));
    }

    static int isCummulative(int[] a) {

        if (a.length <= 1)
            return 0;

        for (int i = 1; i < a.length; i++) {
            int sum = 0;
            sum += a[i];

            for (int j = 0; j < i; j++) {
                sum += a[j];
            }
                if (sum != a[i])
                    return 0;
            }
                    return 1;
                }
            }


