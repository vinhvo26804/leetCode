package Array_HashMap_String_Week1.HashTable;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean solve(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<nums.length; i++){
             int res = nums[i];
            if(map.containsKey(res)) {
                return true;
        }
        map.put(res,i);
    }
            return false;
    }
    public boolean solveUseHashSet(int [] nums){
        HashSet<Integer> map1 = new HashSet<>();
        for(int res : nums){
            if(map1.contains(res)){
                return true;
            }
            map1.add(res);
        }
        return false;
    }



    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        int nums1[] = {1,1,1,2,3,4};
        System.out.println(solve(nums));
        ContainsDuplicate obj = new ContainsDuplicate();
        System.out.println(obj.solveUseHashSet(nums1));
        }
}
