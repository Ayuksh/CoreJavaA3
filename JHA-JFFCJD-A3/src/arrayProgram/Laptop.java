package arrayProgram;

public class Laptop {
    String modelNumber ;
    String companyName ;
    double price ;
    String processor ;
    int storage ;

    public Laptop(String modelNumber, String companyName,
                  double price, String processor, int storage) {
        this.modelNumber = modelNumber;
        this.companyName = companyName;
        this.price = price;
        this.processor = processor;
        this.storage = storage;
    }


    public void displayDetails() {
        System.out.println( "Laptop{" +
                "modelNumber=" + modelNumber +
                ", companyName='" + companyName + '\'' +
                ", price=" + price +
                ", processor='" + processor + '\'' +
                ", storage=" + storage +
                '}');
    }
}
