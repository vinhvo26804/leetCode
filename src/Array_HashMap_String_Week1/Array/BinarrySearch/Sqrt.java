package Array_HashMap_String_Week1.Array.BinarrySearch;

public class Sqrt {

    public  static  int solveBinarySearch( int n){
        int l =0;
        int r = n/2;
        while(l <= r){
            int m = l +(r-l)/2;

            if( m== n/m) // ử dụng chia để tránh tràn số.
                return  m;
            else if (m*m >n) {
                 r = m-1;


            }else {
                l =m+1;

            }
        }
        return r ;
    }
    //

    public static void main(String[] args) {
        int n =2147395599;
        int kq = solveBinarySearch(n);
        System.out.println(kq);
    }
}
