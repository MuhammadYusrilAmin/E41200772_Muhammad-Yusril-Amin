package wdsi_mingguke6;

import java.util.Arrays;

public class buble_optimized {

    static void sort(int[] arrA) {
        if (arrA == null || arrA.length == 0) {
            return;
        }

        System.out.println("Original Array: " + Arrays.toString(arrA));
        int size = arrA.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                //check the adjacent elements
                System.out.println("A : " + arrA[j] + " > " + "B : " + arrA[j + 1]);
                if (arrA[j] > arrA[j + 1]) {
                    //swap the elements
                    int temp = arrA[j];
                    arrA[j] = arrA[j + 1];
                    arrA[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arrA));
    }

    public static void main(String[] args) {
        int[] arrA = {7, 2, 12, 8, 3};
        sort(arrA);
    }
}
