package arrayProgram;

public class Program1 {
    public static void main(String[] args) {
        double[] arr ;  // declaration
        arr = new double[5]; // size allocation

        arr[2] = 30 ;
        arr[0] = 10 ;
        arr[1] = 20 ;
        arr[3] = 40 ;
        arr[4] = 50 ;

//        System.out.println( arr[0] );
//        System.out.println( arr[1] );
//        System.out.println( arr[2] );
//        System.out.println( arr[3] );
//        System.out.println( arr[4] );
//
//        for (int i =0 ; i<5 ; i++)
//            System.out.println(arr[i]);

        for ( double n : arr )
            System.out.println(n);


    }
}
