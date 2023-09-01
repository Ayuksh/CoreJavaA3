package loopingStatement;

public class Program7 {
    public static void main(String[] args) {
        int primeCount = 0 ;
        int j =1 ;
       while (primeCount < 10)
       {
           int a = j ;
           int count = 0 ;
           for (int i =1 ; i<=a ; i++)
               if (a%i==0)
                   count++;
           if (count == 2) {
               System.out.println("PRIME NUMBER "+a);
               primeCount++;
           }
           j++;
       }
        System.out.println("PRIME COUNT : "+ primeCount);
    }
}
