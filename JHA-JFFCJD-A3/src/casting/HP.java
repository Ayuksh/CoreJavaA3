package casting;

public class HP extends Laptop{
    @Override
    public void getCompany() {
        System.out.println("LAPTOP COMPANY IS HP");
    }

    @Override
    public void getProcessor() {
        System.out.println("LAPTOP PROCESSOR IS intel i12");
    }

    @Override
    public void getOS() {
        System.out.println("LAPTOP OS IS WINDOWS 15!!");
    }
}
