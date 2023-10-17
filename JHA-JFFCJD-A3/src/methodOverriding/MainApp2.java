package methodOverriding;

public class MainApp2 {
    public static void main(String[] args) {
        Drive d1 = new Drive();
        d1.searching();
        d1.download();
        d1.upload();
        System.out.println("------------------------");
        Youtube yt = new Youtube();
        yt.searching();
        yt.streaming();
        yt.download();
    }
}
