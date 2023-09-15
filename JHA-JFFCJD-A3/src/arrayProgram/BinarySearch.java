package arrayProgram;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10 , 20 , 30 , 40 , 50 , 60 , 70 , 80 };
        System.out.println("ENTER ELEMENT ");
        int a = new Scanner(System.in).nextInt() ;

        String ans = search(arr , a , 0 , arr.length);
        System.out.println(ans);
    }

    public static String search(int[] arr , int a , int st , int ed )
    {
        int mid = (st+ed)/2 ;

        while (st<=ed)
        {
            if (a == arr[mid])
                return "ELEMENT FOUND";
            else if (a > arr[mid]) {
                return search( arr , a , mid+1 , ed );
            }else {
                return search(arr , a , st , mid-1);
            }
        }

        return "ELEMENT NOT FOUND !!";
    }
}
