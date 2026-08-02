package Array_HashMap_String_Week1.HashTable;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static boolean useHaspmap(String ran, String mag){
        Map<Character, Integer> map = new HashMap<>();
        for(char c : ran.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)-1);

        }for(char c1 : mag.toCharArray()){
            map.put(c1, map.getOrDefault(c1, 0)+1);

        }
        for(int x  : map.values()){
            if(x < 0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String r = "aab";
        String m = "aaaabn";
        System.out.println(useHaspmap(r,m));

    }
}
