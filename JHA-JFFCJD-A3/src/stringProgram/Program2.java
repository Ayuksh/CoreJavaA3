package stringProgram;

public class Program2 {
    public static void main(String[] args) {
        String str = "this is core java batch";
       String ans = "";
       for(String s : str.split(" "))
       {
           String temp ="";
           for (int i = s.length()-1 ; i>=0 ; i--)
               temp += s.charAt(i);

           ans += (temp)+" ";
       }
       ans = ans.trim();
        System.out.println(ans);
    }
}
