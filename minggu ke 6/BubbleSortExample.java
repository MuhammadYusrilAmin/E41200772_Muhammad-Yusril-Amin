package wdsi_mingguke6;

public class BubbleSortExample {

    static void bubbleSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int n = arr.length;
        int temp = 0;
        System.out.println("Proses Sorting :");
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.println("A : " + arr[j] + " > " + "B : " + arr[j + 1]);
                if (arr[j] > arr[j + 1]) {
                    //swap the elements
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {7, 2, 12, 8, 3};
        System.out.println("Array Before Bubble Sort : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();

        bubbleSort(arr);

        System.out.println("Array After Buble Sort : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
