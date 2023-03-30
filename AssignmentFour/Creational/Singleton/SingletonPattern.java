package AssignmentFour.Creational.Singleton;

public class SingletonPattern {
    public static void main(String[] args) {

        // illegal construct
        // Compile Time Error: The constructor SingleObject() is not visible
        // SingleObject object = new SingleObject();

        // Get the only object available
        SingleObject object = SingleObject.getInstance();

        // show the message
        object.showMessage();
    }
}
// Implementation:
// Create a SingleObject class. SingleObject class have its constructor as
// private and have a static instance of itself.
// SingleObject class provides a static method to get its static instance to
// outside world.
// SingletonPattern, our demo class will use SingleObject class to get a
// SingleObject object.
