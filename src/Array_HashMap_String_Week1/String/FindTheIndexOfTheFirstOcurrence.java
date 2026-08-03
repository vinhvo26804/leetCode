package Array_HashMap_String_Week1.String;


public class FindTheIndexOfTheFirstOcurrence {
    public static int solve(String hay,String need){
      for(int  i =0; i <= hay.length()-need.length(); i++){
           boolean match = true;
           for(int j =0 ; j < need.length();j++){
               if( hay.charAt(i+j) != need.charAt(j) ){
                   match = false;

               }

           }if(match){
                return  i;
          }
      }
      return -1;

    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 ="ll";
        int res = solve(str1, str2);
        System.out.println(res);
    }

}
