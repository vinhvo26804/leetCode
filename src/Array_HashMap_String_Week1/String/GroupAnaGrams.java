package Array_HashMap_String_Week1.String;


import Array_HashMap_String_Week1.Array.List.SumaryRanges;

import java.util.*;

public class GroupAnaGrams {
    public static List<List<String>> group(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String w : strs) {
            char[] spl = w.toCharArray();
            Arrays.sort(spl);
            String key = new String(spl);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
                map.get(key).add(w);
            } else {
                map.get(key).add(w);
            }

        }

return  new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> ans = group(strs);

        for (List<String> list : ans) {
            System.out.println(list);
        }
    }
}



