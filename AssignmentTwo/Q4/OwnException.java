package AssignmentTwo.Q4;

public class OwnException {
    public static void main(String[] args) throws Exception {
        try {
            // Creating instance for myException
            MyException myException = new MyException();
            myException.throwMyException();
        } catch (Exception e) {
            System.out.println("Exception catched");
        }
    }
}
