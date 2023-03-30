package AssignmentFive.Bridge;
//Use the Shape and DrawAPI classes to draw different colored circles.

public class BridgePattern {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
// Implementation
// Have a DrawAPI interface which is acting as a bridge implementer and
// concrete classes RedCircle, GreenCircle implementing the DrawAPI interface.
// Shape is an abstract class and will use object of DrawAPI.
// BridgePattern, our demo class will use Shape class to draw different colored
// circle.
