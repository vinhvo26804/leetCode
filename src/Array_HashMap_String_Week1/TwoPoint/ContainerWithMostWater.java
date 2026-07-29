package Array_HashMap_String_Week1.TwoPoint;

public class ContainerWithMostWater {
    public static int maxAre(int[] h){
        int l = 0;
        int r = h.length -1;
         int max =0;
          while(  l < r){
             int area = Math.min(h[l], h[r]) * (r-l);
             max =Math.max(area, max);
             if(h[l] < h[r]){
                 l++;

             }else {
                 r--;
             }
          }
          return  max;
    }

    public static void main(String[] args) {
        int[]  n = {1,7,3,2,8,9,6};
        int result = maxAre(n);
        System.out.print("max area: " + result);
    }
}
