package loopingStatement;

public class Program5 {
    public static void main(String[] args) {
        int a = 9 ;
        int count = 0 ;
        for (int i =1 ; i<=a ; i++ )
            if (a%i==0)
                count++;
        if (count == 2)
            System.out.println("NUMBER IS PRIME NUMBER ");
        else
            System.out.println("NUMBER IS NOT A PRIME NUMBER ");

    }
}
