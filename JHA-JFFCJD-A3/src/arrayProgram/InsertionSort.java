package arrayProgram;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 14  , 8 , 5 , 3 , 13 , 9 , 7 , 10 };

        for(int i =0 ; i< arr.length ; i++) {
            int midx = i;
            for (int j = i; j < arr.length; j++)
                if (arr[j] < arr[midx])
                    midx = j;

            int temp = arr[midx];
            arr[midx] = arr[i];
            arr[i] = temp;
        }


        for (int a : arr)
            System.out.print(a+"  ");
    }
}
