package AssignmentFour.Behavioural.Visitor;

public interface ComputerPartVisitor {
    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(KeyBoard keyboard);

    public void visit(Monitor monitor);
}
