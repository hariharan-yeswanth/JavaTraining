package AssignmentTwo.Q6;

class BaseClass {
    BaseClass() throws Exception {
        throw new Exception();
    }
}

class DerivedClass extends BaseClass {
    DerivedClass() {
        try {

        } catch (Exception e) {
            System.out.println("Exception Catched");
        }
    }
}

public class Sample {
    public static void main(String[] args) throws Throwable {
        DerivedClass derClass = new DerivedClass();
    }
}
