package net.xinrenlei.sort;

/*
给定一个整数数组，给定一个值K，这个值在原数组中一定存在，要求把数组中小于K的元素放到数组的左边，大于K的元素放到数组的右边，
等于K的元素放到数组的中间，最终返回一个整数数组，其中只有两个值，分别是等于K的数组部分的左右两个下标值。

例如，给定数组：[2, 3, 1, 9, 7, 6, 1, 4, 5]，给定一个值4，那么经过处理原数组可能得一种情况是：[2, 3, 1, 1, 4, 9, 7, 6, 5]，
需要注意的是，小于4的部分不需要有序，大于4的部分也不需要有序，返回等于4部分的左右两个下标，即[4, 4]


 */

import java.util.Arrays;

public class NetherLandsFlag {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 9, 7, 6, 1, 4, 5};
        System.out.println(Arrays.toString(process(arr, 4)));
        System.out.println(Arrays.toString(arr));

    }

    public static int[] process(int[] arr, int num){
        int i = 0;  // 左边下标
        int j = arr.length-1;  // 右边下标
        int k = 0;
        while (k < j) {
            if (arr[k] < num){
                swap(arr, k, i);
                i++;
                k++;
            } else if (arr[k] == num){
                k++;
            } else{
                swap(arr, k, j);
                j--;
            }
        }
        return new int[]{i, j-1};

    }

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
