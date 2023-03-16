package AssignmentOne.Q5;

class A {
    A() {
        System.out.println("Constructor A");
    }
}

class B {
    B() {
        System.out.println("Constructor B");
    }
}

class C extends A {
    B objB = new B();
}

public class Sample {
    public static void main(String[] args) {
        C objc = new C();
    }
}
