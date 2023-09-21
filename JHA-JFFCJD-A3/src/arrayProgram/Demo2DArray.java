package arrayProgram;

public class Demo2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10 , 20 , 30 } ,
                {40 , 50 , 60 } ,
                {70 , 80 , 90 }
        } ;

        for(int[] a : arr) {                 //        for (int i =0 ; i<3 ; i++)
            for (int a1 : a)              //        {
                System.out.print(a1 + " ");//            for(int j =0 ; j<3 ; j++)
            System.out.println();           //                System.out.print(i+","+j+"   ");
        }                                   //
                                            //            System.out.println();
                                            //        }
    }
}
