package Array_HashMap_String_Week1.String;

import java.util.ArrayList;

public class FirstUniqueCharacter {
    public static int firstInique(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean unique = true;

            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    unique = false;
                    break;
                }
            }
                if (unique) {
                    return i;
                }
            }
        return -1;
    }

    public static int useArray26 (String s){
        int[] a = new int[26];
        for(int i = 0; i <s.length(); i++){
            a[s.charAt(i) - 'a']++;

        }
        for(int  j =0; j < s.length(); j++){
            if( a[s.charAt(j) -'a'] ==1){
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "aabc";
        int res = firstInique(s);
        int res1 = useArray26(s);
        System.out.println(res1);
    }
}
