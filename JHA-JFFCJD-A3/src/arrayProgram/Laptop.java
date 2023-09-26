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
        System.out.println("-------------------------------------");
        System.out.println(
                "modelNumber=" + modelNumber +
                "\ncompanyName=" + companyName +
                "\nprice=" + price +
                "\nprocessor=" + processor +
                "\nstorage=" + storage );
        System.out.println("--------------------------------------");
    }
}
