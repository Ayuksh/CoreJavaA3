package stringProgram;

public class Program3 {
    public static void main(String[] args) {
        String cor = "g4";
        char co1 = cor.charAt(0);
        char co2 = cor.charAt(1);
        int a = co1-'`';
        int b = co2-'0';
        String ans = ((a+b)%2==0)?"black":"white";
        System.out.println(ans);
    }
}
