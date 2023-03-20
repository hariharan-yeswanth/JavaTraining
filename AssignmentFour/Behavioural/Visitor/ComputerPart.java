package AssignmentFour.Behavioural.Visitor;

//Define an interface to represent element.
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
