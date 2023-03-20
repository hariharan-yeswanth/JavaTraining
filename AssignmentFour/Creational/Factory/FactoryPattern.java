package AssignmentFour.Creational.Factory;

public class FactoryPattern {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // get an object of Rectangle and call its draw method.
        Shape shape1 = shapeFactory.getShape("RECTANGLE");

        // call draw method of Rectangle
        shape1.draw();

        // get an object of Square and call its draw method.
        Shape shape2 = shapeFactory.getShape("SQUARE");

        // call draw method of square
        shape2.draw();
    }
}
// Implementation
// Create a Shape interface and concrete classes implementing the Shape
// interface.
// A factory class ShapeFactory is defined as a next step.
// FactoryPattern, our demo class will use ShapeFactory to get a Shape object.
// It will pass information (RECTANGLE / SQUARE) to ShapeFactory to get the type
// of object it needs.
