package AssignmentFour.Behavioural.Strategy;

//Create concrete classes implementing the same interface.
public class Add implements Strategy {
    @Override
    public int operations(int num1, int num2) {
        return num1 + num2;
    }
}
