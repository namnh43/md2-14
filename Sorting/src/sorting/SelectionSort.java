package sorting;

import java.util.Arrays;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void main(String[] args) {
        SelectionSort.selectionSort(list);
        System.out.println(Arrays.toString(list));
    }
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length; i ++) {
            int maxIndex = i;
            for (int j = i+1; j < list.length; j++) {
                if (list[j] > list[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {//swap element
                double temp = list[i];
                list[i] = list[maxIndex];
                list[maxIndex] = temp;
            }
        }
    }
}
