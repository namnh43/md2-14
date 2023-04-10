package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5,2,5,11};

    public static void main(String[] args) {
        InsertionSort.insertionSort(list);
        System.out.println(Arrays.toString(list));
    }

    public static void insertionSort(double[] list) {
        for (int i = 1; i < list.length; i++) {
            int pos = i;
            double num = list[pos];
            while (pos > 0 && num < list[pos - 1]) {
                //shift 1 pos to right
                list[pos] = list[pos-1];
                pos--;
            }
            if (pos != i) {
                list[pos] = num;
            }
        }
    }
}
