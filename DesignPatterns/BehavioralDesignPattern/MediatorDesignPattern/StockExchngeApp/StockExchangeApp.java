public class StockExchangeApp {
    public static void main(String[] args) {
        StockExchange bse = new StockMarket();

        Trader nishant = new Trader("Nishant", bse);
        Trader nainsi = new Trader("Nainsi", bse);

        nishant.buy("AAPL",10, 140.0);
        nainsi.sell("AAPL", 10, 140.0);

        nishant.sell("TSLA", 5, 700.0);
        nainsi.buy("TSLA", 5, 700.0);
    }
}
