package net.xinrenlei.sort;

public class SmallSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 2, 5};
        int sum = process(arr, 0, arr.length-1);
        System.out.println(sum);

    }

    public static int process(int[] arr, int L, int R){

        if (L == R){
            return 0;
        }

        int mid = L + ((R - L) >> 1);
        return process(arr, L, mid) + process(arr, mid+1, R) + merge(arr, L, mid, R);
    }

    public static int merge(int[] arr, int L, int mid, int R){

        int[] help = new int[R - L + 1];

        int i = 0;
        int sum = 0;
        int p1 = L;
        int p2 = mid + 1;

        while (p1 <= mid && p2 <= R){
            sum += arr[p1] < arr[p2] ? arr[p1]*(R-p2+1):0;
            help[i++] = arr[p1] < arr[p2] ? arr[p1++]:arr[p2++];
        }

        if(p1 <= mid){
            help[i++] = arr[p1++];
        }

        if(p2 <= R){
            help[i++] = arr[p2++];
        }

        for (int j = 0; j < help.length; j++) {
            arr[L + j] = help[j];
        }
        return sum;
    }
}
