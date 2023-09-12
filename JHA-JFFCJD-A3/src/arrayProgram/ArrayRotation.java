package arrayProgram;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {10 , 20 , 30 , 40 , 50 };
        int n = arr.length-1;


            int last = arr[n];
            for (int i = n ; i>0 ; i--)
                arr[i] = arr[i-1];
            arr[0] = last ;

            for (int a : arr)
                System.out.print(a+"   ");

            System.out.println();


    }
}
