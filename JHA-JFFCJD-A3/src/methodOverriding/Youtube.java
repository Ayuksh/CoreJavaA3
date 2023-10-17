package methodOverriding;

public class Youtube extends Google{
    boolean isPremium = false ;

    @Override
    public void searching() {
        System.out.println("SEARCHING ON YOUTUBE !!");
    }

    public void streaming()
    {
        System.out.println("STREAMING ON YOUTUBE ");
    }

    @Override
    public void download() {
        if (isPremium)
            System.out.println("DOWNLOAD FROM YOUTUBE !!!");
        else
            System.out.println("DOWNLOAD NOT AVAILABLE !!");
    }
}
