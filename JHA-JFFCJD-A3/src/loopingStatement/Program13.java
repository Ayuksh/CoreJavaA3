package loopingStatement;

public class Program13 {
    public static void main(String[] args) {
        int line = 5 ;
        int star = 1 ;
        int space = 4 ;

        int ch1 = 1 ; int m = 5 ;

        for (int i =0 ; i<line ; i++)
        {
            int ch2 = ch1 ; int n = m ;

            for (int k =0 ; k<space ; k++)
                System.out.print("   ");

            for (int j =0 ; j<star ; j++)
            {
                System.out.print(" "+ch2+" ");
                ch2 -=n;
                n++;
            }
            System.out.println();
            ch1 +=m ;
            m--;
            star++;
            space-- ;
        }
    }
}
