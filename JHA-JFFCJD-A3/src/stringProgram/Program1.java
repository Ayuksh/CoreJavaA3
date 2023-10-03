package stringProgram;

public class Program1 {
    public static void main(String[] args) {
      String s1 = "today is a good day";
      String ans = "" ;
     String[] arr =  s1.split(" ");
     for (String s : arr)
     {
         String temp = s.toUpperCase();
         char ch = temp.charAt(0);
         String st = s.substring(1);
         ans += (ch+st)+" ";
     }

        System.out.println(ans);


    }
}
