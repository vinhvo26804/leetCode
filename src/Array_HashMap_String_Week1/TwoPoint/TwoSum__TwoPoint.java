package Array_HashMap_String_Week1.TwoPoint;

public class TwoSum__TwoPoint {
    public static int[] twoSum(int[] n, int t) {
        int l = 0;
        int r = n.length - 1;

        while (l < r) {
            if (n[l] + n[r] > t) {
                r--;
            } else if (n[l] + n[r] < t) {
                l++;
            } else {
                return new int[]{1+l, r+1};
            }

        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] n = {0,1,2,3,5,6,7,8};
        int t =9;
        int[] result = twoSum(n,t);
        System.out.print(result[0] + " " + result[1]);
    }
}


