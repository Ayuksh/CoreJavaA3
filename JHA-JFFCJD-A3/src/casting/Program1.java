package casting;

import java.util.ArrayList;

public class Program1 {
    public static void main(String[] args) {
      int[] arr = {119, 101, 32, 104, 97, 118, 101,
              32, 116, 111, 32, 102, 105, 110, 105,
              115, 104, 32, 106, 97, 118, 97, 32, 98,
              97, 116, 99, 104, 32};

      for (int i =0 ; i< arr.length ; i++)
      {
          System.out.print((char)arr[i]);
      }
    }
}
