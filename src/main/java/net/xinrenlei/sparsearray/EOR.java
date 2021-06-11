package net.xinrenlei.sparsearray;

//一个数组有两个不同的数出现奇数次，其他数出现偶数次，求着两个数
public class EOR {
    public static void main(String[] args){
        int[] arr = new int[]{1, 1, 2, 3, 3, 4, 5, 5};
        printOddTimesNum2(arr);
    }

    public static void printOddTimesNum2(int[] arr){
        int eor = 0;
        int onlyone = 0;
        for (int curNum : arr){
            eor ^= curNum;
        }

        int rightOne = eor & (~eor + 1);
        for (int cur: arr){
            if ((cur & rightOne) == 0){
                onlyone ^= cur;
            }
        }

        System.out.println(onlyone + " " + (onlyone^eor));
        
    }
}