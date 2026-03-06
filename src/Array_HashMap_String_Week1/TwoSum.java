package Array_HashMap_String_Week1;

import java.util.HashMap;

public class TwoSum {
    public static int[] solve(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i <nums.length; i++){
            int res = target -nums[i];
            if(map.containsKey(res)){
                return new int[] {
                        map.get(res),i
                };
            }
            map.put(nums[i],i );
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 11};
        int target = 7;
        int[] result = solve(nums, target);
        System.out.printf(result[0] + " " + result[1]);
    }
}




