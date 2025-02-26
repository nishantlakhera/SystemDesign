public class Orders {
    String stock;
    int quantity;
    double price;
    Trader trader;

    public Orders(String stock, int quantity, double price, Trader trader){
        this.stock = stock;
        this.quantity = quantity;
        this.price = price;
        this.trader = trader;
    }
}
