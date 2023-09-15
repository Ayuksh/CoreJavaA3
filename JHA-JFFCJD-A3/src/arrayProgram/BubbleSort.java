package arrayProgram;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {14 , 21 , 67 , 89 , 45 , 13 , 17 , 5 , 10 };

        for(int i =0 ; i< arr.length ; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }



        for (int a : arr)
            System.out.print(a+"   ");

    }
}
