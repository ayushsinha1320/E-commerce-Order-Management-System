package ECOMS;

public class Product implements IStockManager{
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
     * 3. getName() -> This method will return the name  of the product.
     * 4. getPrice() -> This method will return the price of the product.
     * 5. getStock() -> This method will return the stock of the product.
     */

    public String get_details(){
     return "Name: " + name + ", Price: " + price + ", Stock: " + stock;
    }
    public void reduce_stock(int quantity){
        stock -= quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    /***
     * IStockManager Interface Implementations
     * 1. check_stock() -> Checks of the stock is greater than the required stock.
     * 2. update_stock() -> Update the stock of the product.
     */

    @Override
    public boolean check_stock(int quantity) {
        return stock >= quantity;
    }

    @Override
    public void update_stock(int quantity) {
        stock -= quantity;
    }
}
