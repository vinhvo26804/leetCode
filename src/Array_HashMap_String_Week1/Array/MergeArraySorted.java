package Array_HashMap_String_Week1.Array;

import java.util.Arrays;

public class MergeArraySorted {
    public  static  void  Merge(int[] num1, int m, int[] num2, int n) {
        for(int i =0; i < n; i++){
            num1[m+1] = num2[i];


        }
        Arrays.sort(num1);
    }

    public static void main(String[] args) {

        int[]  num1 = {2,5,6};
        int m = num1.length;
        int[] num2 = {3};
        int n = num2.length;
        Merge(num1, m, num2,n);


    }
}
