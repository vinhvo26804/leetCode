package Array_HashMap_String_Week1.HashTable;

public class MajorityElement {
    public static int majorityElement(int[] num) {
        int count = 0;
        int cadidate = 0;
        for (int i = 0; i < num.length; i++) {
            if (count == 0) {
                cadidate = num[i];
            }
            if (cadidate == num[i]) {
                count++;

            } else {
                count--;
            }

        }
        return cadidate;
    }

    public static void main(String[] args) {
        int num[] = {3,1,1,1,2,2,3,3,2,2};
        int kq = majorityElement(num);
        System.out.print(kq);
    }
}

