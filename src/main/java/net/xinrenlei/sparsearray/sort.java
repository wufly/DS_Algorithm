package net.xinrenlei.sparsearray;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 2, 7, 5};
        insertionSort(arr);

    }

    // 插入排序
    public static void insertionSort(int[] arr){

        if  (arr == null || arr.length < 2){
            return ;
        }
        
        for (int i = 1; i < arr.length; i++){
            for (int j = i-1; j >= 0 && arr[j] > arr[j + 1]; j--){
                swap(arr, j, j+1);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}