package Array_HashMap_String_Week1.TwoPoint;

public  class RotateArray {
    public static void reserve(int[] n, int l, int r) {

        while (l < r) {
            int temp = n[l];
            n[l] = n[r];
            n[r] = temp;

            l++;
            r--;
        }
    }

    public static int[] rotateArray(int[] n, int k) {
        if (n.length == 0) {
            return n;

        }
        k = k % n.length;
        reserve(n, 0, n.length - 1);
        reserve(n, 0, k - 1);
        reserve(n, k, n.length - 1);

        return n;
    }


    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        RotateArray.rotateArray(n, k);
        for (int i : n) {
            System.out.print(i+  " ");
        }
    }
}