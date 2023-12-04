package CourseApp;

public class Product {
    private int productId ;
    private String productName ;
    private double productPrice ;
    private String productType ;

    public Product(int productId, String productName, double productPrice, String productType) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productType = productType;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return  "\nproductId=" + productId +
                ",\n productName='" + productName + '\'' +
                ",\n productPrice=" + productPrice +
                ",\n productType='" + productType + '\''+
                "\n+--------------------------------+";
    }
}
