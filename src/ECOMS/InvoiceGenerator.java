package ECOMS;

public class InvoiceGenerator {
    /***
     * Members
     * 1. total_cost -> Sum of all the product price with their respective quantity
     */
    private double total_cost = 0;

    public void generate_invoice(Order order){
        System.out.println("No.    Name        Quantity    Price     Cost");
        int count = 1;
        for(Product product: order.get_products()){
            int quantity = product.getStock();
            double price = product.getPrice();
            total_cost += price * quantity;
            System.out.println(count + ". " + product.getName() + " " + quantity + " " + price);
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("Total Price -> " + total_cost);
    }
}
