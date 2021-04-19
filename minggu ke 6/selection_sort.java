package wdsi_mingguke6;

import java.util.Arrays;

public class selection_sort {

    void sort(int[] arrA) {
        System.out.println("Array Before Selection Sort : " + Arrays.toString(arrA));
        System.out.println();
        System.out.println("Proses Sorting :");
        for (int i = 0; i < arrA.length; i++) {
            //mengambil element terkecil dalam index 
            int minIndex = getMinIndex(i, arrA);
            System.out.println("A : " + arrA[i] + " > " + "B : " + arrA[minIndex]);
            //swap
            int temp = arrA[minIndex];
            arrA[minIndex] = arrA[i];
            arrA[i] = temp;
        }
        System.out.println();
        System.out.println("Array After Selection Sort : " + Arrays.toString(arrA));
    }

    int getMinIndex(int startIndex, int[] arrA) {
        int minIndex = startIndex;
        for (int i = startIndex + 1; i < arrA.length; i++) {
            if (arrA[minIndex] > arrA[i]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] arrA = {7, 2, 12, 8, 3};
        new selection_sort().sort(arrA);
    }
}
