package CourseApp;

import java.util.Scanner;

public class ProductMainApp {

    static Scanner sc = new Scanner(System.in);
    static ProductService service = new ProductService() ;

    public static void main(String[] args) {
        System.out.println("----------------------------------");
        System.out.println("SELECT THE OPTION ");
        System.out.println("1. ADD PRODUCT");
        System.out.println("2. UPDATE PRODUCT");
        System.out.println("3. DISPLAY ALL PRODUCT");
        System.out.println("4. REMOVE PRODUCT ");
        int ch = sc.nextInt() ;
        switch (ch)
        {
            case 1-> addProduct();
            case 2-> updateProduct();
            case 3-> displayAllProduct();
            case 4 -> deleteProductById();
        }

        main(args);

    }

    private static void deleteProductById() {
        System.out.println("ENTER PRODUCT ID ");
        int pId = sc.nextInt();
        service.deleteProduct(pId);
    }

    private static void displayAllProduct() {
        for(Product p : service.getAllProduct())
            System.out.println(p);
    }

    private static void updateProduct() {
        System.out.println("ENTER PRODUCT ID ");
        int pId = sc.nextInt() ;
        System.out.println("ENTER PRODUCT NAME ");
        String pName = sc.next() ;
        System.out.println("ENTER PRODUCT PRICE ");
        double pPrice = sc.nextDouble();
        System.out.println("ENTER PRODUCT TYPE");
        String pType = sc.next() ;

        Product updateProduct = new Product(pId , pName , pPrice , pType);
        if (service.updateProduct(pId , updateProduct))
            System.out.println("\n+++ PRODUCT UPDATED SUCCESSFULLY !! +++");
        else
            System.out.println("\n--- PRODUCT NOT FOUND !! ---");

    }

    private static void addProduct() {
        System.out.println("ENTER PRODUCT ID ");
        int pId = sc.nextInt() ;
        System.out.println("ENTER PRODUCT NAME ");
        String pName = sc.next() ;
        System.out.println("ENTER PRODUCT PRICE ");
        double pPrice = sc.nextDouble();
        System.out.println("ENTER PRODUCT TYPE");
        String pType = sc.next() ;

        Product newProduct = new Product(pId , pName , pPrice , pType);

        if(service.addProduct(newProduct))
            System.out.println("\n+++ PRODUCT ADDED SUCCESSFULLY !! +++");
        else
            System.out.println("--- PRODUCT NOT ADDED !! ---");
    }
}
