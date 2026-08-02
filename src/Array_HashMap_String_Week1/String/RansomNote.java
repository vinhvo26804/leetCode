package Array_HashMap_String_Week1.String;

import java.util.Arrays;



public class RansomNote {
    public static boolean ransomNote(String ran, String mag){
        int[] r = new int[26];
        for(char c : ran.toCharArray()){
            r[c -'a']--;
        }
        for(char c1 : mag.toCharArray()){
            r[c1-'a']++;
        }
        for(int i =0 ; i < r.length; i++){
                if(r[i] < 0){
                     return false;

            }

        }
        return true;
    }

    public static void main(String[] args) {
        String r = "aab";
        String m = "ab";
        System.out.println(ransomNote(r,m));

    }
}
