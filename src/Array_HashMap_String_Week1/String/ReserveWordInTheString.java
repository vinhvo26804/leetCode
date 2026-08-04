package Array_HashMap_String_Week1.String;

public class ReserveWordInTheString {
    public static String reserve(String s){
       s=  s.trim();
        String regex = "\\s+";
        String[] res = s.split(regex);
        StringBuilder sb = new StringBuilder();
        for (int i = res.length-1;i>=0; i--){
                sb.append(res[i]);
                if(i !=0){
                    sb.append(" ");
                }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = " hello world";

        System.out.println(reserve(s));
    }
}
