package AssignmentOne.Q8;

import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        Fixed fixed = new Fixed();
        Dynamic dynamic = new Dynamic();
        fixed.push(10);
        fixed.push(20);
        System.out.println(fixed.pop());
        System.out.println(fixed.pop());
        // System.out.println(fixed.pop());

        dynamic.push(10);
        dynamic.push(20);
        dynamic.push(30);
        System.out.println(dynamic.pop());
        System.out.println(dynamic.pop());
        System.out.println(dynamic.pop());
        // System.out.println(dynamic.pop());
        //
    }
}

interface Stack {
    void push(int x);

    int pop();
}

class Fixed implements Stack {
    private int size = 2;
    private int[] arr = new int[size];
    private int top = -1;

    @Override
    public void push(int x) {
        if (this.top + 1 == this.size) {
            System.out.println("Stack overflow");
            return;
        }
        this.arr[++top] = x;
        // TODO Auto-generated method stub

    }

    @Override
    public int pop() {
        if (this.top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        return this.arr[top--];
    }
    // TODO Auto-generated method stub

}

class Dynamic implements Stack {
    private int size = 1;
    private int[] arr = new int[this.size];
    private int top = -1;

    @Override
    public void push(int x) {
        if (this.top + 1 == this.size) {
            this.size++;
            this.arr = Arrays.copyOf(this.arr, this.size);
        }
        this.arr[++top] = x;
        // TODO Auto-generated method stub

    }

    @Override
    public int pop() {
        if (this.top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top--];
    }
}
