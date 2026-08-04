package Array_HashMap_String_Week1.String;

import java.util.Map;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        // Lấy chuỗi đầu tiên làm tiền tố tạm
        String prefix = strs[0];

        // So sánh với từng chuỗi còn lại
        for (int i = 1; i < strs.length; i++) {

            // Nếu chuỗi hiện tại không bắt đầu bằng prefix
            while (!strs[i].startsWith(prefix)) {

                // Cắt bỏ ký tự cuối của prefix
                prefix = prefix.substring(0, prefix.length() - 1);

                // Nếu prefix rỗng thì không còn tiền tố chung
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(strs));
    }
}
