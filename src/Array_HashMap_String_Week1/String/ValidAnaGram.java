package Array_HashMap_String_Week1.String;

import java.util.HashMap;

public class ValidAnaGram {
    public static boolean useHashMap(String s, String t){
        if(s.length()!=t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0; i <s.length(); i++){
            char strS = s.charAt(i);
            char strT = t.charAt(i);

            map.put(strS, map.getOrDefault(strS, 0)+1);
            map.put(strT, map.getOrDefault(strT, 0)-1);
        }
        for(int count : map.values()){
            if(count != 0) return false;

        }
        return true;
    }
//    Olog(n) 23ms;
    public static boolean useArray26(String s, String t){
        if(s.length()!= t.length()) return false;

        int[]  a = new int[26];
        for(int  i= 0; i < s.length(); i++){
            a[s.charAt(i) -'a']++;
        }
        for(int  i =0; i< t.length(); i++){
             if(a[t.charAt(i)-'a']==0)
                 return false;
            a[t.charAt(i) -'a']--;
        }
        return true;
    }
    //O(n) leetCode 6ms;

    public static void main(String[] args) {
        String s1 = "aacc";
        String s2 = "ccac";
//        System.out.println(useHashMap(s1,s2 ));
        System.out.println(useArray26(s1,s2 ));


    }
}
