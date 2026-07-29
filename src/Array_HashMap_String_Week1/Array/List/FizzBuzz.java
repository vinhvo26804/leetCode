package Array_HashMap_String_Week1.Array.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public static List<String> solve(int n){
        List<String>  result = new ArrayList<>();
        for(int i  =0; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                result.add("FizzBuzz");
            }else if(i % 3 == 0){
                result.add("FIzz");
            } else if ( i % 3 == 0) {
                result.add("Buzz");
            }else {
                result.add(String.valueOf(i));
            }
        }
return result;
    }

    public static void main(String[] args) {
        int n;
        Scanner  sc  = new Scanner(System.in);
        System.out.print("Nhập số: ");
        n = sc.nextInt();

        List<String> ans = solve(n);
        for(String x : ans){
            System.out.print(x + " ");
        }
    }
}
