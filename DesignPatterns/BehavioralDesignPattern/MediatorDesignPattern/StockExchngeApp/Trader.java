//Colleague class
public class Trader {
    private String name;
    private StockExchange exchange;
    public Trader(String name, StockExchange exchange){
        this.name = name;
        this.exchange = exchange;
    }
    public String getName(){
        return name;
    }
    public void buy(String stock, int quantity, double price){
        exchange.placeBuyOrder(stock,quantity,price,this);
    }
    public void sell(String stock, int quantity, double price){
        exchange.placeSellOrder(stock,quantity,price,this);
    }
}
