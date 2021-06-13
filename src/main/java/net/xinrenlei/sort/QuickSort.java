package net.xinrenlei.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = new int[]{4, 6, 3, 16, 12, 18, 25, 73, 9, 5};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr, int L, int R){

        if (L < R) {

            swap(arr, L + (int) Math.random() * (R - L + 1), R);
            int[] p = partition(arr, L, R);
            quickSort(arr, L, p[0] - 1);
            quickSort(arr, p[1]+1, R);

        }
    }

    public static int[] partition(int[] arr, int L, int R){
        int less = L-1;
        int more = R;
        while (L < more){
                if (arr[L] < arr[R]){
                    swap(arr, L++, ++less);
                }else if (arr[L] > arr[R]){
                    swap(arr, L, --more);
                }else{
                    L++;
                }
            }
        swap(arr, more, R);
        return new int[]{less+1, more};
    }

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
