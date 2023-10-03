package stringProgram;

public class Program4 {
    public static void main(String[] args) {
        String corr = "A1:Z1";
        char colSt = corr.charAt(0);
        char colEd = corr.charAt(3);
        char rowSt = corr.charAt(1);
        char rowEd = corr.charAt(4);

        for (char i = colSt ; i<=colEd ;i++)
        {
            for (char j = rowSt ; j<=rowEd ; j++)
                System.out.println(i+""+j);
        }
    }
}
