package Array_HashMap_String_Week1.HashTable;

import java.util.HashMap;

// Patten: ánh xạ
//sử dụng hashmap  cho 2 chuỗi ánh xạ với nhau

public class IsomorphicString {
    public static boolean isomorphic(String s, String t){
        HashMap<Character, Character> map = new HashMap<>();
        for(int i =0 ; i < s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(!map.containsKey(a) ){
                if(map.containsValue(b)){
                    return false;
                }
                map.put(a,b);
                }else{
                if(map.get(a) !=b){
                    return false;
                }
            }

            }
        return true;
        }

}

