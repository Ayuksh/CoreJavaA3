package arrayProgram;

public class MainApp1 {
    public static void main(String[] args) {
        int[] a  ;
        Laptop[] laptops ;   // declaration

        a = new int[4] ;
        laptops = new Laptop[5];    // size allocation

        a[0] = 10 ;
        a[1] = 20 ;
        a[2] = 30 ;
        laptops[0] = new Laptop("1234ghj" , "DELL" ,
                55000 , "i3" , 8);
        laptops[1] = new Laptop("asd3445" , "HP" ,
                55000 , "i3" , 8);
        laptops[2] = new Laptop("jfkj567" , "ASUS" ,
                55000 , "i3" , 8);
        laptops[3] = new Laptop("8996hj" , "iMAC" ,
                55000 , "i3" , 8);
        laptops[4] = new Laptop("fdgd457" , "LENOVO" ,
                55000 , "i3" , 8);


//       for (int i =0 ; i<laptops.length ; i++)
//       {
//           System.out.println(laptops[i].companyName +" --> "+ laptops[i].price);
//       }

       for ( Laptop l : laptops )
       {
           System.out.println(l.companyName);
       }
    }
}
