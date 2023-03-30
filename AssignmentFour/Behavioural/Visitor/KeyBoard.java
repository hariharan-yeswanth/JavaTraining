package AssignmentFour.Behavioural.Visitor;

//Create concrete classes extending the Computerpart class.
public class KeyBoard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
