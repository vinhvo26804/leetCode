package Array_HashMap_String_Week1.Array.List;

import java.util.ArrayList;
import java.util.List;

public class SumaryRanges {
    public static List<String> sumaryRanges(int[] n) {
        List<String> solve = new ArrayList<>();
        if(n.length ==0){
            return solve;
        }
        int i = 0;
        int end = 0;
        while (i < n.length) {
            int start = n[i];
            while (i + 1 < n.length && n[i + 1] - n[i] == 1) {
                i++;
            }
            end = n[i];
            if (start == end) {
                solve.add(String.valueOf(start));
            } else {
                solve.add(String.valueOf(start) + "->" + String.valueOf(end));
            }
            i++;

        }
            return solve;



    }


    public static void main(String[] args) {
        int[] n ={0,1,2,3,6,7,9,10};
        List<String > answ = sumaryRanges(n);
        for(String x : answ)
        System.out.println(x);
    }
}

