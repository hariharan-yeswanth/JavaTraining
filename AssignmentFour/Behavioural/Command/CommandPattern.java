package AssignmentFour.Behavioural.Command;

//Use the Broker class to take and execute commands.
public class CommandPattern {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
// Implementation
// Created an interface Order which is acting as a command.
// Have created a Stock class which acts as a request.
// Have concrete command classes BuyStock and SellStock implementing Order
// interface which will do actual command processing.
// A class Broker is created which acts as an invoker object. It can take and
// place orders.

// Broker object uses command pattern to identify which object will execute
// which command based on the type of command.
// CommandPattern, our demo class, will use Broker class to demonstrate command
// pattern.
