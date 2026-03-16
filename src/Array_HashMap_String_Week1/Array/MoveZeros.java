package Array_HashMap_String_Week1.Array;

public class MoveZeros {
    public static void moveZeros(int[] nums) {
        int k =0;
        for(int i = 0; i < nums.length; i++){
             if(nums[i] != 0 ){
                 nums[k] = nums[i];
                  k++;
             }
         }
        if ( k >= nums.length){
            nums[k] =0;
            k++;

        }
    }

    public static void  moveZerosUseTwoPoints(int[] nums){
        int left =  0;
        int right = nums.length-1;
        int k =0;
        for(int i =0; i<=right; i++ ){
            if(nums[i] ==0) {
                nums[right] = nums[i];
                right--;
            }else {
                nums[left] = nums[i];
                right--;

            }
        }


    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZerosUseTwoPoints(nums);
        for( int  i : nums){
            System.out.print(i + " ");
        }

    }
}
