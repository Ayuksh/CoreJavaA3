package arrayProgram;

import java.util.Arrays;

public class SortPeople {
    public static void main(String[] args) {
        int[] age =     {  34   ,   65    ,   23    ,   78    ,   12   };
        String[] name = {"AMAN" , "KUNAL" , "KARAN" , "OMKAR" , "AMIT" };

        for (int i =0 ; i< age.length ; i++)
        {
            for (int j =0 ; j< age.length-1 ; j++)
            {
                if (age[j]<age[j+1])
                {
                    int temp = age[j];
                    age[j]= age[j+1];
                    age[j+1] = temp ;

                    String temp2 = name[j];
                    name[j] = name[j+1];
                    name[j+1] = temp2 ;
                }
            }
        }
        System.out.println(Arrays.toString(name));
        System.out.println(Arrays.toString(age));

    }
}
