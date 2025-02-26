//Mediator Interface
public interface StockExchange {
    void placeBuyOrder(String stock, int quantity, double price, Trader buyer);
    void placeSellOrder(String stock, int quantity, double price, Trader seller);
}
