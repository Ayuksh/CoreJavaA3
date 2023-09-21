package arrayProgram;

public class AddAll2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1 , 2 , 3 } ,
                {4 , 5 , 6 } ,
                {7 , 8 , 9 }
        } ;

        int sum =0 ;
        for (int[] a : arr)
        {
            for (int a1 : a)
               sum += a1 ;
        }
        System.out.println(sum);
    }
}
