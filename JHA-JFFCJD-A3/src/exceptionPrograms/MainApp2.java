package exceptionPrograms;

public class MainApp2 {
    public static void main(String[] args) {
        String str = "123456a";
        int num = 0  ;
        try {
            num = Integer.parseInt(str);
        }catch (NumberFormatException n)
        {
            System.out.println("exception occur ");
        }
        System.out.println(num+1);
    }
}
