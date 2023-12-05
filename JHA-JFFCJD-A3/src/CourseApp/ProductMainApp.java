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
        System.out.println("5. GET PRODUCT WITH LOWEST PRICE ");
        System.out.println("6. DISPLAY PRODUCT BY CATEGORY ");
        System.out.println("7. APPLY FILTER ");
        int ch = sc.nextInt() ;
        switch (ch)
        {
            case 1-> addProduct();
            case 2-> updateProduct();
            case 3-> displayAllProduct();
            case 4 -> deleteProductById();
            case 5 -> lowestPriceProduct();
            case 6 -> getByCategory();
            case 7 -> applyFilter();
        }

        main(args);

    }

    private static void applyFilter() {
        System.out.println("ENTER LOWER VALUE ");
        double low = sc.nextDouble() ;
        System.out.println("ENTER UPPER VALUE");
        double upp = sc.nextDouble();

        service.applyFilter(low , upp);
    }

    private static void getByCategory() {
        System.out.println("ENTER CATEGORY ");
        String category = sc.next();
        service.getProductsByCategory(category);
    }

    private static void lowestPriceProduct() {
        Product lowestProduct = service.getProductWithLowestPrice();
        System.out.println("\n\n"+lowestProduct+"\n\n");
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
