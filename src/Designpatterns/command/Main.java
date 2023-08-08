package Designpatterns.command;

public class Main {

    public static void main(String[] args) {
        Stock stock = new Stock("ABC", 20);

        Stock stockA = new Stock("DEF", 50);

        BuyStock buyOrderStock = new BuyStock(stock);

        SellStock sellOrderStock = new SellStock(stockA);

        Broker broker = new Broker();

        broker.takeOrder(buyOrderStock);
        broker.takeOrder(sellOrderStock);

        broker.placeOrders();
    }
}
