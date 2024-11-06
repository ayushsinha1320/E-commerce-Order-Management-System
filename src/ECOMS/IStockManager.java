package ECOMS;

public interface IStockManager {
    boolean check_stock(int quantity);
    void update_stock(int quantity);
}
