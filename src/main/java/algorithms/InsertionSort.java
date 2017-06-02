package algorithms;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] numbers) {
        for(int j = 1; j < numbers.length; j++) {
            int key = numbers[j];
            int i = j - 1;
            while(i >= 0 && numbers[i] > key) {
                numbers[i + 1] = numbers[i];
                i = i - 1;
            }
            numbers[i + 1] = key;
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] a = {5, 2, 4, 6, 1, 3};
        System.out.println(Arrays.toString(insertionSort(a)));
    }
}
