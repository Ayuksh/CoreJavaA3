package CourseApp;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private List<Product> productList = new ArrayList<>();

    {
        productList.add(new Product(101 , "AC" , 25000 , "ELECTRONIC"));
        productList.add(new Product(102 , "SUGAR" , 200 , "GROCERY"));
        productList.add(new Product(103 , "MILK" , 30 , "GROCERY"));
        productList.add(new Product(104 , "SALT" , 100 , "GROCERY"));
        productList.add(new Product(105 , "TV" , 35000 , "ELECTRONIC"));

    }


    public boolean addProduct(Product newProduct) {
        return productList.add(newProduct);
    }

    public boolean updateProduct(int pId, Product updateProduct) {
        int idx = -1 ;
        for (int i =0 ; i<productList.size() ; i++)
            if (productList.get(i).getProductId() == pId)
                idx = i ;

        if (idx == -1)
            return false ;
        else {
            productList.set(pId, updateProduct);
            return  true ;
        }
    }

    public List<Product> getAllProduct() {
        return productList;
    }

    public void deleteProduct(int pId) {
        for (Product p : productList) {
            if (p.getProductId() == pId )
                productList.remove(p);
        }
    }
}
