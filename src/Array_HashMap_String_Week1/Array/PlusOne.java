package Array_HashMap_String_Week1.Array;

public class PlusOne {

    public static int[] plusOne(int[] n) {

        for (int i = n.length - 1; i >= 0; i--) {

            if (n[i] < 9) {
                n[i]++;
                return n;
            }

            n[i] = 0;
        }

        int[] result = new int[n.length + 1];
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {

        int[] n = {9, 9, 9};

        int[] kq = PlusOne.plusOne(n);

        for (int x : kq) {
            System.out.print(x + " ");
        }
    }
}