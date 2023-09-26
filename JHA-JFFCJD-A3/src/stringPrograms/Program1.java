package stringPrograms;

public class Program1 {
    public static void main(String[] args) {
        String s1 = new String("java"); // with using new operator
        String s2 = "java";                     // without using new operator
        String s3 = new String("java");
        String s4 = "java" ;
        String s5 = "sql";
        s4 = "SQL";
        String s6 = new String("SQL");

        System.out.println( s5.equalsIgnoreCase(s6) );
    }
}
