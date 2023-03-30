package AssignmentFour.Behavioural.Visitor;

public class VisitorPattern {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
// Implementation
// Create a ComputerPart interface defining accept operation.
// Keyboard, Mouse, Monitor and Computer are concrete classes implementing
// ComputerPart interface.
// Will Define another interface ComputerPartVisitor which will define a visitor
// class operations. Computer uses concrete visitor to do corresponding action.

// VisitorPattern, our demo class, will use Computer and ComputerPartVisitor
// classes to demonstrate use of visitor pattern.
