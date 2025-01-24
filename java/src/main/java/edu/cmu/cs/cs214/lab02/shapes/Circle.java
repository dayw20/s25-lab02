package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) throw new IllegalArgumentException("Invalid Radius: Radius must be positive");
        this.radius = radius;
    }
    //setter and getter
    public double getRadius(){
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
