package casting;

public class Apple extends Laptop{

    @Override
    public void getCompany() {
        System.out.println("LAPTOP COMPANY IS APPLE");
    }

    @Override
    public void getProcessor() {
        System.out.println("LAPTOP PROCESSOR IS  M2");
    }

    @Override
    public void getOS() {
        System.out.println("LAPTOP OS IS MAC OS 17");
    }
}
