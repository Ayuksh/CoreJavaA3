package methodOverriding;

public class Home extends Human{
    @Override
    public void behave() {
        System.out.println("BEHAVE LIKE A SON ");
    }

    public void money()
    {
        System.out.println("ACCESSING MONEY !!");
    }
}
