package Array_HashMap_String_Week1.TwoPoint;

public class SquareOfASortedArray {
    public static int[] solve(int[] n){
        int l =0;
        int r = n.length -1;
        int pos = n.length-1;
        int[]  result = new int[n.length];

        while (l <= r){
            int sl = n[l] * n[l];
            int sr = n[r] *  n[r];



            if( sl < sr){

                result[pos] = sr;
                r--;
            }else{
                result[pos] = sl;
                l++;

            }
            pos--;
        }

return result;
    }

    public static void main(String[] args) {
        int[] n = {-4, 2,1 ,3,4};

        int[] anw = solve(n);
        for(int x: anw){
            System.out.print(x + " ");
        }
    }
}