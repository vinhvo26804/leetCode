package Array_HashMap_String_Week1.Array;

public class IntersectionOfTwoArray {

        public static int[] intersection(int[] n1, int[] n2) {
            int ng = 0;
            int[] g = new int[Math.min(n1.length, n2.length)];
            for (int i = 0; i < n1.length; i++) {
                int flag = 0;
                for (int j = 0; j < n2.length; j++) {
                    if (n1[i] == n2[j]) {
                        flag = 1;

                        break;
                    }
                }

                int trung =0;
                for(int k =0; k < ng; k++){
                    if(g[k] == n1[i]){
                        trung =1;
                        break;
                    }
                }

                if (flag == 1 && trung ==0) {
                    g[ng] = n1[i];
                    ng++;
                }
            }
            int[] rel = new int[ng];
            for (int i = 0; i < ng; i++) {
                rel[i] = g[i];
            }

            return rel;
        }

        public static void main(String[] args) {

            int[] a = {1, 2, 3, 4};
            int[] b = {3, 4, 5, 6};

            int[] ans = intersection(a, b);

            for (int x : ans) {
                System.out.print(x + " ");
            }
        }
    }

