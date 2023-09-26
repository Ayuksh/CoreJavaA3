package arrayProgram;

public class MainApp1 {
    public static void main(String[] args) {
        Laptop[] laptops ;   // declaration
        laptops = new Laptop[5];    // size allocation

        laptops[0] = new Laptop("1234ghj" , "DELL" ,
                55000 , "i3" , 8);
        laptops[1] = new Laptop("asd3445" , "HP" ,
                95000 , "i5" , 8);
        laptops[2] = new Laptop("jfkj567" , "ASUS" ,
                75000 , "i7" , 8);
        laptops[3] = new Laptop("8996hj" , "iMAC" ,
                90670 , "i9" , 8);
        laptops[4] = new Laptop("fdgd457" , "LENOVO" ,
                55000 , "i11" , 8);


        double lowestPrice = laptops[0].price ;
       for ( Laptop l : laptops )
       {
            if ( l.price < lowestPrice )
                lowestPrice = l.price ;
       }

       for (Laptop l : laptops)
       {
           if (l.price == lowestPrice )
               l.displayDetails();
       }
    }
}
