package ECOMS;

public class OrderProcessor {
    private final IPaymentProcessor paymentProcessor;
    private final InvoiceGenerator invoiceGenerator;

    public OrderProcessor(IPaymentProcessor paymentProcessor, InvoiceGenerator invoiceGenerator) {
        this.paymentProcessor = paymentProcessor;
        this.invoiceGenerator = invoiceGenerator;
    }

    public void processOrder(Order order) {
        for (Product product : order.get_products()) {
            if (product.check_stock(1)) {
                product.update_stock(1);
            } else {
                System.out.println("Not enough stock for product: " + product.getName());
                return;
            }
        }

        double totalAmount = order.calculate_total();
        boolean paymentSuccess = paymentProcessor.process_payment(totalAmount);

        if (paymentSuccess) {
            System.out.println("Order processed successfully for " + order.get_customer().get_contact_info());
            invoiceGenerator.generate_invoice(order);
        } else {
            System.out.println("Payment failed for the order.");
        }
    }
}
