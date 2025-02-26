import java.util.ArrayList;
import java.util.List;

public class StockMarket implements StockExchange{
    private List<Orders> buyOrders = new ArrayList<>();
    private List<Orders> sellOrders = new ArrayList<>();

    @Override
    public void placeBuyOrder(String stock, int quantity, double price, Trader buyer) {
        System.out.println(buyer.getName() + " wants to buy "+quantity+ " shares of "+stock+ " at $"+price);
        //Checking for the matching sell order, because we want to buy that.
        for(Orders order: sellOrders){
            if(order.stock.equals(stock) && order.price <= price && order.quantity == quantity){
                System.out.println("Trade Executed! "+buyer.getName() + " bought from "+order.trader.getName());
                sellOrders.remove(order);
                return;
            }
        }
        // No match found, add buy order
        buyOrders.add(new Orders(stock, quantity, price, buyer));
    }

    @Override
    public void placeSellOrder(String stock, int quantity, double price, Trader seller) {
        System.out.println(seller.getName() + " wants to sell "+quantity+ " shares of "+stock+ " at $ "+price);
        // Check for a matching buy order
        for (Orders order : buyOrders){
            if(order.stock.equals(stock) && order.price >= price && order.quantity == quantity){
                System.out.println("Trade executed! " + seller.getName() + " sold to " + order.trader.getName());
                buyOrders.remove(order);
                return;
            }
        }
        // No match found, add sell order
        sellOrders.add(new Orders(stock, quantity, price, seller));
    }
}
