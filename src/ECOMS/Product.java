package ECOMS;

public class Product {
    /***
     * Members
     * 1. name -> Name of the Product
     * 2. price -> Price of the product
     * 3. stock -> Quantity of the product and it can be changed in future
     */

    private final String name;
    private final double price;
    private int stock;

    //Constructor
    public Product(String name, double price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    /***
     * Methods
     * 1. get_details() -> This method will return a String of all the value the object is storing
     * 2. reduce_stock() -> This method will reduce the quantity of the stock by the quantity passed as the arguments.
     */

    public String get_details(){
     return "Name: " + name + ", Price: " + price + ", Stock: " + stock;
    }
    public void reduce_stock(int quantity){
        stock -= quantity;
    }
}
