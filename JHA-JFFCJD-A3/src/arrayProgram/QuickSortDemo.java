package arrayProgram;

import java.util.Arrays;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] arr = { 14 ,1 , 13 , 25 , 33 , 9 , 7  , 11 , 10 , 12 };
        int n = arr.length;
        divide(arr , 0 , n-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void divide(int[] arr , int st , int ed)
    {
        if (st<=ed)
        {
            int m = sort(arr , st , ed);
            divide(arr , st , m-1);
            divide(arr , m+1 , ed);
        }
    }

    public static int sort(int[] arr , int st , int ed)
    {

        int pivot = arr[ed];
        int m =st ;

        for (int i =st ; i<ed ; i++)
        {
            if(arr[i]< pivot)
            {
                int temp = arr[i];
                arr[i] = arr[m];
                arr[m] = temp ;
                m++;
            }
        }
        int temp = arr[m] ;
        arr[m] = arr[ed];
        arr[ed] = temp ;

        return m ;
    }
}
