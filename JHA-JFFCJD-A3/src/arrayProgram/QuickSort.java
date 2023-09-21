package arrayProgram;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 14 ,1 , 13 , 25 , 33 , 9 , 7  , 11 , 10 , 12 };
        divide(arr , 0 , arr.length-1);

        System.out.println(Arrays.toString(arr));


    }

    public static int sort(int[] arr , int st , int ed )
    {
        int pivot = arr[ed] ;
        int idx = st ;

        for (int i = st ; i<ed ; i++){
            if (arr[i] < pivot )
            {
                int temp = arr[i] ;
                arr[i] = arr[idx] ;
                arr[idx] = temp ;
                idx++;
            }
        }

        int temp = arr[ed];
        arr[ed] = arr[idx] ;
        arr[idx] = temp ;

       return idx;
    }

    public static void divide(int[] arr ,int st , int ed )
    {
         if(st <= ed) {
             int pivotIdx = sort(arr, st, ed);
             divide(arr, st, pivotIdx - 1);
             divide(arr , pivotIdx+1 , ed);
         }

    }

}
