package Array_HashMap_String_Week1.String;

public class ValidPalindrome {
    public static boolean isValidPalindrom(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(r))) {
                r--;
                continue;
            }
            char left = Character.toLowerCase(s.charAt(l));
            char right = Character.toLowerCase(s.charAt(r));


            if (left != right) {
                return false;
            }
            l++;
            r--;

        }
        return true;
    }


    public static void main(String[] args) {
    String s = "A man, a plan, a canal: Panama";
        System.out.print(isValidPalindrom(s));


    }
}

