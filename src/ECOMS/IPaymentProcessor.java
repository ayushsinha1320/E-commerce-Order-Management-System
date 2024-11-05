package ECOMS;

public interface IPaymentProcessor {
    boolean process_payment(double amount);
}
