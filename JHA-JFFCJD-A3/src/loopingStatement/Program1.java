package loopingStatement;

public class Program1 {
    public static void main(String[] args) {
        int line = 5 ;
        int star = 1 ;
        int space = 2 ;
       for (int j =1 ; j<=line ; j++) {

           for (int k =1 ; k <= space ; k++)
            System.out.print(" ");


           for (int i = 1; i <= star; i++) {
               System.out.print("*");
           }
           System.out.println();
           if (j <3)
           {
               star+=2 ; space--;
           }else {
               star-=2 ; space++;
           }
       }
    }
}
