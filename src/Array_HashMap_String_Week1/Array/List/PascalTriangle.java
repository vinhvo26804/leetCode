package Array_HashMap_String_Week1.Array.List;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static List<List <Integer>> generate(int numRows){
        List<List<Integer>> result = new ArrayList<>();

        for(int r = 0; r < numRows; r++){
            List<Integer> row = new ArrayList<>();

            for(int c = 0; c<= r; c++){
                if(c  == 0 || c == r ){
                    row.add(1);
                }else{
                    List<Integer> prev = result.get(r-1 );
                    int value = prev.get(c-1)+ prev.get(c);

                row.add(value);
                }

            }
              result.add(row);
        }
        return result;


    }

    public static void main(String[] args) {
        int numRows;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        numRows = sc.nextInt();
        List<List<Integer>> result = generate(numRows);
        for(List<Integer> x : result){
            System.out.println(x);
        }
    }

}
