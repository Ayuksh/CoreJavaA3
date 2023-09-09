package loopingStatement;

public class Program12 {

    public static void main(String[] args) {
        int line = 9 ;
        int star = 5 ;
        int space = 0 ;

        for (int i =0 ; i<line ; i++)
        {
            for (int j =0 ; j<star ; j++) {
                System.out.print("*");
            }
            for (int k =0 ; k<space ; k++) {
                System.out.print(" ");
            }
            for (int j =0 ; j<star ; j++) {
                System.out.print("*");
            }

            System.out.println();
            if(i < 4) {
                star--; space+=2 ;
            }else {
                star++; space-=2 ;
            }
        }
    }

}
