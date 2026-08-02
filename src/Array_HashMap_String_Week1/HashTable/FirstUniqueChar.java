package Array_HashMap_String_Week1.HashTable;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {
    public static int useHashMap(String s){
        Map<Character, Integer> map = new HashMap<>();
        for( char c : s.toCharArray()){ // duyệt mảng trong chuỗi s, toCharArray: Tạo 1 mảng các kí tự của chuổi
            map.put(c , map.getOrDefault(c, 0) +1); // getOrDefault: kiểm tra kí tự có nằm trong map hay không?
                                                                // map.put(ket, value)
                                                                //map.getOrDefault(value, "Giá trị trả về nếu không tìm thấy trong mao").
            for(int i =0 ; i < s.length(); i++){
                if(map.get(s.charAt(i)) ==1){ //map.get: lấy key map.get(K);
                    return i;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        int res = useHashMap(s);
        System.out.println(res);
    }
}

