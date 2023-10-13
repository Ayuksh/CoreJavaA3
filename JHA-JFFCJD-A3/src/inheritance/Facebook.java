package inheritance;

public class Facebook {

    public void login(String email , String password)
    {
        if (email.endsWith("@gmail.com") && password.equals( "1234") )
        {
            System.out.println("LOGIN SUCCESSFUL, ENJOY WASTING TIME !!");
        }else{
            System.out.println("LOGIN UNSUCCESSFUL !!, PLS GO AND STUDY !!");
        }
    }

    public void login(int phn , String password)
    {
        if (phn == 123456 && password .equals( "1234" ))
        {
            System.out.println("LOGIN SUCCESSFUL, ENJOY WASTING TIME !!");
        }else{
            System.out.println("LOGIN UNSUCCESSFUL !!, PLS GO AND STUDY !!");
        }
    }

}
