package AssignmentFour.Behavioural.Command;

//Create concrete classes implementing the Order interface.
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
