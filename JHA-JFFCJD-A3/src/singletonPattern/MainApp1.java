package singletonPattern;



public class MainApp1 {
    public static void main(String[] args) {
        YouTube yt = new YouTube();
        Drive dr = new Drive();
        Maps mp = new Maps();
        Chrome ch = new Chrome();


        System.out.println(ch.acc);
        System.out.println(yt.acc);
        System.out.println(dr.acc);
        System.out.println(mp.acc);

//        ch.getProperties();
//        mp.getProperties();
//        dr.getProperties();
//        yt.getProperties();
    }
}
