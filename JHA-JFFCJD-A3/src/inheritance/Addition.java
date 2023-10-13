package inheritance;

public class Addition {
    public void add(int a ) {
        System.out.println("ADDING a"+ a);
    }

    public void add(int a , int b){
        System.out.println("ADDING a & b"+ (a+b));
    }

    public void add(String s , int a){
        System.out.println("ADDING string AND int \"" +
                ""+ (s+a)+"\"");
    }

    public void add(int a , String s){
        System.out.println("ADDING int AND string \""+ (a+s)+"\"");

    }
}
