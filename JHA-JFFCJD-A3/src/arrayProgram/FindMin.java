package arrayProgram;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {72 , 55 , 45 , 98 , 101 , 1 , 2};

        int min = arr[4] ;
        for (int i =0 ; i< arr.length-1 ; i++)
            if (arr[i]<min)
                min = arr[i] ;

        System.out.println("MIN VALUE FROM ARRAY IS "+ min);
    }
}
