package com.raoyalong.array;

import org.junit.jupiter.api.Test;

/**
 * @author raoyalong
 * @create 2022 - 12 - 18 16:47
 */
public class BubbleSort {

    @Test
    public void sort() {

        int[] a = {3, 2, 1, 5, 4, 8 , 10, 9, 5};

        int temp = 0;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for (int i : a) {
            System.out.println(i);
        }
    }
}
