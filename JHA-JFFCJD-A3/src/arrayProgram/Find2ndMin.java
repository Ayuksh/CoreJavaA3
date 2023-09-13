package arrayProgram;

public class Find2ndMin {
    public static void main(String[] args) {
        int[] arr = {  1 , 72 , 55 , 45 , 98 , 101 , 1 , 2};

       int min1 = arr[0] ;
       int min2 = arr[1] ;
       for (int i =0 ; i<arr.length ; i++)
       {
           if (arr[i]<min1)
           {
               min2 = min1 ;
               min1 = arr[i];
           } else if (arr[i]<min2 && arr[i]!= min1) {
               min2 = arr[i];
           }
       }

//        for (int a : arr)
//        {
//            if (a < min1)
//            {
//                min2 = min1 ;
//                min1 = a;
//            }else if (a < min2  && a != min1 )
//            {
//                min2 = a ;
//            }
//        }

        System.out.println(min1);
        System.out.println(min2);
    }
}
