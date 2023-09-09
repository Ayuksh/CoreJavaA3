package loopingStatement;

public class Program10 {
    public static void main(String[] args) {
        for (int i =1 ; i<=10000 ; i++)
        {
            int a = i , temp = a ;
            int count = 0 ;
            int sum = 0 ;
            while (temp != 0 )
            {
                count++;
                temp/=10 ;
            }

            while (a!=0)
            {
                int r = a %10 ;
                int pow = 1 ;
                for (int j =0 ; j<count ; j++)
                    pow *= r ;

                sum += pow ;
                a/=10 ;
            }

            if (sum == i )
                System.out.println("ARMSTRONG NUMBER IS "+ sum );


        }
    }
}
