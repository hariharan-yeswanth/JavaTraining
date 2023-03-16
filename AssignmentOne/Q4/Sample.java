package AssignmentOne.Q4;

class Singleton {
    // Static -> it is only to this class.
    // Creating a static variable that is null.
    static Singleton obj = null;

    /**
     * If the object is not created, create it and return it. If it is already
     * created, return it
     * 
     * @return The object is being returned.
     */
    public static Singleton createInstance() {
        if (obj == null) {
            obj = new Singleton();
        }
        return obj;

    }
}

/**
 * The Singleton class is a class that can only have one object (an instance of
 * the class) at a time
 */
public class Sample {
    public static void main(String[] args) {
        // Creating an instance of the Singleton class.
        Singleton s1 = Singleton.createInstance();
        Singleton s2 = Singleton.createInstance();
        System.out.println(s1 == s2);
    }
}