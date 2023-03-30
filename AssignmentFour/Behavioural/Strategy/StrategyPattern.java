package AssignmentFour.Behavioural.Strategy;

//Use the Context to see change in behaviour when it changes its Strategy.
public class StrategyPattern {
    public static void main(String[] args) {
        Context context = new Context(new Add());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new Subtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
    }
}

// Implementation
//  Create a Strategy interface defining an action and concrete strategy classes implementing the Strategy interface. 
// Context is a class which uses a Strategy.

// StrategyPattern, our demo class, will use Context and strategy objects
//  to demonstrate change in Context behaviour based on strategy it deploys or uses.
