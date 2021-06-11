package utils;

import java.util.Arrays;

import net.xinrenlei.sort.MergeSort;
import net.xinrenlei.sparsearray.sort;

public class RandomArray {

    public static int[] generateRandomArray(int maxSize, int maxValue){

        // Math.random() -> [0, 1) 所有小数， 等概率返回一个
        // Math.random() * N -> [0, N) 所有小数， 等概率返回一个
        // (int)(Math.random() * N) -> [0, N-1] 所有整数， 等概率返回一个


        int[] arr = new int[(int)((maxSize + 1) * Math.random())]; // 长度随机
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)((maxValue + 1) * Math.random()) - (int)((maxValue + 1) * Math.random());

        }
        return arr;
    }

    public static int[] copyArray(int[] arr){
        if (arr == null){
            return null;
        }

        int[] res = new int[arr.length];
        for (int i=0; i < arr.length; i++){
            res[i] = arr[i];
        }
        return arr;
    }

    public static boolean isEqual(int[] arr1, int[] arr2){
        if ((arr1 == null && arr2 == null) || (arr1 != null && arr2 == null)){
            return false;
        }

        if (arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++){
                if (arr1[i] != arr2[i]){
                    return false;
                }
            
            }
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args){
        
        int testTimes = 10;
        int maxSize = 10;
        int maxValue = 10;
        boolean success = true;
        for (int i=0; i < testTimes; i++){
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
//            sort.insertionSort(arr1);
            MergeSort.mergeSort(arr1);
            Arrays.sort(arr2);
            System.out.println(Arrays.toString(arr1));
            if (!isEqual(arr1, arr2)){
                System.out.println(Arrays.toString(arr1));
                System.out.println(Arrays.toString(arr2)); 
                success = false;
                break;
            }
        }
        System.out.println(success);
    }
}