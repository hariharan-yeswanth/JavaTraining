package AssignmentTwo.Q2;

public class Sample {

    public void mth1() {
        mth2();
        System.out.println("caller");
    }

    public void mth2() {
        try {
            return;
        } catch (Exception e) {
            System.out.println("catch-mth2");
        } finally {
            // Always be Executed
            System.out.println("finally-mth2");
        }
    }

    public static void main(String[] args) {
        // Creating Instance
        Sample s = new Sample();
        s.mth1();
    }
}
