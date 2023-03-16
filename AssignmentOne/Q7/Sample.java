package AssignmentOne.Q7;

import java.lang.Math;

public class Sample {
    public static void main(String[] args) {
        Circle circle = new Circle(20);
        circle.calculateArea();

        Square square = new Square(30);
        square.calculateArea();

        Triangle triangle = new Triangle(20, 10, 16);
        triangle.calculateArea();

        Sphere sphere = new Sphere(10);
        sphere.calculateArea();
        sphere.calculateVolume();

        Cuboid cuboid = new Cuboid(10);
        cuboid.calculateArea();
        sphere.calculateVolume();
    }
}

interface CalcArea {
    public void calculateArea();
}

interface CalcVolume {
    public void calculateVolume();
}

class Circle implements CalcArea {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("The area of circle is " + 3.14 * radius * radius);
    }

}

class Square implements CalcArea {
    private double radius;

    Square(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("The area of square is " + radius * radius);
    }

}

class Triangle implements CalcArea {
    private double s1, s2, s3;

    Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public void calculateArea() {
        double side = (s1 + s2 + s3) / 2;
        double area = Math.sqrt(side * (side - s1) * (side - s2) * (side - s3));
        System.out.println("The area of Triangle is " + area);
    }
}

class Sphere implements CalcArea, CalcVolume {
    private double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("The area of sphere is " + 3.14 * radius * radius);
    }

    @Override
    public void calculateVolume() {
        System.out.println("The volume of sphere is " + 1.33 * 3.14 * radius * radius * radius);
    }

}

class Cuboid implements CalcArea, CalcVolume {
    private double radius;

    Cuboid(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("The area of sphere is " + this.radius * this.radius);
    }

    @Override
    public void calculateVolume() {
        System.out.println("The volume of sphere is " + this.radius * this.radius * this.radius);
    }
}