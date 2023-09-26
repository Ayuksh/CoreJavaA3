package stringPrograms;

public class Program2 {
    public static void main(String[] args) {
       String s1 = "qspiders";
       String s2 = new String("jspider");
       int len = s2.length() ;
       String revStr = "";
       for (int i =len-1 ; i>=0 ; i--) {
           char ch = s2.charAt(i);
           revStr += ch ;
       }

        System.out.println(revStr);

    }
}
